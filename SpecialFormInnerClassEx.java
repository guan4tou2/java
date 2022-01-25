class TLClassA{
    private String msg="TLClassA object ";
    public TLClassA(String objNo){msg=msg+objNo;}
    public void printMessage(){System.out.println(msg);}

    class InnerB{
        private String msg="InnerB object ";
        public InnerB(String objNo){msg=msg+objNo;}
        public void printMessage(){System.out.println(msg);}

        class InnerC{
            private String msg="InnerC object ";
            public InnerC(String objNo){msg=msg+objNo;}
            public void printMessage(){
                System.out.println(msg);
                System.out.println(this.msg);
                System.out.println(InnerC.this.msg);
                System.out.println(InnerB.this.msg);
                InnerB.this.printMessage();
                System.out.println(TLClassA.this.msg);
                TLClassA.this.printMessage();
            }
    
        }
    }
}

public class SpecialFormInnerClassEx {
    public static void main(String[] args) {
        TLClassA a=new TLClassA("1");
        TLClassA.InnerB b=a.new InnerB("1");
        TLClassA.InnerB.InnerC c=b.new InnerC("1");
        c.printMessage();


        TLClassA.InnerB bb=new TLClassA("2").new InnerB("2");
        TLClassA.InnerB.InnerC cc=bb.new InnerC("2");
        cc.printMessage();

        TLClassA.InnerB.InnerC ccc=new TLClassA("3").new InnerB("3").new InnerC("3");
    }
}
