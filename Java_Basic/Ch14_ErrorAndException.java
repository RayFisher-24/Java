import java.util.Scanner;

//In-build Exception
class illegalException{
  illegalException(int num){
    System.out.println(num);
  }

}

//Custom Exception
class MyThorw extends Exception{

  @Override
  public String toString(){
    return "to String";
  }

  @Override
  public String getMessage(){
    return "get Message";
  }
}

//throws Keyword
class exception{
  public int divide(int a, int b) throws ArithmeticException{
    int result = a/b;
    return result;
  }
}

//4) Modify program in Q3 to throw a custom Exception if max retries are reached. 
class customException extends Exception{

  @Override
  public String toString(){
    return "Syntax Error";
  }

  @Override
  public String getMessage(){
    return "Logical Error";
  }

}

public class Ch14_ErrorAndException {
    public static void main(String[] args) {
    System.out.println("ErrorAndException");
    Scanner sc = new Scanner(System.in);

    //problem-4
    int index;
    int i =0;
    boolean flg = true;
    int [] marks = {4,8,9,2,3};
    while(flg && i <5){
      try{
        customException c = new customException();
        System.out.println("Enter the index");
        index = sc.nextInt();
        System.out.println(marks[index]);
        break;
      } 
      catch (Exception e){
        System.out.println(e.getMessage());
        System.out.println(e);
        i++;
      }
    }

   /* try{
      customException ce = new customException(saveit);
      System.out.println("all Right");
    }
    catch(Exception c){
      System.out.println(c.getMessage());
      System.out.println(c.toString());
    }

    try{
      exception t = new exception();
      int re = t.divide(9,1);
      System.out.println(re);
     
     // throw new throwsException();
    }
    catch(Exception e){
      System.out.println("The Exception is "+e);
    }

    /* //Custom Exception
    if(r<9){
      try{
        throw new MyThorw();
      }catch(Exception e){
       // System.out.println(e.getMessage());
        System.out.println(e);
      }
    }

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
      System.out.println("Array2
       Index Out Of Bounds Exception "+a);
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
    
    1) Write a java program to demonstrate syntax, logical 2 runtime errors.
      int a = 5; //right Syntax
      int b = 5  //Wrong Syntax
      int logicalError = 6/0; //logical error
      int result = 1000-b; //runtime error by users
  
    //2) Write a java program that prints "Arithmetic Exception" during Arithmetic exception and "Illegal Argument Exception" during an Illegal argument exception.
    try{
      double c = a/b;
      System.out.println(c);
    } catch(ArithmeticException e){
      System.out.println("Arithmetic Exception "+e);
    } catch(IllegalArgumentException e){
      System.out.println("Illegal Argument Exception "+e);
    }

    //3) Write a program that allows you to given. If max retries exceed 5 print "errors".  
    
    int index;
    int i =0;
    boolean flg = true;
    int [] marks = {4,8,9,2,3};
    while(flg && i <5){
      try{
        System.out.println("Enter the index");
        index = sc.nextInt();
        System.out.println(marks[index]);
        break;
      } 
      catch (Exception e){
        System.out.println("Invaild Index");
        i++;
      }
    }*/
    System.out.println("end of the code");
    }
}