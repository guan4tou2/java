/*
filename:app5_2
feature:A number is called a well-ordered number if all of its digits are strictly increasing from left to right.
data2020/10/12
*/ 
public class app5_2{
    public static void main(String args[]){
    int x,y,z;

    for(x=1;x<=9;x++){
        for(y=1;y<=9;y++)
            for(z=1;z<=9;z++)
                if(x<y&&y<z)
                System.out.print(x+""+y+""+z+" ");
        System.out.print("\n");
    }
    
    }
}
