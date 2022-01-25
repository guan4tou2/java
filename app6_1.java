/*
filename:app6_1
author:40843120 wu,guan-ting
feature:Given an array arr, replace every element in that array with the greatest element among the elements to its right, and replace the last element with -1.
data2020/10/19
*/ 
import java.util.Scanner;
public class app6_1{
    public static void main(String args[]) {
        Scanner scn=new Scanner(System.in);
        int[] arr=new int[100];
        System.out.println("input number times");
        int time=scn.nextInt();
        System.out.println("input numbers");
        for(int i=0;i<time;i++){
            arr[i]=scn.nextInt();
        }

        for(int i=0;i<time;i++){
            int max=0;
            max=arr[i+1];
            for(int j=i+1;j<time;j++){
                if(max<arr[j+1])max=arr[j+1];
                //System.out.print(max+" ");
            }
            arr[i]=max;
        }


        arr[time-1]=-1;
        for(int i=0;i<time;i++)
            System.out.print(arr[i]+" ");
    }
}