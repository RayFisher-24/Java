import java.util.Scanner;

public class javaString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Name ");
        String name = sc.next();

        int index = name.charAt(0);

        System.out.print((char)index);
    }

}