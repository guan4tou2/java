class TopLevelClassTwo {
    private static String msg="shine the inner light";
    public NonStaticInnerClass makeInStance(){
        return new NonStaticInnerClass();
    }
    public class NonStaticInnerClass{
        private String string;
        public NonStaticInnerClass(){string=msg;}
        public void printMsg(){System.out.println(string); }
    }
}
public class NonStaticInnerClassEx{
    public static void main(String []args){
        TopLevelClassTwo topRef=new TopLevelClassTwo();
        TopLevelClassTwo.NonStaticInnerClass innerRef1=topRef.makeInStance();
        innerRef1.printMsg();
        TopLevelClassTwo.NonStaticInnerClass innerRef3=topRef.new NonStaticInnerClass();
    }
}
