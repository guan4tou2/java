/*
filename:app7_3
feature:Continuously input a series of integers (maximum 10000), each input of a number, the output so far median
date:2020/10/28
version:1.0
*/ 
import java.util.Scanner;
public class app7_3{
    public static void main(String[] args) {
         Scanner scn=new Scanner(System.in);
         int []arr=new int[10000];
         int time=0;
         while(time<10000){
         System.out.println("input x");
         int x=scn.nextInt();
         arr[time]=x;
         time++;
         for (int i = 0; i < time-1; i++)  
        {  
            int index = i;  
            for (int j = i + 1; j < time; j++)
                if (arr[j] < arr[index])
                    index = j;
            int smallerNumber = arr[index];   
            arr[index] = arr[i];  
            arr[i] = smallerNumber;  
        }  

         if(time%2==1)
             System.out.println(arr[time/2]);
         else 
             System.out.println((float)(arr[time/2]+arr[time/2-1])/2);
         }
    }
}
