/*
filename:hw1214
author:40843120,wu guan-ting
date:2020/12/14
feature:CShape
*/
class CShape {
    protected static double area;

    public CShape() {

    }

    public double area() {
        area = 0;
        return area;
    }

    public static void largest(CShape shp[]) {
        double large = 0, j;
        int now = 0,csh=0,cci=0,csq=0,ctr=0;
        for (int i = 0; i < shp.length; i++) {
            j = shp[i].area();
            if (large > j) {
                large = j;
                now = i;
            }
            switch(shp[i].toString()){
                case "CShape": csh++; break;
                case "CCircle":cci++;break;
                case "CSquare":csq++;break;
                case "CTriangle":ctr++;break;

            }
        }
        System.out.println("shp[" + now + "] is largest,it's area is " + area);
        if(csh>0)System.out.println("i get CShape and it have "+csh+" objects");
        if(cci>0)System.out.println("i get CCircle and it have "+cci+" objects");
        if(csq>0)System.out.println("i get CSquare and it have "+csq+" objects");
        if(ctr>0)System.out.println("i get CTriangle and it have "+ctr+" objects");
    }

    public String toString(){
        String str="CShape";
        return str;
    }
}

class CCircle extends CShape {
    protected static double pi = 3.14;
    protected double radius;

    public CCircle(double r) {
        radius = r;
    }

    public double area() {
        area = (radius / 2) * (radius / 2) * pi;
        return area;
    }
    public String toString(){
        String str="CCircle";
        return str;
    }
}

class CSquare extends CShape {
    protected double width;

    public CSquare(double r) {
        width = r;
    }

    public double area() {
        area = width * width;
        return area;
    }
    public String toString(){
        String str="CSquare";
        return str;
    }
}

class CTriangle extends CShape {
    private int bottom, height;

    public CTriangle(int b, int h) {
        bottom = b;
        height = h;
    }

    public double area() {
        area = (bottom * height) / 2;
        return area;
    }
    public String toString(){
        String str="CTriangle";
        return str;
    }
}

public class hw1214 {
    public static void main(String[] args) {
        CShape shp[] = new CShape[5];
        shp[0] = new CCircle(12);
        shp[1] = new CCircle(21);
        shp[2] = new CSquare(15);
        shp[3] = new CTriangle(12, 7);
        shp[4] = new CTriangle(3, 18);
        CShape.largest(shp);
    }
}