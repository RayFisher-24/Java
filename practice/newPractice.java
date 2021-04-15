import java.util.Scanner;

interface Circle{
    void Area(double a);
}
interface Cyclinder{
    void Area(double a);
    void height(double h);
    
}
class drivedCircle implements Circle{

    public void Area(double r){
        double A = Math.PI * r * r;
        System.out.printf("Area of the Circle is %.2f%n", A);
    }
}
class newPractice{
    public static void main(String args[]){
        System.out.println("interface");
        System.out.printf("Enter the Number ");
        Scanner sc = new Scanner(System.in);
        double input = sc.nextDouble();
        Circle c = new drivedCircle();
        c.Area(input);

    }
}