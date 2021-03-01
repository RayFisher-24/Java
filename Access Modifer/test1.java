package com.codewithme.shape;
class Rectangle{
    public double length;
    public double width;

    public double Aera(double l, double w){
        double result = w*l;
        System.out.println(result);
        return result;
    }
}
class Square{
    public double side;

    public double Side(double s){
        System.out.println(s*s);
        return s*s;
    }
}
class Circle{
    public double area;

    public double area(double r){
        double result = Math.PI*r*r;
        System.out.println(result);
        return result;
    }
}
class Cylinder extends Circle{
    

}

public class test1 { 
    public static void main(String args[]) {
        System.out.println("This is the test1");
        /*
         You have to create a package named com.codewithharry.shape
         This package should have individual classes for Rectangle, Square, Circle, Cylinder, Sphere
         These classes should use inheritance to properly manage the code!
         Include methods like volume, surface area and getters/setters for dimensions
        */
        Rectangle r = new Rectangle();
        r.Aera(7,9);

        Square s = new Square();
        s.Side(9);

        Circle c = new Circle();
        c.area(9);
        

    }
}