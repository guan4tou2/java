import java.util.Scanner;
/*
filename:app5_3
feature:)讓使用者輸入一個數字 num, (a)找出一最大的整數 m, 滿足 m^2 < num, (b)找出最小的整數 n, 滿足 n^2 > num
data2020/10/12
*/ 
public class app5_3{
    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
        double x;
        int m;
        System.err.println("input number:");
        x=scn.nextDouble();

        m=(int)Math.sqrt(x);

        System.err.println("m^2<num,m="+m);
        System.err.println("m^2>num,m="+(m+1));
    }
}
