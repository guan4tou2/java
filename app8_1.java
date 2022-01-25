/*
filename:app8_1
feature:OrderedList 
date:2020/11/03
version:1.0
*/ 
import java.util.Random;
class OrderedList {
    int array[]=new int[100];
    int x;
    OrderedList(){
        x=0;
    }
public
    void add(int item){
        array[this.x++]=item;
        for (int i = 0; i < x; i++)  
        {  
            int index = i;  
            for (int j = i + 1; j < x; j++)
                if (array[j] < array[index])
                    index = j;
            int smallerNumber = array[index];   
            array[index] = array[i];  
            array[i] = smallerNumber;  
        }  
    }
    void print(){
        for(int i=0;i<this.x;i++)
            System.out.print(array[i]+" ");
        System.out.println();
    }
    int find(int item){
        for(int i=0;i<x;i++)
            if(item==this.array[i])
                return i;
        return -1;
    }
    void remove(int item){
        int y=find(item);
        for(int i=y;i<x;i++){
            array[i]=array[i+1];
        }
        x--;
    }
    OrderedList merge(OrderedList oL) {
        for(int i=0;i<oL.x;i++){
            this.add(oL.array[i]);
        }
        return this;
    }
}
public class app8_1 {
    public static void main(String arg[]) {
        Random r1 = new Random();
        OrderedList b=new OrderedList();
        b.add(r1.nextInt(100));
        b.add(r1.nextInt(100));
        b.add(r1.nextInt(100));
        b.add(r1.nextInt(100));
        b.add(r1.nextInt(100));
        System.out.print("list b: ");
        b.print();
        if(b.find(5)!=-1)
            System.out.println("5 at no."+b.find(5));

        OrderedList c=new OrderedList();
        c.add(r1.nextInt(100));
        c.add(r1.nextInt(100));
        c.add(r1.nextInt(100));
        c.add(r1.nextInt(100));
        c.add(r1.nextInt(100));
        System.out.print("list c: ");
        c.print();
        if(c.find(5)!=-1)
            System.out.println("5 at no."+c.find(5));

        b.merge(c);
        b.print();

    }
}
