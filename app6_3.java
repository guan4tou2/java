/*
filename:app6_3
feature:Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target. You may assume that each input would have exactly one solution, and you may not use the same element twice. You can return the answer in any order.
data2020/10/19
*/ 
import java.util.Scanner;
public class app6_3{
    public static void main(String args[]) {
        Scanner scn=new Scanner(System.in);
        int[] arr=new int[100];

        System.out.println("input number times");
        int time=scn.nextInt();
        System.out.println("input numbers");
        for(int i=0;i<time;i++)
            arr[i]=scn.nextInt();

        System.out.println("input target");
        int target=scn.nextInt();

        boolean flag=true;
        for(int i=0;i<time;i++)
            for(int j=i+1;j<time;j++)
                if(arr[i]+arr[j]==target){
                    System.out.println("["+i+","+j+"]");
                    flag=false;
                }
            
        if(flag)System.out.println("-1");
        
    }
}
