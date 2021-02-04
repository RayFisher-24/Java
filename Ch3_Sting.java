import java.util.Scanner;
public class Ch3_Sting { 
    public static void main(String args[]) { 
        System.out.println("Sting");
        
       //Write a Java program to convert a string to lowercase.
        String To_loweer = new String("Programming is not Hard"); //Iuput
        System.out.println(To_loweer);
        System.out.println(To_loweer.toLowerCase()); //Output

        //Write a Java program to replace spaces with underscores.
        String Repalce_method = new String("GitHub is best way to Connecteed with Programmers");
        System.out.println(Repalce_method.replace(' ', '_'));

        //Write a Java program to fill in a letter template which looks like below: letter = Dear <|name|>, Thanks a lot Replace <|name|> with a string (some name)
        String latter_name = "Arijit";
        System.out.println("Dear "+latter_name+", Thanks a lot Replace "+latter_name);

        //Sring Methods
        String name ="ArIjt MonDal";
        System.out.println(name.length());
        String save = name.toLowerCase();
        System.out.println(save);
        System.out.println(name.toUpperCase());
        System.out.println(name.startsWith("Ar"));
        System.out.println(name.endsWith("5l"));
        System.out.println(name.substring(2));
        System.out.println(name.charAt(0));
        System.out.println(name.lastIndexOf("j"));
        
        
        //Write a program to format the following letter using escape sequence characters.
        //Letter = Dear Harry, This Java Course is nice. Thanks

        
        //Write a Java program to get the character at the given index within the String.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Name ");
        String name = sc.next();

        int index = name.charAt(0);
        System.out.print((char)index);

        // Write a Java program to get the character (Unicode code point) at the given index within the String.
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Name ");
        String sc = in.next();
        int name = sc.codePointAt(1);

        System.out.println(name);

        //Write a Java program to get the character (Unicode code point) before the specified index within the String
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Name ");
        String sc = in.next();
        int name = sc.codePointBefore(1);

        System.out.println(name);

        //Write a Java program to count a number of Unicode code points in the specified text range of a String.

        String name = "Arijit";
        
        int result = name.codePointCount(1, 10);
        System.out.println(result);


    
    } 
}