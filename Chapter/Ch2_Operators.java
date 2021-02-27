import java.util.Scanner;
public class Ch2_Operators { 
    public static void main(String args[]) { 
        System.out.println("Operators");
        
        //What will be the result of the following expression:int a = 7/4 * 9/2
        float a1 = 7/4 * 9/2;//wrong o/p 
        float a2 = 7/4.0f * 9/2.0f;  //right 0/p because we have used f symbol in inting value
        //and also remember / and * had same precedence so, their associativity is left to right
        System.out.println(a1);
        System.out.println(a2);

       //Write a java program to encrypt a grade by adding 8 to it. Decrypt it to show the correct grade.
        char grade = 'B';
        grade = (char)(grade+8);//type casting, because char + int = int and we need a char output
        System.out.println(grade);

        //Decrypting the grade
        grade = (char)(grade-8);
        System.out.println(grade);
        
        //Use comparison operators to find out whether a given number is greater than the user entered number or not.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(a<10);

        //Write the following expression in a java program: v2-u2/2bs
        int v = 10;
        int u = 6;
        int b = 4;
        int s =3;
        int result = (v*2)-(u*2)/(2*b*s);
        System.out.println(result);

        //Find the value of the following expression:int int a = 7*49/7 + 35/7, Value of a?
        int re =7*49/7 + 35/7;
        System.out.println(re);

        //a++ 
        //a--
        int i = 56;
        System.out.println(i++);
        System.out.println(i);
        System.out.println(i++);
        System.out.println(i);
        System.out.println(++i);
    } 
}