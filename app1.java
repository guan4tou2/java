/*
name:app1.java
author:wu guan-ting 40843120
data:2021/1/1
feature:interface and implements
*/

interface Function{
    int evaluate(int a);
}

class Half implements Function{//1
    Half(){}
    public int evaluate(int a){
        return a/2;
    }
}

class Polynomial implements Function{//1
    public int j=0,sum;
    public int num[]=new int[10];
    public int ex[]=new int[10];
    Polynomial(){}
    public int evaluate(int x){
        sum=0;
        for(int k=0;k<j;k++){
            int xsum=x;
            for(int i=1;i<ex[k];i++)
                xsum*=x;
            sum+=xsum*num[k];
        }
        return sum;
    }
    void addNonZeroItem(int coef, int exp){
        num[j]=coef;
        ex[j]=exp;
        j++;
    }
}

class Print implements Function{//2
    Print(){}
    public int evaluate(int a){
        return a;
    }
    int[] consoleOutPut(int x[]){
        for(int i=0;i<x.length;i++)
            System.out.print(x[i]+" ");
        return x;
    }
}

public class app1 {
    public static void main(String [] args) {
        Half half=new Half();//1
        int result;
        int a[]=new int [10],b[],c[];
        for(int i=0;i<a.length;i++){
            a[i]=(i+1)*4;
            System.out.print(a[i]+" ");
        }

        b=batchCal(a,half);//1
        System.out.println("\n-----------------------------");

        for(int i=0;i<a.length;i++)//1
            System.out.print(a[i]+" ");

        
        System.out.println("\n-----------------------------");
        Polynomial p=new Polynomial();//1

        p.addNonZeroItem(3, 3);///=24
        p.addNonZeroItem(2, 2);//2*x^2=8
        p.addNonZeroItem(1, 1);//1*x^1=2
        result=p.evaluate(2);//=34
        System.out.print(result);//1

        System.out.println("\n-----------------------------");//2
        Print pt=new Print();
        int arr[]=new int[10];
        for(int i=1;i<=10;i++)
            arr[i-1]=i;

        pt.consoleOutPut(arr);//2.a

        System.out.println("\n-----------------------------");

        c=batchCal(arr,half);
        pt.consoleOutPut(c);//2.b

        System.out.println("\n-----------------------------");

        for(int i=0;i<10;i++)
            c[i]=p.evaluate(arr[i]);
        pt.consoleOutPut(c);// 2.c



    }
    public static int[] batchCal(int a[]){
        Half half=new Half();
        for(int i=0;i<a.length;i++)
            a[i]=half.evaluate(a[i]);
        return a;
    }
    public static int[] batchCal(int a[],Function fun){
        int b[]=new int[a.length];
        for(int i=0;i<a.length;i++)
            b[i]=fun.evaluate(a[i]);
        return b;
    }
}
