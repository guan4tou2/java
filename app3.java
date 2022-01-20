//以 ObjectOutputStream, ObjectInputStream 來記錄與讀取五子棋遊戲的現時狀態，讓你的五子棋遊戲可以支援暫離模式。
import java.io.*;
import java.util.Scanner;

class ChessException extends Exception{}

class Board {
    int size=7;
    String board[][]=new String[size][size];
    Scanner scn=new Scanner(System.in);
    Board(int siz){
        size=siz;
        for(int i=0;i<size;i++)
            for(int j=0;j<size;j++)
                board[i][j]=String.format("%d%d",i,j);
    }
    void showboard(){
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++)
                System.out.print(board[i][j]+" ");
            System.out.println();
        }
    }
}
class ChessBoard extends Board implements Serializable{
    ChessBoard(){
        super(7);
        this.showboard();
    }
    void entry(char c){
        System.out.println(c+" entry number:");
        String str=scn.next();
        if(str.charAt(0)=='#'){
            System.out.println("已存檔暫停");
            returnflag();
        }else
        {
            int i=(int)str.charAt(0)-'0',j=(int)str.charAt(1)-'0';
            board[i][j]=" "+c;
            showboard();
    }
    }
    boolean returnflag(){
        return true;
    }
    boolean amiwin(char c){
        boolean flag=false;
        for(int i=0;i<size;i++){
            for(int j=0;j<size-4;j++){
                if((board[i][j].charAt(1)==board[i][j+1].charAt(1))&&(board[i][j+2].charAt(1)==board[i][j+3].charAt(1))&&(board[i][j+4].charAt(1)==c)){flag=true;break;}
            }
        }
        for(int i=0;i<size-4;i++){
            for(int j=0;j<size-4;j++){
                if((board[i][j].charAt(1)==board[i+1][j+1].charAt(1))&&(board[i+2][j+2].charAt(1)==board[i+3][j+3].charAt(1))&&(board[i+4][j+4].charAt(1)==c)){flag=true;break;}
                if((board[i][j].charAt(1)==board[i+1][j].charAt(1))&&(board[i+2][j].charAt(1)==board[i+3][j].charAt(1))&&(board[i+4][j].charAt(1)==c)){flag=true;break;}
            }
        }
        return flag;
    }
}

public class app3 {
    public static void main(String args[])throws IOException,ClassNotFoundException{
        /*ObjectInputStream ois=new ObjectInputStream(new FileInputStream("file"));
        ChessBoard chessboard=(ChessBoard) ois.readObject();
        ois.close();
        */
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("file"));
        
        ChessBoard chessboard=new ChessBoard();
        while(!chessboard.amiwin('X')&&!chessboard.amiwin('O')){
            chessboard.entry('X');
            chessboard.entry('O');
            if(chessboard.returnflag()){
                oos.writeObject(chessboard);
            }
        }
        if(chessboard.amiwin('X'))
            System.out.println("X win");
        else
            System.out.println("O win");

        oos.flush();
        oos.close();
    }
}
