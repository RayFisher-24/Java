import java.util.Scanner;
import java.lang.Math;

interface Circle{
    void Area(double a);
}
interface Cylinder{
    void volume(double radius, double height);
    void surfaceArea(double radius, double height);
    void internalSurface(double radius, double height);
    void height(double height, double area);
    void diameter(double volume, double height);
    void radius(double radius, double area);
}
class drivedCircle implements Circle, Cylinder{

    public void Area(double r){
        double A = Math.PI * r * r;
        System.out.printf("Area of the Circle is %.2f%n", A);
    }
    public void volume(double r, double h){
        double v = Math.PI * r * r * h;
        System.out.printf("Volume: %.2f%n", v);
    }
    public void surfaceArea(double r, double h){
        double s = 2 * Math.PI * r * h + 2 * Math.PI * r * r;
        System.out.printf("Surface Area: %.2f%n", s);
    }
    public void internalSurface(double r, double h){
        double i = 2 * Math.PI * r * h;
        System.out.printf("Internal Surface: %.2f%n", i);
    }
    public void height(double r, double a){
        double h = (a / 2 * Math.PI * r) - r;
        System.out.printf("Height: %.2f%n", h);
    }
    public void diameter(double v, double h){
        Double d = 2 * Math.sqrt(v / Math.PI * h);
        System.out.printf("Diameter: %.2f%n", d);
    }
    public void radius(double h, double v){
        double r = 1/2 * Math.sqrt(h * h + 2 * (v / Math.PI) - (h/2));
        System.out.printf("Radius: %f%n", r);
    }
   /* public void printStates(){
       System.out.println("Volume: "+v+ " Surface Area: "+s+" Internal Surface: "+i+" Radius: "+r+" Height: "+h+" Diameter: "+d);
    }*/
}
class newPractice{
    public static void main(String args[]){
        System.out.println("interface");
       /* System.out.printf("Enter the Number ");
        Scanner sc = new Scanner(System.in);
        double input = sc.nextDouble();*/
        drivedCircle c = new drivedCircle();
        c.Area(4);
        c.volume(4,6);
        c.surfaceArea(4,6);
        c.internalSurface(4,6);
        c.height(3,5);
        c.diameter(7,9);
        c.radius(9,19);
     //c.printStates();

    }
}