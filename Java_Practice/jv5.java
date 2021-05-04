
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
    public static int q(int a){
        System.out.print(a*2);
        return a;
        
    }

    public static void str(){
        int number = 5;
        String name ="Arijit";
        char charcter ='A';
        float dot = 4.69f;
        System.out.printf("%d%n", number);
        System.out.printf("%s%n", name);
        System.out.printf("%c%n", charcter);
        System.out.printf("%f%n", dot);
        System.out.format("%f", dot);
    } 

    public static String strMethod(){
       /* Scanner sc = new Scanner(System.in);
        System.out.print("Enter the message ");
        String result = sc.nextLine();*/
        String result = "arijit ";
        System.out.printf("This is the output of this message %s\n", result);
        System.out.println(result.length());
        System.out.printf("%s\n",result.toLowerCase());
        System.out.printf("%s\n",result.toUpperCase());
        System.out.printf("%s\n",result.trim());
        System.out.println(result.startsWith(" ar"));
        System.out.println(result.endsWith("t "));
        System.out.println(result.substring(0,2));
        System.out.println(result.replace('a','l'));
        System.out.println(result.replace("ari","lri"));
        System.out.println(result.charAt(2));
        System.out.println(result.indexOf("a"));
        System.out.println(" ");
        String modifieName = "arijit";
        System.out.println(modifieName.indexOf("t",2));
        System.out.println(modifieName.lastIndexOf("t"));
        System.out.println(modifieName.lastIndexOf("t",9));
        System.out.println(modifieName.equals("arijit"));
        System.out.println(modifieName.equalsIgnoreCase("Arijit"));
        return result;
    }
    public static int condition(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int result = sc.nextInt();
        if(result>9){
            System.out.printf("%d%n is The Number",result);
            if(result%2==0){
                System.out.println("Even Number");
            }else{
                System.out.println("Odd Number");
            }
        } else {
           // System.out.print("Samller than 9");
            for(int i=0; i<8; i++){
                System.out.println(i);
            }
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        //strMethod();
       // condition();
       loops();
    }
}