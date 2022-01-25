/*
filename:app6_5
author:40843120 wu,guan-ting
feature:建立一個下三角形二維陣列，高度 n 由使用者輸入。將數字 1, 2, 3, .... 依照由上到下，由左到右的順序填入此下三角形。使用者可以找尋特定數字 num 出現在此下三角形的位置，程式印出列編號和行編號。
data2020/10/19
*/ 
import java.util.Scanner;
public class app6_5{
    public static void main(String args[]) {
        Scanner scn=new Scanner(System.in);
        int[][] arr=new int[100][100];

        System.out.println("input n");
        int n=scn.nextInt();

        int x=1;
        for(int i=1;i<=n;i++)
            for(int j=1;j<=i;j++){
                arr[i][j]=x;
                x++;
            }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++)
                System.out.print(arr[i][j]+" ");
            System.out.println();
        }

        System.out.println();

        System.out.println("input num");
        int num=scn.nextInt();
        for(int i=1;i<=n;i++)
            for(int j=1;j<=i;j++)
                if(num==arr[i][j])
                    System.out.println("row:"+i+" col:"+j);
                if(num>x)
                    System.out.println("-1");

    }
}
