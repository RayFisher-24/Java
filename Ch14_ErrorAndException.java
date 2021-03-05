import java.util.Scanner;

class illegalException{
  illegalException(int num){
    System.out.println(num);
  }

}


public class Ch14_ErrorAndException {
    public static void main(String[] args) {
    System.out.println("ErrorAndException");
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Number");
    int r = sc.nextInt();

    try{
      illegalException ie = new illegalException(r);
    } catch (IllegalArgumentException i){
      System.out.println("Illegal Argument Exception "+i);
    }
    
   //Array Index Out Of Bounds Exception
    int [] arr = {5,9,6,7,8,3};
    System.out.println("Enter the array index");
    int ind = sc.nextInt();

    try{
      System.out.println("The "+ind+" index's Number is "+arr[ind]);
    }catch(ArrayIndexOutOfBoundsException a){
      System.out.println("Array Index Out Of Bounds Exception "+a);
    }catch(Exception z){
      System.out.println("worng value "+z);
    }

    System.out.println("Enter your 1st Number");
    int save1 = sc.nextInt();
    System.out.println("Enter your 2nd Number");
    int save2 = sc.nextInt();

    //Without try-catch
    //double result = save1 / save2;
    //System.out.println(result);

    //With try-catch
    //Arithmetic Exception
    try{
      double result = save1 / save2;
      System.out.println(result);
    } catch(ArithmeticException e){
      System.out.println("Arithmetic Exception is "+e);
    }
    System.out.println("end of the code");
    }
}