/*
filename:app8_4
author:40843120 wu,guan-ting
feature:MyVector
date:2020/11/
version:1.0
*/ 
class MyVector{
    int []arr=new int [4];
    int sum;
    double len,dsum;
    MyVector(int a,int b,int c,int d){
        arr[0]=a;arr[1]=b;arr[2]=c;arr[3]=d;
        sum+=a*a+b*b+c*c+d*d;
        len=Math.sqrt(sum);
    }
    MyVector(int a,int b,int c){
        arr[0]=a;arr[1]=b;arr[2]=c;
        sum+=a*a+b*b+c*c;
        len=Math.sqrt(sum);
    }
    int InnerProduct(MyVector b){
        sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=this.arr[i]*b.arr[i];
        }
        return sum;
    }
    double Cos(MyVector b){
        dsum=this.InnerProduct(b)/(this.len*b.len);
        return dsum;
    }
}
public class app8_4 {
    public static void main(String arg[]) {
        MyVector a=new MyVector(1,2,3);
        System.out.println("|a|="+a.len);

        MyVector b=new MyVector(4,5,6);
        System.out.println("|b|="+b.len);

        int x=a.InnerProduct(b);
        System.out.println("a*b="+x);

        double y=a.Cos(b);
        System.out.println("cos(theta)="+y);

    }
}
