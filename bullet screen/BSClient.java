import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.net.*;
import javax.swing.*;

public class BSClient extends JFrame implements Runnable{
    public static final String HOST = "localhost";
    public static final int PORT = 10000;

    private JTextField tf;
    private JTextArea ta;
    private JPanel pn;
    private JButton bt;

    private Socket sc;
    private BufferedReader br;
    private PrintWriter pw;

    public static void main(String[] args){
        BSClient sm = new BSClient();
    }
    public BSClient(){
        super("client");

        tf = new JTextField();
        pn = new JPanel();
        bt = new JButton("send");

        pn.add(bt);
        add(tf, BorderLayout.NORTH);
        add(pn, BorderLayout.SOUTH);

        bt.addActionListener(new SampleActionListener());
        addWindowListener(new SampleWindowListener());

        setSize(200, 100);
        setVisible(true);

        Thread th = new Thread(this);
        th.start();
    }
    public void run(){
        try{
            sc = new Socket(HOST, PORT);
            br = new BufferedReader(new InputStreamReader(sc.getInputStream()));
            pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(sc.getOutputStream())));

            while(true){
                try{
                    String str = br.readLine();
                }
                catch(Exception e){
                    br.close();
                    pw.close();
                    sc.close();
                    break;
                }
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    class SampleActionListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            try{
                String str = tf.getText();
                pw.println(str);
                pw.flush();
                tf.setText("");
            }
            catch(Exception ex){
                ex.printStackTrace();
            }
        }
    }
    class SampleWindowListener extends WindowAdapter{public void windowClosing(WindowEvent e){System.exit(0);}}
}
