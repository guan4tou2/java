/*
filename:app7_4
feature:There was a year of insufficient power supply in New Zealand. Therefore, the Biyang district was divided into 17 districts in turn. In order to be able to take turns in a fair manner, the decision-maker chose a random number of 5. The zone starts, and the next is zone 6, that is, the power outage is carried out with 5 as the interval, then the 11th and 16th zones, because there are only 17 zones, so start from the beginning, and there is no need to power out again if it has stopped . So I counted 5 times (17, 2, 3, 4, 5), so it was the turn of the 5th district to lose power. The sequence of the entire power outage is:
                   1 6 11 16 5 12 2 9 17 10 4 15 14 3 8 13 7
However, this decision maker felt that using the number 5 seemed unfair, so the public could choose the number n between 2 and 10. Write a program that allows the user to enter the number n, and let the program sequence the area code of the power failure
date:2020/10/29
version:1.0
*/ 
import java.util.Scanner;
public class app7_4{
    public static void main(String[] args) {
        //
        Scanner scn=new Scanner(System.in);
        int a=1,time,area[]={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        System.out.println("your times");
        time=scn.nextInt();
        for(int i=1;i<=17;i++){  //一共停17次，每次區域皆不一樣 
            System.out.print(a+" ");
            area[a]=1; 
            for(int x=1;x<=time;x++){  //計算未停過的區域 
                a=a+1;  
                for(int y=1;y<=17;y++){ //計算已停過電的區域 
                     if (area[a]==1)a=a+1;  
                    if (a==18)a = 1; 
                 }              
            }  
        } //
        
        /*int li[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17};
        int []out=new int [17];
        int time=5,now=0,end;
        for(int i=0;i<17;i++){
            int z=0;
            end=now+time;
            for(;now<=end;now++)
                if(li[now%17]!=0){end++;z++;}
            now--;
            out[i]=li[(end-time-z)%17];
            li[(end-time-z)%17]=0;
        }
        for(int i=0;i<17;i++)
            System.out.print(out[i]+"-");*/
    }
}

