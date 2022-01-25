/*public class BillPushSingleton {
    private BillPushSingleton(){}
    private static class SingletonHelper {
        private static final BillPushSingleton INSTACE=new BillPushSingleton();
    }
    public static BillPushSingleton getInstance() {
        return SingletonHelper.INSTACE;
    }
}*/
/*
name:BillPushSingleton
author:wu,guan-ting 40843120
data:2020/11/30
feature:Rectangle
version:1.0
*/ 
class Rectangle4{
    private static int height,width;
    private Rectangle4(){}
    private static class Rectangle4Helper{
        private static final Rectangle4 INSTACE=new Rectangle4();
    } 

    public static void setHeight(int h){height=h;}
    public static void setWidth(int w) {width=w;}
    public static int getHeight() {return height;}
    public static int getWidth() {return width;}
    public static Rectangle4 getInstance(){return Rectangle4Helper.INSTACE;}
}
public class BillPushSingleton{
    public static void main(String[]args) {
        Rectangle4 one=Rectangle4.getInstance();
        Rectangle4 two=Rectangle4.getInstance();
        one.setHeight(4);
        System.out.println(two.getHeight());
        System.out.println(one);
        System.out.println(two);
    }
    
}