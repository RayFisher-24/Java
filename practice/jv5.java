
import java.util.Scanner;
public class jv5{
    public static int abcd(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ");
        int input = sc.nextInt();  

        if(input==2){
            System.out.println("fine");
        }
        else{
            System.out.println("not fine");
        }
        return input;   
    }
    
    static void ef(){
        int q = 9;
        if(q>5){
            for(int i=1; i<10;++i){
                System.out.println(i*3);
            }
        }
    }
    static void qp(){
        System.out.println("the batman");
    }
    public static void main(String[] args) {
        ef();
        qp();
       // abcd();
    }
}
