/*
filename:app8_2
author:40843120 wu,guan-ting
feature:Rectangle
date:2020/11/
version:1.0
*/ 
class Rectangle{
    int area;
    int sum=0;
public
    int x,y,width,height;
    Rectangle(){
    }
    Rectangle(int ix,int iy,int w,int h){
        x=ix;y=iy;width=w;height=h;
    }
    void printInfo(){
        System.out.println("x:"+x+" y:"+y+" width:"+width+" height:"+height);
    }
    void printArea(){
        area=width*height;
        System.out.println("Area="+area);
    }
    int intersect(Rectangle A){
        int a=this.x,b=this.y,c=this.x+this.width,d=this.y-this.height;
        int e=A.x,f=A.y,g=A.x+A.width,h=A.y-A.height;
        if(a<g&&g<c){
        System.out.println("1");
            if(b>h&&h>d){
                sum=(a-g)*(h-b);
            }
            else if(b>f&&f>d){
                sum=(a-a)*(f-b);
            }
        }
        else if(a<e&&e<c){
            if(b>h&&h>d){
                    sum=(c-e)*(b-h);
                }
            else if(b>f&&f>d){
                sum=(c-e)*(b-f);
                }
        }
        else sum=-1;

        return this.sum;
    }
}
public class app8_2 {
    public static void main(String arg[]) {
        Rectangle a=new Rectangle();
        a.x=1;a.y=3;a.width=2;a.height=2;

        Rectangle b=new Rectangle(4,6,1,6);

        Rectangle c=new Rectangle();
        c.x=2;c.y=5;c.width=1;c.height=3;

        a.printInfo();
        a.printArea();
        
        b.printInfo();
        b.printArea();

        c.printInfo();
        c.printArea();

        System.out.println("Rectangle intersect:"+a.intersect(c));
    }
}
