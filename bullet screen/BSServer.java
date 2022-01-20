import java.awt.*;
import java.awt.event.*;
import java.awt.geom.Rectangle2D;
import java.awt.font.FontRenderContext;
import java.util.*;
import java.io.*;
import java.net.*;
import javax.swing.*;

class Client extends Thread{
    private Socket sc;
    private BufferedReader br;
    private PrintWriter pw;
    private PanelFrm panel;
    public Client(Socket s,PanelFrm p){
       sc = s;
       panel=p;
    }
    public void run(){
        try{
            br = new BufferedReader(new InputStreamReader(sc.getInputStream()));
            pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(sc.getOutputStream())));
        }
        catch(Exception e){
            e.printStackTrace();
        }
        while(true){
            try{ 
                String str = br.readLine();
                System.out.println(str);
                panel.Add(str);
                pw.flush();
            }
            catch(Exception e){
                try{
                    br.close();
                    pw.close();
                    sc.close();
                    break;
                }
                catch(Exception ex){
                    ex.printStackTrace();
                }
            }
        }
    }
}
class Bullet extends Thread{
    Frame dlg;//Dialog
    Font font;
    FontRenderContext frc = new FontRenderContext(null, false, false);
    Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
    int ScreenW=(int)screen.getWidth();
    int ScreenH=(int)screen.getHeight();
    Label label;
    Rectangle2D r;
    Bullet(Frame frm,String text,float opacity,int fontsize,Color c){
        dlg=new Frame();
        dlg.setAlwaysOnTop(true);
        font=new Font(Font.SANS_SERIF,Font.PLAIN,fontsize);
        r=font.getStringBounds(text, frc);
        label=new Label(text,Label.CENTER);
        label.setForeground(c);
        label.setFont(font);
        dlg.setSize((int)r.getWidth()+10,(int)r.getHeight());
        dlg.add(label);
        dlg.setUndecorated(true);
        dlg.setOpacity(opacity);
    }
    public void run(){
        int height=(int)((Math.random()%ScreenH*1000)-r.getHeight());
        while(height<0)height++;
        while(height>ScreenH-r.getHeight())height--;
        int speed=((int)(Math.random()*10%4+1));
        dlg.setLocation(ScreenW,height);
        dlg.setVisible(true);
        for(int i=ScreenW;i>0-(int)r.getWidth()-5;i-=speed){
            dlg.setLocation(i,height);
        }
        dlg.dispose();
    }
}
class PanelFrm implements AdjustmentListener{
    Frame Panelfrm=new Frame("BSServer");
    Bullet bullet;
    TextArea txa=new TextArea("",4,19,TextArea.SCROLLBARS_VERTICAL_ONLY);
    Font font=new Font(Font.SANS_SERIF,Font.PLAIN,20);
    Label fontsizelb=new Label("FontSize");
    TextField fontsizetf=new TextField("30");
    Button fontset=new Button("Set");
    Button fontcolor=new Button("Choose Font Color");
    Button start=new Button("Start");
    Scrollbar scr=new Scrollbar(Scrollbar.HORIZONTAL);
    int bulletfontsize=30;
    float bulletopacity=0.5f;
    Color c=Color.BLACK;
    boolean flag=false;
    PanelFrm(){
        Panelfrm.setSize(220,380);
        Panelfrm.setVisible(true);
        Panelfrm.setLayout(null);
        fontsizetf.setFont(font);
        fontsizelb.setFont(font);
        fontset.setFont(font);
        fontcolor.setFont(font);
        start.setFont(font);
        fontsizelb.setAlignment(Label.CENTER);
        fontsizelb.setBounds(10,30,80,40);
        fontsizetf.setBounds(100,35,50,30);
        fontset.setBounds(160,35,50,30);
        fontcolor.setBounds(10,70,200,30);
        scr.setBounds(10,105,200,20);
        start.setBounds(20,335,50,30);
        scr.setValues(0,1,1,11);
        scr.addAdjustmentListener(this);
        fontset.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){if(fontsizetf.getText()!=" ")bulletfontsize=Integer.parseInt(fontsizetf.getText());}});
        fontcolor.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){JFrame f = new JFrame();f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);c = JColorChooser.showDialog(f, "Choose Background Color", f.getContentPane().getBackground()); }});
        start.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){flag=true;}});
        txa.setEditable(false);
        txa.setBounds(10,130,200,200);
        txa.setFont(font);
        Panelfrm.add(txa);
        Panelfrm.add(fontsizelb);
        Panelfrm.add(fontsizetf);
        Panelfrm.add(fontset);
        Panelfrm.add(scr);
        Panelfrm.add(fontcolor);
        Panelfrm.add(start);
        Panelfrm.setResizable(false);
        Panelfrm.addWindowListener(new WindowAdapter(){public void windowClosing(WindowEvent e){System.exit(0);}});
    }
    public void adjustmentValueChanged(AdjustmentEvent e){
        bulletopacity=(float)scr.getValue()/10;
    }
    public void Add(String text){
        if(flag){
            bullet=new Bullet(Panelfrm,text,bulletopacity,bulletfontsize,c);
            txa.append(text+"\n");
            bullet.start();
        }
    }
}

public class BSServer{
    public static final int PORT = 10000;
    public static void main(String[] args) {
        PanelFrm panel=new PanelFrm();
        BSServer sm = new BSServer();

        try{
            ServerSocket ss = new ServerSocket(PORT);
            while(true){
                try{
                Socket sc = ss.accept();
                Client cl = new Client(sc,panel);
                cl.start();
                }
                catch(Exception e){
                e.printStackTrace();
                break;
                }
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
