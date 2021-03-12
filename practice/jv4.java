import java.util.Scanner;

public class jv4{
    public static void loopIf(int x){
        if (x<10){
            System.out.println("The Number is "+x);
            if(x==0){
                System.out.println("The Number is equal to Zero");
            }
            else if(x==1){
                System.out.println("The Number is equal to One");
            }
            else{
                System.out.println("The Number is Bigger than one and lesser than ten");
            }
        }
         else if(x==10){
                System.out.println("The Number is equal to ten");
            }
        else{
            System.out.println("May be you Enter Bigger than ten");
        }
    }
    public static void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Length");
        int a = sc.nextInt();
        System.out.println("Enter the Breadth");
        int b = sc.nextInt();
        //rectangle(a,b);
        big(a,b);
    }

    //Take values of length and breadth of a rectangle from user and check if it is square or not.
    public static void rectangle(int x, int y){
        if(x==y){
            System.out.println("it is a square");
        }
        else{
            System.out.println("it is a rectangle");
        }
    }

    //Take two int values from user and print greatest among them.
    public static void big(int x, int y){
       if(x<y){
           int result = y-x;
           System.out.println("Y is "+ result+ " products bigger than X");
       }
       else if(x>y){
           int result = x-y;
           System.out.println("X is "+ result+ " products bigger than Y");
       }
       else{
           System.out.println("Your Enter wrong value");
       }
    }

    public static void main(String args[]) {
        System.out.println("jv4");
        input();

    }
}
