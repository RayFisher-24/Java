import java.util.Scanner;
public class Ch7_Methods { 
    public static void main(String args[]) { //main method in this Ch7_Methods class
        System.out.println("Methods in Java");

      /*add(5,2);
        multipy(9,1);
        
        int a=5;
        int b=2;
        int c;
        Ch7_Methods obj = new Ch7_Methods(); //We should needs create object 1st then we can call it 
        c = obj.number(a,b); //without use static methods 
        System.out.println(c); // it's print the just value
        fomo("Teertha", 5000, 899);
        smallest(4.0,9.0,6.0);
        Scanner in = new Scanner(System.in);
        System.out.print("Input the first number: ");
        double x = in.nextDouble();
        System.out.print("Input the Second number: ");
        double y = in.nextDouble();
        System.out.print("Input the third number: ");
        double z = in.nextDouble();
        System.out.print("The smallest value is " + smallest(x, y, z)+"\n" );
        
        Scanner in = new Scanner(System.in);
        System.out.print("Input the first number: ");
        double a = in.nextDouble();
        System.out.print("Input the Second number: ");
        double b = in.nextDouble();
        System.out.print("Input the third number: ");
        double c = in.nextDouble();
        System.out.print("The smallest value is " + avg(a,b,c)+"\n" );*/

        Scanner in = new Scanner(System.in);
        System.out.print("Input a string: ");
        String str = in.nextLine();
        System.out.print("The middle character in the string: " + middle(str)+"\n");

    }
    /*//Write a Java method to find the smallest number among three numbers.
    public static double smallest(double x, double y, double z)
    {
        return Math.min(Math.min(x, y), z);
    }

     public static double smallest(double num1, double num2, double num3){
       if (num1>num2){
        if(num1>num3)
        System.out.println("Num1 is greater "+num1);
        }
        if(num2>num1){
            if(num2>num3)
            System.out.println("num2 is greater "+num2);
        }
        if(num3>num1){
            if(num3>num2)
            System.out.println("num3 is greater "+num3);
        }    
    }

    //Write a Java method to compute the average of three numbers.
    public static double avg(double a, double b, double c){

       return (a+b+c)/3;
    }

    //Write a Java method to display the middle character of a string.
    /*a) If the length of the string is odd there will be two middle characters.
    b) If the length of the string is even there will be one middle character.*/
    public static String middle(String str)
    {
        int position;
        int length;
        if(str.length()%2==0)
        {
            position =str.length()/2-1;
            length = 2;
        }
        else
        {
            position = str.lenght()/2;
            length = 1;
        }
        return str.length(position, position+length);
    }

   /* public static void add(int a, int b){ //void used as a return type
        System.out.println(a+b); //a , b is the parameter of the add method
    }

    public static void multipy(int a, int b){
        System.out.println(a*b); //same as add method
    }
    int number(int x, int y){ // number method
        int z; // x,  y, z is just an integer object we have in the Ch7_Methods main class
        if(x>y){
            z=x+y;
        }
        else{
            z=(x+y)*5;
        }
        return z; // return on there where from coming with the value right now z have
    }

    public static void fomo(String a, int ... arr){
        System.out.println("Friend " + a);
        System.out.println("love you ");

        for (int e:arr){
            System.out.println(e + " ");
        }
        
    }
    public static void fomo(String ... arr2){
        for (String e2:arr2){
            System.out.println(e2 + " ");
        }
    }*/

    

    
}