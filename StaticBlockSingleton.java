/*public class StaticBlockSingleton {
    private static StaticBlockSingleton instance;
    private StaticBlockSingleton(){}
    static{
        try{
            instance =new StaticBlockSingleton();
        }catch(Exception e){
            throw new RuntimeException("Exception occured in creating singleton instance");
        }
    }
    public static StaticBlockSingleton getInstance() {
        return instance;
    }
}*/
/*
name:StaticBlockSingleton
author:wu,guan-ting 40843120
data:2020/11/30
feature:Rectangle
version:1.0
*/ 
class Rectangle2{
    private static int height,width;

    private static Rectangle2 instance;
    private Rectangle2(){}
    static{
        try{
            instance =new Rectangle2();
        }catch(Exception e){
            throw new RuntimeException("Exception occured in creating singleton instance");
        }
    }
    public static void setHeight(int h){height=h;}
    public static void setWidth(int w) {width=w;}
    public static int getHeight() {return height;}
    public static int getWidth() {return width;}
    public static Rectangle2 getInstance(){return instance;}
}
public class StaticBlockSingleton{
    public static void main(String[]args) {
        Rectangle2 one=Rectangle2.getInstance();
        Rectangle2 two=Rectangle2.getInstance();
        one.setHeight(2);
        System.out.println(two.getHeight());
        System.out.println(one);
        System.out.println(two);
    }
    
}