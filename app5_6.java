import java.util.Scanner;
/*
filename:app5_6
feature:以 * 印出一個高度為n+1的菱形，其中 n 由使用者輸入
data2020/10/12
*/ 
public class app5_6{
    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
        int ia;
        System.out.println("input number:");
        ia=scn.nextInt();

	    for(int i = 1; i <= ia/2+1; i++){
		    for(int j = 1; j <= (ia/2+1 - i); j++)
                System.out.print(" ");
		    for(int j = 1;j <= (-1 + 2 * i); j++)
                System.out.print("*");
            System.out.print("\n");
	    }
	    for(int i = 1; i <= ia/2; i++){
		    for(int j = 1;j <= i ;j++)
                System.out.print(" ");
		    for(int j = 1;j <= ( ia - 2 * i );j++)
                System.out.print("*");
            System.out.print("\n");
	    }
    }
}
