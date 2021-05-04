import java.util.Scanner;

class NegativeException extends Exception{
    @Override
    public String toString(){
        return "The Entering value is Nagetive";
    }
    @Override
    public String getMessage(){
        return "The Entering value is Nagetive";
    }
}
class ArithmeticException extends Exception{
     @Override
    public String toString(){
        return "The Entering value is equal to Zero";
    }
    @Override
    public String getMessage(){
        return "The Entering value is equal to Zero";
    }

}
class IOException extends Exception{
    @Override
    public String toString(){
        return "The value is not Correct";
    }
    @Override
    public String getMessage(){
        return "The value is not Correct";
    }
}
class Excep3{
    public double number(int l, int k) throws IOException{
        if(0<k && k>100){
            throw new IOException();
        } 
        double result = l/k;
        return result;
    }
}
public class Excep2{
    public static void main(String args[]) {
        //Excep2
        try{
            Excep3 ee = new Excep3();
            double r = ee.number(100,5);
            System.out.println(r);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            System.exit(0);
        }
        finally{
            System.out.println("Finally is clean ");
        }
        

        //Excep1
     /*   int i =0;
        while(i<5){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the Number ");
            int io = sc.nextInt();
            i++;
            try{
            Excep1 ee = new Excep1();
            double r = ee.sum(io);
            System.out.printf("The result of 99 by %.2f%n", r);
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
        System.out.println("The Ten Opportunity is END");
        for(int j=0; j<10; j++){ System.out.print(j-j);}*/
    }
}