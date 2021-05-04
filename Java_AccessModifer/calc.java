//Create three classes calculator , Sc calculator and Hybridcalculator and group them into a package 
package cla;
class calculator{
    public void calculator(int a, int b){
        System.out.println("Cacilator " + a+b);
    }
}
class scCalculator{
    public void scCalculator(int a, int b){
        System.out.println("SC Calculator "+ Math.sin(a+b));
    }
}
class hybridCalculator{
    public void hybridCalculator(int a, int b){
        System.out.println("Cacilator " + a+b);
        System.out.println("oth Calculator "+ Math.sin(a+b));
    }
}


public class calc { 
    public static void main(String args[]) {
        System.out.println("Ar");
    }
}