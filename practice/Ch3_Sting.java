import java.util.Scanner;
import java.util.Calendar;
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


        //Write a Java program to compare two strings lexicographically. Two strings are lexicographically equal if they are the same length and contain the same characters in the same positions.

        String str1 = "mondal";
        String str2 = "arijit";

        int result = str1.compareTo(str2);
        //System.out.println(result);

        if(result<0)
        {
            System.out.println(str1+" is less than "+str2);
        }
        else if(result == 0)
        {
            System.out.println(str1+" is equal to "+str2);
        }else{
            System.out.println(str1+" is bigger than "+str2);
        }

        // Write a Java program to compare two strings lexicographically, ignoring case differences.
        String str1 = "mondal";
        String str2 = "arijit";

        int result = str1.compareToIgnoreCase(str2);
        //System.out.println(result);

        if(result<0)
        {
            System.out.println(str1+" is less than "+str2);
        }
        else if(result == 0)
        {
            System.out.println(str1+" is equal to "+str2);
        }else{
            System.out.println(str1+" is bigger than "+str2);
        }

        String str1 = "Python and ";
        String str2 = "java";

        String str3 = str1.concat(str2);

       // System.out.println(str1+" "+str2);
        System.out.println(str3);

        // Write a Java program to test if a given string contains the specified sequence of char values
        String str4 = "Python and java ";
        String str5 = "and";
        System.out.println("It's Original string: "+str4);
        System.out.println("char values of sequence: "+str5);
        System.out.println(str5.equals("and"));
        
      
       // Write a Java program to compare a given string to the specified character sequence.
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the String1:");
        String str1 = in.nextLine();
        System.out.println();
        System.out.print("Enter the String2: ");
        String str2 = in.nextLine();

        if (str1==str2){
            System.out.println("true");
        }
        else{
           System.out.println("false");
        }
        
        //Write a Java program to compare a given string to the specified string buffer. 
        String str1 = "exampl.com", str2 = "Example.com";
        StringBuffer strbuf = new StringBuffer(str1);

        System.out.println("Comparing "+str1+" and "+strbuf+" : "+str1.contentEquals(str2));
        System.out.println("Comparing "+str2+" and "+strbuf+" : "+str1.contentEquals(str1));

        //Write a Java program to create a new String object with the contents of a character array.
        char [] arrNum = {'1', '2', '3', '4'};
        String str = String.copyValueOf(arrNum, 0, 2);
        System.out.println(str);
       

        //Write a Java program to check whether a given string ends with the contents of another string.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value ");
        String checkValue = sc.nextLine();

        System.out.println();

        System.out.print("Enter the last value ");
        String checkLastValue = sc.nextLine();

        boolean result = checkValue.endsWith(checkLastValue);
        System.out.println(checkValue  +"is end with "+checkLastValue+" it is "+result); 


        //Write a Java program to check whether two String objects contain the same data.
        String value1 = "Stephen Edwin King";
        String value2 = "Walter Winchell";

        System.out.println(value1.equals(value2));

        //Write a Java program to compare a given string to another string, ignoring case considerations.
         String value1 = "Stephen Edwin King";
        String value2 = "stephen edwin king";

        System.out.println(value1.equalsIgnoreCase(value2));

        // Write a Java program to print current date and time in the specified format.

       // System.out.println(myLocation.getQualifiedCoordinates().getLatitude(););

        Calendar c = Calendar.getInstance();
        System.out.format("%tB %te %tY%n", c,c,c);
        System.out.format("%tl:%tM %tp%n", c, c, c);
    

      //Write a Java program to get the contents of a given string as a byte array.
      String str = "This is a sample string.";

      byte[] byteArr = str.getBytes();
      String newStr = new String(byteArr);
      System.out.println(newStr);

      //Write a Java program to get the contents of a given string as a character array.
        String str = "This is a book";

        char[] arr = new char [] {' ', ' ', ' ',' ',
                                    ' ', ' ', ' ', ' '};

        str.getChars(4,10,arr,2);
        System.out.println(arr);

        //Write a Java program to create a unique identifier of a given string.

        String UUID = "Arijit";

        int hashCode = UUID.hashCode();
        System.out.println(hashCode);

        //Write a Java program to get the index of all the characters of the alphabet.
        String all ="The quick brown fox jumps over the lazy dog.";

        int result = all.indexOf("b");
        System.out.println(result);

        //Write a Java program to get the canonical representation of the string object.

        String str1 = "Java Exercises";
        String str2 = new StringBuffer("Java").append(" Exercises").toString();
        String str3 = str2.intern();

        System.out.println(str1==str2);
        System.out.println(str1==str3);

        // Write a Java program to get the last index of a string within a string.
        String all ="The quick brown fox jumps over the lazy dog";

        int result = all.lastIndexOf("a", all.length() - 1);
        System.out.println(result);

        //Write a Java program to get the length of a given string
        String name = "example.com";

        int length = name.length();
        System.out.println(length);

        //Write a Java program to replace a specified character with another character.
        String name = "Arijit";

        String fanal = name.replace('A', 'R');
        System.out.println(fanal);

        // Write a Java program to replace each substring of a given string that matches the given regular expression with the given replacement.

        String main = "The quick brown fox jumps over the lazy dog.";

        int replaceMain = main.length();
        String result = main.replaceAll("fox", "cat");
        System.out.println(result);

        //Write a Java program to check whether a given string starts with the contents of another string.
        String str = "red is my favorite color";
        
        System.out.println(str.startsWith("red"));

        //Write a Java program to get a substring of a given string between two specified positions.
        String str = "The quick brown fox jumps over the lazy dog.";

        System.out.println(str.substring(9,20));

        //Write a Java program to create a character array containing the contents of a string. 

       String str = "java";

       //convert the above string to a char array.
       char [] arr= str.toCharArray();

       //Display the contents of the char array.
       System.out.println(arr);

       // Write a Java program to convert all the characters in a string to lowercase.
       String str = "The Quick BroWn FoX!";

       System.out.println(str.toLowerCase());

       //Write a Java program to convert all the characters in a string to uppercase.
       String str = "the quick brown fox!";
       System.out.println(str.toUpperCase());

       //Write a Java program to trim any leading or trailing whitespace from a given string.

       String str = " Write a Java program to trim any leading ";

       String result = str.trim();
       System.out.println(str);
       System.out.println(result);


    }   
}