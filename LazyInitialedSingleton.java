/*public class LazyInitialedSingleton {
    private static LazyInitialedSingleton instance;
    private LazyInitialedSingleton(){}
    public static LazyInitialedSingleton getInstance() {
        if(instance==null){
            instance=new LazyInitialedSingleton();
        }
        return instance;
    }
}*/
/*
name:LazyInitialedSingleton
author:wu,guan-ting 40843120
data:2020/11/30
feature:Rectangle
version:1.0
*/ 
class Rectangle3{
    private static int height,width;

    private static Rectangle3 instance;

    private Rectangle3(){}
    public static void setHeight(int h){height=h;}
    public static void setWidth(int w) {width=w;}
    public static int getHeight() {return height;}
    public static int getWidth() {return width;}
    public static Rectangle3 getInstance(){
        if(instance==null){
            instance=new Rectangle3();
        }
        return instance;
    }
}
public class LazyInitialedSingleton{
    public static void main(String[]args) {
        Rectangle3 one=Rectangle3.getInstance();
        Rectangle3 two=Rectangle3.getInstance();
        one.setHeight(3);
        System.out.println(two.getHeight());
        System.out.println(one);
        System.out.println(two);
    }
    
}