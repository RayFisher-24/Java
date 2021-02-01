import java.util.Scanner;
public class Condition {   
    public static void main(String args[]) {
   /* //Write a Java program to get a number from the user and print whether it is positive or negative.    
    System.out.println("Enter your Number ");
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();

    if(num>=0){
        System.out.println("It's a Positive Number");
    }
    else if(num<0){
        System.out.println("It's a Negative Number");
    }
    else{
        System.out.println("Wrong input");
    }
     
    //Write a Java program to solve quadratic equations (use if, else if and else)
    double a=1.0;
    double b=5.0;
    double c=1.0;

    double result = b*b-4.0*a*c;

    if(result>0.0){
        double r1 = (-b + Math.pow(result, 0.5))/(2.0*a);
        double r2 = (-b - Math.pow(result, 0.5))/(2.0*a);
        System.out.println("The roots "+r1+" and "+r2);
    }
    else if(result == 0.0){
        double r1 = -b/(2.0*a);
        System.out.println("The root "+r1);
    }
    else{
        System.out.println("No real root");
    }
    
    //Take three numbers from the user and print the greatest number.
    Scanner input = new Scanner(System.in);
    System.out.println("Enter your 1st Number");
    int num1 = input.nextInt();
    System.out.println("Enter your 2nd Number");
    int num2 = input.nextInt();
    System.out.println("Enter your 3rd Number");
    int num3 = input.nextInt();

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

    //Write a Java program that reads a floating-point number and prints "zero" if the number is zero. Otherwise, print "positive" or "negative". Add "small" if the absolute value of the number is less than 1, or "large" if it exceeds 1,000,000.

    //Write a Java program that keeps a number from the user and generates an integer between 1 and 7 and displays the name of the weekday.

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of Day");
    int day = sc.nextInt();

    switch(day){
        case 1:
         System.out.println("Monday");
         break;
        case 2:
         System.out.println("Tuesday");
         break;
        case 3:
         System.out.println("Wednesday");
         break;
        case 4:
         System.out.println("Thusday");
         break;
        case 5:
         System.out.println("Friday");
         break;
        case 6:
         System.out.println("Saturday");
         break;
        case 7:
         System.out.println("Sunday");
         break;      
    }

    //Write a Java program that reads in two floating-point numbers and tests whether they are the same up to three decimal places.
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number1 ");
    float number1 = sc.nextFloat();
    System.out.println("enter the number2 ");
    float number2 = sc.nextFloat();

        number1 = Math.round(number1 * 1000);
        number1 = number1 / 1000;

        number2 = Math.round(number2 * 1000);
        number2 = number2 / 1000;

    if(number1==number2){
        System.out.println("they are same");
    }
    else{
        System.out.println("They are different");
    }
    
    // Write a Java program to find the number of days in a month.

    Scanner input = new Scanner(System.in);
    int dayInMonth =0;
    String monthOfName="unkown";
    
    System.out.println("Input the Month");
    int month = input.nextInt();

    System.out.println("Input the year");
    int year = input.nextInt();

    switch(month){
        case 1:
            monthOfName = "january";
            dayInMonth = 31;
            break;
        case 2:
            monthOfName = "feb";
            if((year%4==0)||(year%100==0)&&(year%400==0)){
                dayInMonth = 29;
            }    
            else{
                dayInMonth = 28;
            }
            break;    
    }
    System.out.println(monthOfName+" "+year+" "+dayInMonth);

    // Write a Java program that takes the user to provide a single character from the alphabet. Print Vowel or Consonant, depending on the user input. If the user input is not a letter (between a and z or A and Z), or is a string of length > 1, print an error message.

    Scanner in = new Scanner(System.in);

    System.out.println("Input an Alphabet");
    String input = in.next().toLowerCase();
   // System.out.println(input);
    
    boolean upperCase = input.charAt(0) >= 65 && input.charAt(0) <=90;
    boolean lowerCase = input.charAt(0) >= 97 && input.charAt(0) <=122;
    boolean vowels = input.equals("a") || input.equals("e") || input.equals("i") || input.equals("o") || input.equals("u");

    if(input.length() > 1){
        System.out.println("Error");
    }
    else if (!(upperCase||lowerCase)){
        System.out.println("Error Not A letter, Enter Upper case");
    }
    else if(vowels){
        System.out.println("input letter is vowel");
    }
    else{
        System.out.println("Consonant");
    }

    // Write a Java program that takes a year from user and print whether that year is a leap year or not.

    Scanner input = new Scanner(System.in);
    System.out.println("Input the year");
    int dayInMonth = 0;
    int year = input.nextInt();

    if((year%4==0)||(year%100==0)&&(year%400==0)){
        dayInMonth = 29;
        System.out.println(dayInMonth);
    }    
    else{
        dayInMonth = 28;
    }

    //Write a program in Java to display the first 10 natural numbers.

    for(int a=1;a<=10;a++){
        System.out.println(a);
    }

    //Write a program in Java to display n terms of natural numbers and their sum.

    Scanner in = new Scanner(System.in);
    System.out.println("Enter the Number");
    int input = in.nextInt();

    int sum = 0;
    for(int i=1; i<=input; i++){
        sum=sum+i;
    }
    System.out.println(sum);
    
    //Write a program in Java to input 5 numbers from keyboard and find their sum and average.
    Scanner in = new Scanner(System.in);

    System.out.println("Enter the 1st Number");
    int a = in.nextInt();

    System.out.println("Enter the 2nd Number");
    int b = in.nextInt();

    System.out.println("Enter the 3rd Number");
    int c = in.nextInt();

    System.out.println("Enter the 4th Number");
    int d = in.nextInt();

    System.out.println("Enter the 5th Number");
    int e = in.nextInt();
    
    int sum = a+b+c+d+e;
    int result = sum/5;
    System.out.println(sum);
    System.out.println(result);

    int [] arr = {1,2,3,4,5};
    int sum=0;

    for(int element:arr){
        sum = sum+element;
    }
    
    System.out.println(sum);
    System.out.println(sum/5);

    int i,n=0,s=0;
    double avg;
    {
        System.out.println("input the 5 numbers");
    }
        for(i=0;i<5;i++){
            Scanner in = new Scanner(System.in);
            n = in.nextInt();

            s +=n;
        }
        avg=s/5;
        System.out.println("The sum of 5 is "+s+" and avg is "+avg);

    //Write a program in Java to display the cube of the number upto given an integer.
    int [] arr = {1,2,3,4};
    int cube;
    for(int e:arr){
        cube = e*e*e;
        System.out.println("The Number is "+cube);
    }

    //Write a program in Java to display the multiplication table of a given integer.

    Scanner table = new Scanner(System.in);
    System.out.println("Enter the number");
    long in = table.nextLong();

    for(int i=1; i<=10; i++){
        System.out.println("The table of "+in+"X"+i+" = "+in*i);
    }

    //Write a program in Java to display the n terms of odd natural number and their sum.
    int sum =0;
    for(int i=0; i<10; i++){
        if(i%2==1){
            sum = sum+i;
            System.out.println("The Number are "+i);
        }  
    }
    System.out.println("The sum of these Number is "+sum);

    //Write a program in Java to display the pattern like right angle triangle with a number.
    int i,j,n, k=1;
    System.out.print("Enter the Number ");
    Scanner sc = new Scanner(System.in);
    n =sc.nextInt();

    for(i=1;i<=n;i++)
    {
        for(j=1;j<=i;j++)
            System.out.print(k++);
        System.out.println(" ");
       
    }

    //Write a program in Java to make such a pattern like right angle triangle with a number which will repeat a number in a row.The pattern is as follows
    
    int i,j,n,s,x;
    System.out.print("Input ");
    Scanner in = new Scanner(System.in);
        n=in.nextInt();

        s=n+4-1;
        for(i=1;i<=n;i++)
        {
        for(x=s;x!=0;x--)
        {
         System.out.print(" ");
        }
        for(j=1;j<=i;j++)
        {
            System.out.print(i+" ");
        }
        System.out.println();
        s--;
        }

        //Write a program in Java to print the Floyd's Triangle.
        int i,j,n, k=1;
        System.out.print("Enter the Number ");
        Scanner sc = new Scanner(System.in);
        n =sc.nextInt();

        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++)
                System.out.print(k++); 
            System.out.println(" ");
        }

        //Write a Java program that reads an integer and check whether it is negative, zero, or positive.
        int i,x;
        System.out.print("Enter the Number ");
        Scanner sc = new Scanner(System.in);
        x =sc.nextInt();

        if(x>0){
            System.out.println("Positive");
        }
        else if(x<0){
            System.out.println("Negative");
        }
        else{
            System.out.println("Zero");
        }

        //Write a Java program that reads a floating-point number. If the number is zero it prints "zero", otherwise, print "positive" or "negative". Add "small" if the absolute value of the number is less than 1, or "large" if it exceeds 1,000,000.
        int i,x;
        System.out.print("Enter the Number ");
        Scanner sc = new Scanner(System.in);
        x =sc.nextInt();

        if(x>0){
            if(x<1){
                System.out.println("Positive small");
            }
            else if(x>1000000){
                System.out.println("Positive large");
            }
            else{
                System.out.println("Positive");
            }
        }
        else if(x<0){
            if(Math.abs(x)<1){
                System.out.println("Negitive small");
            }
            else if(Math.abs(x)>1000000){
                System.out.println("Negitive large ");
            }
            else{
                System.out.println("Negitive");
            }
        }
        else{
            System.out.println("zero");
        }*/
        
        //Write a Java program that reads an positive integer and count the number of digits the number (less than ten billion) has. 
       
        
    }

    
}
