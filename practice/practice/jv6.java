import java.util.Scanner;
public class jv6{
    public static int loops(){
        for(int i=1; i<10; i++){
            System.out.println(i);
        }
        return 1;
    }
    public static String IfElse(){
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
        return null;
    }
    public static void iff(){
        String name = "ArijitMondal";
        if(name.length()==6){
            System.out.println("Well Done");
        }
        else if(name.length()<13){
            System.out.println("gone");
        }else{
            System.out.println("Not Done");
        }
    }

    public static void test(){
        String C = "JAVA";
        String D = "JAVASCRIPT";
        if(C.compareTo(D)<0){
            System.out.println(C.substring(0,4).toLowerCase());
            System.out.println(D.substring(0,10).toLowerCase());
        } 
        else if(C.compareTo(D)>0){
            System.out.println(C.substring(0,4).toLowerCase());
            System.out.println(D.substring(0,10).toLowerCase());
        }
        else {
            System.out.println("Print Wrong in");
        }
    }
    public static void check(){
        String E = "A";
        String F = "A";

        if(E.length()==F.length()){
            System.out.printf("%s%s",E,F);
            System.out.println(" Equals");
        } 
        else if(E.length()>F.length()){
            System.out.printf("%s%n",E);
            System.out.println(" E is Big");
        }

        else{
            System.out.printf("%s%n",F);
            System.out.println(" F is Big");
        }
    }
    public static void e(){
        int ip = 101;
        String s=String.valueOf(ip);
        if(s.length()==100){
            System.out.println("Good job");
        } else {
            System.out.println("Wrong answer");
        }
    }
    public static void loops(int x){
        int z = 1;
        while(z<=5){
            for(int j=1; j<10;j++){
                System.out.println(j);
            }
            break;
        }
        System.out.println("Z is small than the define condition");
    }
    public static void y(){
        int sum=0;
        for(int q=1; q<=4; q++){
            sum = sum+q;
            //System.out.println(sum);
        }
        System.out.println(sum);
    }
    public static void main(String[] args){
        System.out.println("jv6");
        //IfElse();
       //iff();
      // test();    
       //check();
       //e();   
      // loops(4); 
       y();
       while(true){
           System.out.println("A");
           break;
       }
        int x = 2;
        for(long y = 0, z = 4; x < 10 && y < 10; x++, y++) 
        {
            System.out.println(y + " ");
        }
      
        System.out.println(x);
        
    }   
}