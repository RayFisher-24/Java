import java.util.Scanner;
<<<<<<< HEAD
import java.util.*;
=======
//import java.util.Random;
>>>>>>> 3d78938771256259f992b21d465b35cf86b9fcc4


class Random{
    private int num;

    public Random(int num){
        this.num = num;
    }
    public int takeUserInput(){
        return num;
    }
<<<<<<< HEAD
=======
   /* public double [] list(){
        anArray = new double[10];
        for(int i=0; i<anArrary.length;i++){
            anArrary[i] = randomFill();
        }
        return anArrary;
    }*/
>>>>>>> 3d78938771256259f992b21d465b35cf86b9fcc4
}

public class randomNum { 
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Random Number ");
        int result = sc.nextInt();

<<<<<<< HEAD
        Random rm = new Random(result);
        //generate the random number
        int min = 50;
        int max = 100;

        //Generate random int value from 50 to 100 
        System.out.println("Random value in int from "+min+" to "+max+ ":");
        int random_int = (int)(Math.random() * (max - min + 1) + min);
        System.out.println(random_int==rm.takeUserInput());
        System.out.println("the real number is "+random_int);
=======
        //generate the random number
        randomNum rand = new randomNum();
        int rand_int1 = rand.nextInt();

        Random rm = new Random(result);
        int rmNum = 69;
        System.out.println("The real number is "+rmNum);
        System.out.println(rmNum==rm.takeUserInput());
>>>>>>> 3d78938771256259f992b21d465b35cf86b9fcc4

    }
}