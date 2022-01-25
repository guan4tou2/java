/*
filename:app8_3
author:40843120 wu,guan-ting
feature: MyStack
date:2020/11/
version:1.0
*/ 
class MyStack{
    int []stack=new int [100];
    int stack_top;
    MyStack(){
            stack_top=0;
    }
    void push(int item){
        this.stack[stack_top++]=item;
    }
    void pop(){
        if( stack_top == 0 )
                System.out.println("pop: nothing in stack");
            else
                stack_top--;
            
    }
    void print(){
        for(int i=0;i<stack_top;i++){
            System.out.print(stack[i]+" ");
        }
        System.out.println();
    }
}
public class app8_3 {
    public static void main(String arg[]) {
        MyStack a=new MyStack();
        a.push(5);
        a.push(6);
        a.push(4);
        a.print();

        a.pop();
        a.print();
    }
}
