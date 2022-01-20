/*
name:AccessInTopLevelClass
author:wu,guan-ting 40843120
data:2020/11/23
feature:AccessInTopLevelClass
version:1.0
*/ 
public class AccessInTopLevelClass {
    public void nonStaticMethod(){
        System.out.println("nonstaticMethod in AccessInTopLevelClass");
    }
    private static class NestedTopLevelClass {
        private static int i;
        private int j;
        public static void staticMethod() {
            System.out.println("staticMethod in  NestedTopLevelClass");
        }
        protected static class NestedTopLevelClass1{
            private int k=2000;
            public void onotherNonStaticMethod() {
                int ii=i;
                int kk=k;
                staticMethod();
            }
        public static void main(String[] args) {
            int ii=i;
            staticMethod();
        }
        }
    }
}
