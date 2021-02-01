import java.util.Scanner;
public class Basic_Practice { 
    
    public static void main(String args[]) {
       /* Scanner in = new Scanner(System.in);
        System.out.print("Input a string: ");
        String str = in.nextLine();
        System.out.print("The middle character in the string: " + middle(str)+"\n");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the ");
        String str = sc.nextLine();
        System.out.println(vowels(str));

        Scanner in = new Scanner(System.in);
        System.out.print("Input the string: ");
        String str = in.nextLine();

        System.out.print("Number of words in the string: " + count_Words(str)+"\n");*/
        //multi(9);
        //pattern1(4);
       // System.out.print(sumRec(6));
       sumDigits(7);


        

    }

    static void multi(int n){
        for (int i=1;i<=10;i++){
            System.out.format("%d X %d = %d\n",n,i,i*n);
        }
    }

    static void pattern1(int patt){
        for(int i=0; i<patt; i++){
            for(int j=0; j<i+1;j++){
                System.out.print("#");
            }
            System.out.println("");
        }
    }

    static int sumRec(int n){
        if(n==1){
            return 1;
        }
        return n + sumRec(n-1);
    }

    static int sumDigits(long n){
        int result = 0;
        while(n>0){
            result += n%10;
            n /= 10;
        }
        return result;
    }

    


    /* Write a Java method to display the middle character of a string. Go to the editor
    Note: a) If the length of the string is odd there will be two middle characters.
    b) If the length of the string is even there will be one middle character.*/

   /* public static String middle(String str)
    {
        int position;
        int length;
        if(str.length()%2==0){
            position = str.length()/2-1;
            length = 2;
        }
        else {
            position = str.length()/2;
            length =1;
        }
        return str.substring(position, position+length);
    }
    
    //Write a Java method to count all vowels in a string.

    public static int vowels(String str)
    {
        int count=0;
        for (int i=0;i<str.length();i++)

        {
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'|| str.charAt(i) == 'o' || str.charAt(i) == 'u');
         {
            count++;
         }
        }
        return count;
    }

    public static int count_Words(String str)
    {
       int count = 0;
        if (!(" ".equals(str.substring(0, 1))) || !(" ".equals(str.substring(str.length() - 1))))
        {
            for (int i = 0; i < str.length(); i++)
            {
                if (str.charAt(i) == ' ')
                {
                    count++;
                }
            }
            count = count + 1; 
        }
        return count; // returns 0 if string starts or ends with space " ".
    }*/
    
}
