import java.util.Scanner;
/*
filename:app5_4
feature:reverse digit order of an integer given by the user. 
data2020/10/12
*/ 
public class app5_4{
    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
        String s;
        boolean flag =false;
        System.out.print("input number:");
        s=scn.next();

        System.out.println(s);

        
        for(int i=s.length()-1;i>=0;i--){
            char c=s.charAt(i);
            if(s.charAt(i)!='0')
                flag=true;
            if(flag)
                System.out.print(c);
        }
    }
}
