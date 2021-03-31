import java.util.Scanner;
public class jv6{
    public static int loops(){
        for(int i=1; i<10; i++){
            System.out.println(i);
        }
        return 1;
    }
    public static void main(String[] args){
        System.out.println("jv6");
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        System.out.println(A.length()+B.length()); 
        if(A.compareTo(B)<0){
            System.out.println("No");
            A = A.substring(0,1).toUpperCase() + A.substring(1,A.length());
            B = B.substring(0,1).toUpperCase() + B.substring(1,B.length());
            System.out.println(A+" "+B);
        }else if(A.compareTo(B)==0){
            System.out.println("No");
            A = A.substring(0,1).toUpperCase() + A.substring(1,A.length());
            B = B.substring(0,1).toUpperCase() + B.substring(1,B.length());
            System.out.println(A+" "+B);
        } else {
            System.out.println("Yes");
            A = A.substring(0,1).toUpperCase() + A.substring(1,A.length());
            B = B.substring(0,1).toUpperCase() + B.substring(1,B.length());
            System.out.println(A+" "+B);
        } 
        
    }   
}