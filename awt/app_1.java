
import java.awt.*;
import java.awt.event.*;

public class app_1 extends Frame implements ActionListener{
    static app_1 frm=new app_1();
    static Button btn=new Button("click");
    static TextArea tet=new TextArea("",2,5,TextArea.SCROLLBARS_NONE);

    public static void main(String[] args) {
        BorderLayout br=new BorderLayout(2,5);
        frm.setSize(200,150);
        frm.setLayout(br);
        btn.addActionListener(frm);
        tet.setEditable(false);
        frm.add(btn,br.WEST);
        frm.add(tet,br.CENTER);
        frm.setVisible(true);
        
    }
    public void actionPerformed(ActionEvent e){
        Button bn=(Button)e.getSource();
        if(bn==btn){
            tet.setText("Button Clicked");
        }
    }
}
