/*public class EagerInitializedSingleton {
    private static final EagerInitializedSingleton instance=new EagerInitializedSingleton(){};
    private EagerInitializedSingleton(){}
    public static EagerInitializedSingleton getInstance() {
        return instance;
    }
}
*/
class Rectangle1{
    private static int height,width;
    private static final Rectangle1 instance=new Rectangle1();

    private Rectangle1(){}
    public static void setHeight(int h){height=h;}
    public static void setWidth(int w) {width=w;}
    public static int getHeight() {return height;}
    public static int getWidth() {return width;}
    public static Rectangle1 getInstance(){return instance;}
}
public class EagerInitializedSingleton{
    public static void main(String[]args) {
        Rectangle1 one=Rectangle1.getInstance();
        Rectangle1 two=Rectangle1.getInstance();
        one.setHeight(1);
        System.out.println(two.getHeight());
        System.out.println(one);
        System.out.println(two);
    }
    
}
