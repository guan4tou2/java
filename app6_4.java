/*
filename:app6_4
feature:Given a string path, where path[i]='N', 'S', 'E', 'W', each representing moving one unit north, south, east, or west, respectively. You start at the origin (0, 0) on a 2D plane and walk on the path specified by path. return True if the path crosses itself at any point, that is, if at any time you are on a location you've previousely visited. Return False otherwise.
data2020/10/19
*/ 
import java.util.Scanner;
public class app6_4{
    public static void main(String args[]) {
        Scanner scn=new Scanner(System.in);
        System.out.println("input 'N','S','E','W'");
        String path=scn.next();

        boolean[][] arr=new boolean[100][100];
        boolean flag=false;

        for(int i=0;i<100;i++)
            for(int j=0;j<100;j++)
                arr[i][j]=false;

        int x=50,y=50;
        arr[x][y]=true;
        for(int i=0;i<path.length();i++)
            switch(path.charAt(i)){
                case 'N':
                    x++;
                    if(arr[x][y])
                        flag=true;
                    arr[x][y]=true;
                    break;
                case 'S':
                    x--;
                    if(arr[x][y])
                        flag=true;
                    arr[x][y]=true;
                    break;
                case 'E':
                    y++;
                    if(arr[x][y])
                        flag=true;
                    arr[x][y]=true;
                    break;
                case 'W':
                    y--;
                    if(arr[x][y])
                        flag=true;
                    arr[x][y]=true;
                    break;
            }

        System.out.println(flag);
    }
}
