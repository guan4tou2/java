/*
filename:app5_1
author:40843120 wu,guan-ting
feature:calculate the value of pi from the infinite series pi 
data2020/10/12
*/ 
public class app5_1{
    public static void main(String args[]){
        double pi=0;
        float j,i;
        boolean x=true;
        for(j=1;j<=200000;j++)
            if(x){
                pi=pi+(4/(j*2-1));
                x=false;
            }
            else{
                pi=pi-(4/(j*2-1));
                x=true;
            }
            
        System.out.println(pi);
    }
}