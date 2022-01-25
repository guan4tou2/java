/*
filename:app5_7
author:40843120 wu,guan-ting
feature:99乘法表
data2020/10/12
*/ 
public class app5_7{
    public static void main(String args[]){
        int i,j;

        for(i=1;i<=9;i=i+2){
            for(j=2;j<=9;j=j+2){
                if(i!=3&&j!=6)
                System.out.print(i+"x"+j+"="+i*j+"  ");}
            System.out.print("\n");
        }
    }
}