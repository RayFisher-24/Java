//package testpackages;
import testpackages.test4;

public class usingTestFile { 
    public static void main(String args[]) {
        System.out.println("I am using the package");
        test4 tc = new test4();
        System.out.println(tc.a);
        System.out.println(tc.b);
        System.out.println(tc.c);
        System.out.println(tc.e);
       
   }
}