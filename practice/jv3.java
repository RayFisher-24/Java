import java.util.Scanner;

public class jv3{
    public static int sum(int x, int ...arr){
        int result = x;
        for (int e:arr){
            result += e;
        }
        return result;
    }
    public static void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st Number ");
        int a = sc.nextInt();
        System.out.println("Enter the 2nd Number ");
        int b = sc.nextInt();
        System.out.println("Enter the 3rd Number ");
        int c = sc.nextInt();
        System.out.println("Enter the 4th Number ");
        int d = sc.nextInt();

        System.out.println(sum(a,b,c,d));
    }

    public static double cGPA(int ...arr){
        int total =0;
        for(int e:arr){
            total += e;
            cgpa = total/300;
        }
        return cgpa;
    }
    public static void inputCGPA(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st Number ");
        int a = sc.nextInt();
        System.out.println("Enter the 2nd Number ");
        int b = sc.nextInt();
        System.out.println("Enter the 3rd Number ");
        int c = sc.nextInt();
        
        System.out.println(cGPA(a,b,c));
    }
    
    public static void main(String args[]) {
        System.out.println("jv3");
        
       // input();
       inputCGPA();
        
    }
}