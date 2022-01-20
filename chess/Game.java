import java.util.Scanner;

class Board{
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
class ChessBoard extends Board{
    ChessBoard(){
        super(7);
        this.showboard();
    }
    void entry(char c){
        System.out.println(c+" entry number:");
        String str=scn.next();
        int i=(int)str.charAt(0)-'0',j=(int)str.charAt(1)-'0';

        board[i][j]=" "+c;
        showboard();
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
class NumBoard extends Board{
    Scanner scn=new Scanner(System.in);
    NumBoard(){
        super(4);
        this.board[3][3]="  ";
        this.showboard();
    }
    void start(){

    }
    void move(){
        char c=scn.next().charAt(0);
        switch(c){
            case 'w':
                break;
            case 'a':
                break;
            case 's':
                break;
            case 'd':
                break;
        }
    }
}
class ImgBoard extends Board{
    ImgBoard(){
        super(5);
        this.board[4][4]="  ";
        this.showboard();
    }
    void start(){

    }
    void move(){
        char c=scn.next().charAt(0);
        switch(c){
            case 'w':
                break;
            case 'a':
                break;
            case 's':
                break;
            case 'd':
                break;
        }
    }
}
class Game{
    public static void main(String args[]) {
        
        /*ChessBoard chessboard=new ChessBoard();
        while(!chessboard.amiwin('X')&&!chessboard.amiwin('O')){
            chessboard.entry('X');
            chessboard.entry('O');
        }
        if(chessboard.amiwin('X'))
            System.out.println("X win");
        else
            System.out.println("O win");
        */

        NumBoard numboard=new NumBoard();


    }
}
