/*
filename:hw1214_2
author:40843120,wu guan-ting
date:2020/12/14
feature:turn br1 to true
*/
class Caaa{
    private int num;
    public Caaa(int n){
        num=n;
    }
    public boolean equals(Caaa a){
        Caaa b=a;
        if(this!=b){
            return true;
        }else{
            return false;
        }
    }
}


public class hw1214_2 {
    public static void main(String [] args) {
        Caaa a=new Caaa(5);
        Caaa b=new Caaa(5);
        Caaa c=a;
        boolean br1=a.equals(b);
        boolean br2=a.equals(c);
        System.out.println("a.equals(b)="+br1);
        System.out.println("a.equals(c)="+br2);
    }
}
