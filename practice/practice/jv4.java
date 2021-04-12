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

    /*A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
    Ask user for quantity
    Suppose, one unit will cost 100.
    Judge and print total cost for user.*/
    public static void discount(int q){
        //int q=0;
        if((q*100)>1000){
            System.out.println("The Amount discount is "+ (.1*q*100) +" The total Amount "+(q*100-(.1*q*100)));
        } else {
            System.out.println("No discount your amount is "+(.1*q*100));
        }
    }

    /*A company decided to give bonus of 5% to employee if his/her year of service is more than 5 years.
    Ask user for their salary and year of service and print the net bonus amount.*/
    public static void bonus(int x, int y){
        if(x>5){
            System.out.println("The bonus is "+ (y*5/100));
        } else {
            System.out.println("Sorry, you need to work ");
        }
    }
    /*A school has following rules for grading system:
    a. Below 25 - F
    b. 25 to 45 - E
    c. 45 to 50 - D
    d. 50 to 60 - C
    e. 60 to 80 - B
    f. Above 80 - A
    Ask user to enter marks and print the corresponding grade.*/
    public static void schoolGrade(int x){
               
        if(x>25 && x<45){
            System.out.println("Your Grade is E");
        } else if(x>=45 && x<50) {
            System.out.println("Your Grade is D");
        } else if(x>=50 && x<60){
            System.out.println("Your Grade is C");
        } else if(x>=60 && x<80) {
            System.out.println("Your Grade is B");
        } else if(x>=80 && x<=100){
            System.out.println("Your Grade is A");
        } else {
            System.out.println("Your Grade is F");
        }
    }
    //Take input of age of 3 people by user and determine oldest and youngest among them.
    public static void ageForYounger(int x, int y, int z){

        if(x<y && x<z){
            System.out.println("X is the youngest");
        } else if(y<x && y<z){
            System.out.println("Y is the youngest");
        } else if(z<x && z<y){
            System.out.println("Z is the youngest");
        }     
    }
    public static void ageForBigger(int x, int y, int z){

        if(x>y && x>z){
            System.out.println("X is the oldest");
        } else if(y>x && y>z){
            System.out.println("Y is the oldest");
        } else if(z>x && z>y){
            System.out.println("Z is the oldest");
        }      
    }
    /*A student will not be allowed to sit in exam if his/her attendence is less than 75%.
    Take following input from user
    Number of classes held
    Number of classes attended.
    And print
    percentage of class attended
    Is student is allowed to sit in exam or not.*/
    public static void examAllowence(int totalClassesAttend, int totalClassesHeld){
        int percent = (totalClassesAttend / totalClassesHeld) * 100;

        if (percent<75){
            System.out.println("You cannot sit in the exams as your attendance is too low!");
        } else {
            System.out.println("You can sit in the exams as your attendance is fine.");
        }
    }
    /*If
    x = 2
    y = 5
    z = 0
    then find values of the following expressions:
    a. x == 2
    b. x != 5
    c. x != 5 && y >= 5
    d. z != 0 || x == 2
    e. !(y < 10)*/
    public static void condition(){
        int x=2;
        int y = 5;
        int z = 0;
        System.out.println(x == 2);
        System.out.println(x != 5);
        System.out.println(x != 5 && y >= 5);
        System.out.println(z != 0 || x == 2);
        System.out.println(!(y < 10));
    }

    public static void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total Classes Attend");
        int a = sc.nextInt();
        System.out.println("Enter the total Classes Held");
        int b = sc.nextInt();
      /*  System.out.println("Enter the age3");
        int c = sc.nextInt();*/
        //rectangle(a,b);
        // big(a,b);
        // discount(a);
        //bonus(a, b);
       // schoolGrade(a);
       //ageForYounger(a,b,c);
       //ageForBigger(a,b,c);
       // examAllowence(a,b);
    }
    public static void main(String args[]) {
        System.out.println("jv4");
       // input();
       condition();

    }

}
