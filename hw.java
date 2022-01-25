
/*
name:hw
author:wu,guan-ting 40843120
data:2020/11/23
feature:Rectangle
version:1.0
*/ 
class Rectangle{
    private int height;
    private int width;
    private Point pt;
    public Rectangle(int x,int y,int w,int h){
        pt=new Point(x,y);
        width=w;
        height=h;
    }
    public Rectangle(int w,int h,Point po){
        pt=po;
        width=w;
        height=h;
    }
    public Rectangle(){
        height=0;
        width=0;
        pt=new Point(0,0);
    }
    class Point{
        private int x;
        private int y;
        public Point(){
            x=0;
            y=0;
        }
        public Point(int X,int Y){
            x=X;
            y=Y;
        }
        public void point_show(){
            System.out.println("x="+x);
            System.out.println("y="+y);
        }
    }
    public void show(){
        pt.point_show();
        System.out.println("width="+width);
        System.out.println("height="+height);
    }
}


public class hw {
    public static void main(String args[]) {
        //Rectangle rt=new Rectangle(1, 2, 4, 5);
        //rt.show();


        Rectangle r=new Rectangle();
        Rectangle.Point pi=r.new Point(1,2);
        Rectangle rec=new Rectangle(4, 5,pi);
        rec.show();
    }
}
