import java.util.Scanner;
class MyException extends Exception{
    @Override 
    public String toString(){
        return "The input must in Charecter";
    }
    @Override 
    public String getMessage(){
        return "Their is some Exception";
    }
}
class days{
    public void comment(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Message");
        String ip = sc.nextLine();
        int i=1;
        while(i<=100){
            System.out.println(i+": "+ip);
            i++;
        }
    }
}
public class test{
    public static void main(String args []){
        days d = new days();
        d.comment();
        try{
            throw new MyException();
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("The Coing is full run");
        }
    }
}