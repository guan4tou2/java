/*
filename:app7_1
feature:印出 1-10000 之間有幾個迴文數字，並將它們每 10 個數字印在一列，輸出到螢幕
date:2020/10/26
version:1.0
*/ 
public class app7_1{
    public static void main(String[] args) {
        int y=0;
        for(int i=1;i<=10000;i++){
            boolean flag=false;
            String s=Integer.toString(i);
            int l=s.length();
            for(int j=0;j<l;j++)
                if(s.charAt(j)==s.charAt(l-j-1))flag=true;
                else {flag=false;break;}
            if(flag){
                System.out.print(s+" ");
                y++;
                if(y%10==0)System.out.println();
            }
        }
    }
}
