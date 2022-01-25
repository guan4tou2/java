/*
filename:app6_2
feature:
data2020/10/19
*/ 
import java.util.Scanner;
public class app6_2{
    public static void main(String args[]) {
        Scanner scn=new Scanner(System.in);
        String s;
        System.out.println("input string");
        s=scn.next();
        char[] arr=new char[100];
        int x=0;
        boolean flag=true;
        for(int i=0;i<s.length();i++){
            switch (s.charAt(i)){
                case '(':
                    arr[x]='(';//40
                    x++;
                    break;
                case '{':
                    arr[x]='{';//123
                    x++;
                    break;
                case '[':
                    arr[x]='[';
                    x++;
                    break;
                case ')':
                    arr[x]=')';
                    x++;
                    break;
                case '}':
                    arr[x]='}';
                    x++;
                    break;
                case ']':
                    arr[x]=']';
                    x++;
                    break;
                default:
                    break;
            }
        }
        for(int i=0;i<x;i++){
            if(arr[i]=='(')
                if(arr[i+1]==')'){
                    i++;//flag=true;
                }
                else if(arr[i+3]==')'){
                    i++;//flag=true;
                }
                else flag=false;
            
            if(arr[i]=='{')
                if(arr[i+1]=='}'){
                    i++;//flag=true;
                }
                else if(arr[i+3]=='}'){
                    i++;//flag=true;
                }
                else flag=false;
            
            if(arr[i]=='[')
                if(arr[i+1]==']'){
                    i++;//flag=true;
                }
                else if(arr[i+3]==']'){
                    i++;//flag=true;
                }
                else flag=false;
        }

        System.out.println(flag);
    }
}
