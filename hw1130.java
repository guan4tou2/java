class GUEST{
    public GUEST(){}
    public static void Discount(int money){
        System.out.println("your discount is "+money*0.9f);
    }
    public static void welcome() {
        System.out.println("welcome to mall");
    }
}
class MEMBER extends GUEST{
    public MEMBER (){}
    public static void Discount(int money){
        System.out.println("your discount is "+money*0.7f);
    }
    public static void service() {
        System.out.println("you can buy car");
    }
}
class VIP extends MEMBER{
    public VIP(){}
    public static void Discount(int money){
        System.out.println("your discount is "+money*0.5f);
    }
    public static void service() {
        System.out.println("you can book you room");
    }
}

public class hw1130{
    public static void main(String[] args) {
        GUEST guest=new GUEST();
        MEMBER member=new MEMBER();
        VIP vip=new VIP();

        guest.welcome();
        guest.Discount(50);
        System.out.println();
        member.welcome();
        member.Discount(50);
        member.service();
        System.out.println();
        vip.welcome();
        vip.Discount(50);
        vip.service();
    }
}