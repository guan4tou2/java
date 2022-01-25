import java.util.Scanner;
/*
filename:app5_5
author:40843120 wu,guan-ting
feature:寫一程式可以讓使用者輸入 n, rate, years, (其中 n 代表每年存入之金額，rate代表利率， years 代表儲蓄的年數) 並且計算到期後存款金額為多少？
data2020/10/12
*/ 
public class app5_5{
    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
        int n,years;
        float sum=0;
        float rate;
        
        System.out.println("input rate:");
        rate=scn.nextFloat();
        System.out.println("input years:");
        years=scn.nextInt();
        System.out.println("input money:");
        n=scn.nextInt();
        sum=n;
        for(int i=1;i<years;i++){
            System.out.println("input money:");
            n=scn.nextInt();
            sum=sum*(rate+1)+n;
        }
        System.out.println(sum);;
    }
}