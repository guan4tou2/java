/*
filename:app7_2
feature:tic-tac-toc
date:2020/10/28
version:1.0
*/ 
import java.util.Scanner;
public class app7_2{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        char arr[][]={{' ',' ',' '},{' ',' ',' '},{' ',' ',' '}};
        char c;
        boolean flag=true;
        for(int i=1;i<9;i=i+3)
            System.out.println("|"+i+"|"+(i+1)+"|"+(i+2)+"|");
        for(int x=0;flag;x++){
            if(x%2==1)c='x';
            else c='o';
            System.out.println(c+" input:");
            int input=scn.nextInt();
            switch(input){
                case 1:
                    if(arr[0][0]!=' '){System.out.println("input other");x++;break;}
                    arr[0][0]=c;break;
                 case 2:
                    if(arr[0][1]!=' '){System.out.println("input other");x++;break;}
                    arr[0][1]=c;break;
                case 3:
                    if(arr[0][2]!=' '){System.out.println("input other");x++;break;}
                    arr[0][2]=c;break;
                case 4:
                    if(arr[1][0]!=' '){System.out.println("input other");x++;break;}
                    arr[1][0]=c;break;
                case 5:
                    if(arr[1][1]!=' '){System.out.println("input other");x++;break;}
                    arr[1][1]=c;break;
                case 6:
                    if(arr[1][2]!=' '){System.out.println("input other");x++;break;}
                    arr[1][2]=c;break;
                case 7:
                    if(arr[2][0]!=' '){System.out.println("input other");x++;break;}
                    arr[2][0]=c;break;
                case 8:
                    if(arr[2][1]!=' '){System.out.println("input other");x++;break;}
                    arr[2][1]=c;break;
                case 9:
                    if(arr[2][2]!=' '){System.out.println("input other");x++;break; }
                    arr[2][2]=c;break;
                default:
                    System.out.println("over number");x++;break;
            }
        for(int i=0;i<3;i++)
                System.out.println("|"+arr[i][0]+"|"+arr[i][1]+"|"+arr[i][2]+"|");
        for(int i=0,j=0;j<3;j++)
            if(arr[i][j]==arr[i+1][j]&&arr[i+2][j]==arr[i+1][j]&&(arr[i][j]!=' ')&&(arr[i+1][j]!=' ')&&(arr[i+2][j]!=' '))
                {System.out.println(arr[i][j]+" is win|");flag=false;break;}
        for(int i=0,j=0;i<3;i++)
            if(arr[i][j]==arr[i][j+1]&&arr[i][j+2]==arr[i][j+1]&&(arr[i][j]!=' ')&&(arr[i][j+1]!=' ')&&(arr[i][j+2]!=' '))
                {System.out.println(arr[i][j]+" is win-");flag=false;break;}
        int i=0,j=0;
        if(arr[i][j]==arr[i+1][j+1]&&arr[i+2][j+2]==arr[i+1][j+1]&&(arr[i][j]!=' ')&&(arr[i+1][j+1]!=' ')&&(arr[i+2][j+2]!=' '))
            {System.out.println(arr[i][j]+" is win\\");flag=false;break;}
        if(arr[i][j+2]==arr[i+1][j+1]&&arr[i+2][j]==arr[i+1][j+1]&&(arr[i][j+2]!=' ')&&(arr[i+1][j+1]!=' ')&&(arr[i+2][j]!=' '))
            {System.out.println(arr[i][j]+" is win/");flag=false;break;}
        }
    }
}
