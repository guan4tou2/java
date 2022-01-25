import java.awt.*;
import java.awt.event.*;

public class app_2 extends Frame{
    static int SIZE=8;
    static app_2 frm=new app_2();
    static Label lab[][]=new Label[SIZE][SIZE];
    static int x[]=new int[5];
    static int y[]=new int[5];
    static int xx=0,yy=0;
    public static void main(String[] args) {
        GridLayout grid=new GridLayout(SIZE,SIZE);
        frm.setTitle("snake");
        frm.setSize(500,500);
        frm.setLayout(grid);
        for(int i=0;i<5;i++){
            y[i]=0;
            x[i]=i;
        }
        for(int i=0;i<SIZE;i++){
            for(int j=0;j<SIZE;j++){
                lab[i][j]=new Label();
                lab[i][j].setBackground(Color.BLACK);
                lab[i][j].setSize(frm.getWidth()/SIZE,frm.getHeight()/SIZE);
                frm.add(lab[i][j]);
            }
        }
        frm.addKeyListener(new KeyLis());
        frm.setVisible(true);
        frm.addWindowListener(new WindowAdapter(){public void windowClosing(WindowEvent e){System.exit(0);}});

        lab[y[0]%8][x[0]%8].setBackground(Color.CYAN);
        lab[y[1]%8][x[1]%8].setBackground(Color.CYAN);
        lab[y[2]%8][x[2]%8].setBackground(Color.CYAN);
        lab[y[3]%8][x[3]%8].setBackground(Color.CYAN);
        lab[y[4]%8][x[4]%8].setBackground(Color.CYAN);
    }
    static class KeyLis extends KeyAdapter{
        public void keyPressed(KeyEvent e){
            if(e.getKeyCode()>=37&&e.getKeyCode()<=40){
                xx=x[0];yy=y[0];
                y[0]=y[1];y[1]=y[2];y[2]=y[3];y[3]=y[4];
                x[0]=x[1];x[1]=x[2];x[2]=x[3];x[3]=x[4];
            }
            switch(e.getKeyCode()){
                case 37:
                    if(x[4]==0)
                        x[4]=7;
                    else
                        x[4]=Math.abs(x[4]-1)%8;
                    break;
                case 38:
                    if(y[4]==0)
                        y[4]=7;
                    else
                        y[4]=Math.abs(y[4]-1)%8;
                    break;
                case 39:
                    x[4]=Math.abs(x[4]+1)%8;
                    break;
                case 40:
                    y[4]=Math.abs(y[4]+1)%8;
                    break;
                default:
                    break;
            }
            if(e.getKeyCode()>=37&&e.getKeyCode()<=40){
                lab[yy][xx].setBackground(Color.BLACK);
                lab[y[4]][x[4]].setBackground(Color.CYAN);
            }
        }
    }
}
