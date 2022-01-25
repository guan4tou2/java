import java.util.Scanner;

/*
filename:app4_1
author:40843120 wu,guan-ting
feature:寫一程式可以讓使用者輸入三個數字，利用二元運算子、三元運算子 ?: ，將最大值、最小值、中間值找出印在螢幕。注意：不可使用 if 命令。 
data2020/10/12
*/ 
public class app4_1{
    public static void main(String args[]) {
        Scanner scn=new Scanner(System.in);
        int ia,ib,ic;
        int imax,imin,imid;

        System.out.println("input a");
        ia=scn.nextInt();
        System.out.println("input b");
        ib=scn.nextInt();
        System.out.println("input c");
        ic=scn.nextInt();
        
        imax =( ia>ib&&ia>ic )? ia:((ib>ia&&ib>ic)?ib:ic);
        imin =( ia<ib&&ia<ic )? ia:((ib<ia&&ib<ic)?ib:ic);
        imid=((ia>ib&&ib>ic)||(ic>ib&&ib>ia))?ib:(((ia>ic&&ic>ib)||(ib>ic&&ic>ia))?ic:((ic>ia&&ia>ib)||(ib>ia&&ia>ic)?ia:ib));

        System.out.println("imax="+imax);
        System.out.println("imid="+imid);
        System.out.println("imin="+imin);

    }
}
