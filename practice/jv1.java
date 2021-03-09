class use{
    private String name;
    private int id;

    public use(){
        name = "Arijit";
    }
    
    public use(String myName){
        name = myName;
    }

    public use(String myName, int i){
        name = myName;
        id = i;
    }

    public void setNum(String n){
        this.name = n;
    }
    public String getNum(){
        return name;
    }

    public void setId(int i){
        this.id = i;
    }
    public int getId(){
        return id;
    }
    

}

public class jv1 { 
    public static int test(int a, int b){
        System.out.println(a+b);
        return a+b;
    }

    public static double test2(int x, int y){
        double i=0;
        
        while(i<=100){
            double r = x*y*i;
            System.out.println("This is your number "+r);
            i++;
        }
        return 1;
    }

    //1.Write a Java program to round up the result of integer division.
    public static void devision(int a, int b, int c){
        int result = (a+b+c);
        int finalResult = result*100/result;
        System.out.println(finalResult);
    }

    //2. Write a Java program to get whole and fractional parts from a double value.
    public static void Double(int e, int f){
        double sum = e*f*e*f;
        System.out.println(sum);
    }

    //3. Write a Java program  to get sum of two number and print that number odd or a even number.
    public static double sum(int r, int s){
        double i = 8;
        double result = r*s;
        if(i<result){
            System.out.println(result);
            if(result%2==0){
                System.out.println("evn Number");
            } else {
                System.out.println("odd Number");
            }
        } else {
            System.out.println("smaller");
        }
        return 1;
    }

    //4. Write a program that reads in two doubles and prints out their quotient.
    public static void quotient(double i, double j){
        double quotientOfIJ = i/j;
        System.out.println(quotientOfIJ);
    }

    /*5. Write a program, TrigValues.java, that reads in a double (an angle measure in degrees, not radians!) and prints out the sine, cosine, tangent, secant, cosecant, and cotangent for that angle.
    Hint #1:  For this, you will need Math.sin(x), Math.cos(x), and Math.tan(x).
    Hint #2:  These Math functions accept angles in radians, not degrees.  You'll have to do something about that!
    Hint #3:  You do not have to gracefully handle division-by-zero, (such as the cot(0)), though it may be interesting to see what your program does in this case.*/
    
    public static void MAth(int l){
        double degrees = l;

        double radians = Math.toRadians(degrees);
        double sinValue = Math.sin(radians);
        System.out.println("sin(" + degrees + ") = " + sinValue);
    }
    
    public static void MAth2(int k){
        double degrees = k;

        double radians = Math.toRadians(degrees);
        double cosValue = Math.cos(radians);

        System.out.println("cos("+degrees+")="+cosValue);
    }
    
    /*6. Write a program, QuadraticRoots.java, that reads in three doubles a, b, and c -- the coefficients of a quadratic equation y = ax2 + bx + c -- and prints out the two zeroes as found by the Quadratic Formula.
    Hint #1:  For this, you will need Math.sqrt(x), which computes the square root of its argument.
    Hint #2:  You may assume that the equation has two roots (though it may be interesting to see what your program does when the input only has one or zero roots).*/
    public static double ABC(int a, int b, int c){
        
        double x = 2;
        return a*Math.sqrt(x) + b*x + c;
    }

    //7. Java Program to Find the Roots of Quadratic Equation
    public static double quadratic(int a, int b, int c){
        return ((-b) - Math.sqrt(b) - 4*a*c)/2*a;
       // return ((-b) + Math.sqrt(b) - 4*a*c)/2*a;
    }
    //8. Java Program to Print Armstrong Number from 1 to 1000
    public static void armstrong(){
        int n, count = 0, a, b, c, sum = 0;
        System.out.print("Armstrong numbers from 1 to 1000:");
        for(int i = 1; i <= 1000; i++)
        {
            n = i;
            while(n > 0)
            {
                b = n % 10;
                sum = sum + (b * b * b);
                n = n / 10;
            }
            if(sum == i)
            {
                System.out.print(i+" ");
            }
            sum = 0;
        }

    }

    public static void main(String args[]) { 
        System.out.println("jv1");
        
        jv1 j = new jv1();
        j.test(4,8);
       // j.test2(7,9);

       //1
        j.devision(8,1,1);

        //2
        j.Double(93,97);

        //3
        j.sum(4,4);

        //4
        j.quotient(99.0,3.0);

        //5
        j.MAth(90);
        j.MAth2(1);

        //6
        System.out.println( j.ABC(7,7,7));

        //7
        System.out.println(j.quadratic(2,4,21));

        //8
        j.armstrong();




       /*   use u = new use("arijit", 100);
        
      //Private
        u.setNum("Arijit");
        System.out.println("My name is " + u.getNum());

        //protected
        u.sub = "java";
        System.out.println("I Learn " + u.sub);

        System.out.println("My name is " +u.getNum());
        System.out.println("The id is "+u.getId());*/



    }
}