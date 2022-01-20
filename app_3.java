/*name:app_3
author:wu guan ting 40843120
date:2021/05/21*/

import java.awt.*;
import java.awt.event.*;

public class app_3 extends Frame{
    static int SIZE=10;
    static app_3 frm=new app_3();
    static Label lab[][]=new Label[SIZE][SIZE];
    static boolean labbool[][]=new boolean[SIZE][SIZE];
    static int x=3;
    static int y=3;
    static int flag=0;
    public static void main(String[] args) {
        GridLayout grid=new GridLayout(SIZE,SIZE);
        frm.setTitle("snake");
        frm.setSize(500,500);
        frm.setLayout(grid);
        for(int i=0;i<SIZE;i++){
            for(int j=0;j<SIZE;j++){
                labbool[i][j]=true;
                lab[i][j]=new Label();
                lab[i][j].setBackground(Color.YELLOW);
                lab[i][j].setSize(frm.getWidth()/SIZE,frm.getHeight()/SIZE);
                frm.add(lab[i][j]);
            }
        }
        frm.addKeyListener(new KeyLis());
        frm.setVisible(true);
        frm.addWindowListener(new WindowAdapter(){public void windowClosing(WindowEvent e){System.exit(0);}});

        labbool[x-1][y]=false;
        labbool[x][y-1]=false;
        labbool[x][y]=false;
        labbool[x][y+1]=false;
        for(int i=0;i<SIZE;i++){
            for(int j=0;j<SIZE;j++){
                if(labbool[i][j])
                    lab[i][j].setBackground(Color.YELLOW);
                else
                    lab[i][j].setBackground(Color.RED);
            }
        }
    }
    static class KeyLis extends KeyAdapter{
        public void keyPressed(KeyEvent e){
            for(int i=0;i<SIZE;i++)
                for(int j=0;j<SIZE;j++)
                    labbool[i][j]=true;

            switch(e.getKeyCode()){
                case 37:
                    y--;
                    break;
                case 38:
                    flag++;
                    System.out.println(flag%4);
                    break;
                case 39:
                    y++;
                    break;
                case 40:
                    x++;
                    break;
                default:
                    break;
            }
            if(flag%4==0){
                labbool[x-1][y]=false;
                labbool[x][y-1]=false;
                labbool[x][y]=false;
                labbool[x][y+1]=false;
            }
            if(flag%4==1){
                labbool[x][y]=false;
                labbool[x+1][y]=false;
                labbool[x-1][y]=false;
                labbool[x][y+1]=false;
            }
            if(flag%4==2){
                labbool[x][y-1]=false;
                labbool[x][y]=false;
                labbool[x][y+1]=false;
                labbool[x+1][y]=false;
            }
            if(flag%4==3){
                labbool[x][y]=false;
                labbool[x-1][y]=false;
                labbool[x][y-1]=false;
                labbool[x+1][y]=false;
            }
            for(int i=0;i<SIZE;i++){
                for(int j=0;j<SIZE;j++){
                    if(labbool[i][j])
                        lab[i][j].setBackground(Color.YELLOW);
                    else
                        lab[i][j].setBackground(Color.RED);
                }
            }
        }
    }
}