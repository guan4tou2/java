import java.util.Scanner;

/*
filename:app3_3
author:40843120 wu,guan-ting
feature:
data2020/10/05
*/ 
public class app3_3{
    public static void main(String args[]) {
        Scanner scn=new Scanner(System.in);
        float fMx,fMy,fNx,fNy;
        double dD;

        System.out.println("input point M's x");
        fMx=scn.nextFloat();
        System.out.println("input point M's y");
        fMy=scn.nextFloat();
        System.out.println("input point N's x");
        fNx=scn.nextFloat();
        System.out.println("input point N's y");
        fNy=scn.nextFloat();

        System.out.println("point M's x is:"+fMx);
        System.out.println("point M's y is:"+fMy);
        System.out.println("point N's x is:"+fNx);
        System.out.println("point N's y is:"+fNy);

        dD=Math.sqrt(((fMx-fNx)*(fMx-fNx)+(fMy-fNy)*(fMy-fNy)));
        System.out.println("the distance between them is:"+dD);

        float fM;
        fM=(fNy-fMy)/(fNx-fMx);
        System.out.println("y="+fM+"x-"+(fM*fMx+fMy));
    }
}