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

    
    public static void main(String args[]) {
        System.out.println("jv3");
        
       // input();
       cGPA();
       
        
    }
}