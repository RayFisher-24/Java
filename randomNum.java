import java.util.Scanner;
//import java.util.Random;


class Random{
    private int num;

    public Random(int num){
        this.num = num;
    }
    public int takeUserInput(){
        return num;
    }
   /* public double [] list(){
        anArray = new double[10];
        for(int i=0; i<anArrary.length;i++){
            anArrary[i] = randomFill();
        }
        return anArrary;
    }*/
}

public class randomNum { 
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Random Number ");
        int result = sc.nextInt();

        //generate the random number
        randomNum rand = new randomNum();
        int rand_int1 = rand.nextInt();

        Random rm = new Random(result);
        int rmNum = 69;
        System.out.println("The real number is "+rmNum);
        System.out.println(rmNum==rm.takeUserInput());

    }
}