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
    static void cGPA(){
        int a = 45;
        int b = 95;
        int c = 48;
        int cgpa = (a+b+c);
        float result = (int)(cgpa/30);
        System.out.println(result);
        //System.out.println(cgpa);
    }
    public static double cGPAr(int ...arr){
       int result =0;
       
        for(int e:arr){
           result +=e;
        }
        System.out.println("The cgpa is "+result/30);
       return result;
    }
    
    public static void addCGPA(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Sub1 ");
        int a = s.nextInt();
        System.out.println("Enter the Sub2 ");
        int b = s.nextInt();
        System.out.println("Enter the Sub3 ");
        int c = s.nextInt();
        cGPAr(a,b,c);
    }

    public static int operator(int ...arr){
        int r = 0;
        for (int e:arr){
            r +=e;
        }
        return r;
    }
    public static void inputForOperator(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the 1 ");
        int a = s.nextInt();
        System.out.println("Enter the 2 ");
        int b = s.nextInt();
        System.out.println("Enter the 3 ");
        int c = s.nextInt();
        System.out.println( operator(a,b,c));
    }

    public static void add(int x){
        int e = x;
        for(int i=1; i<=e; i++){
            System.out.println("The Number is "+i*9);
        }
    }
    public static void ioOfAdd(){
        Scanner se = new Scanner(System.in);
        System.out.println("Enter the Number ");
        int a = se.nextInt();
        add(a);
    }

    public static void main(String args[]) {
        System.out.println("jv3");
        
       // input();
     // cGPA();
     // addCGPA();
     ioOfAdd();
       
        
    }
}