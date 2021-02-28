//import classes.practice;
//package classes;

class c{
    public int a = 5;
    protected int b = 6;
    private int c = 9;
    int e = 1;
    public void meth(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);   
        System.out.println(e);

    } 
}
class d extends c{

}

//Create three classes calculator , Sc calculator and Hybridcalculator and group them into a package 
//package classes;
class calculator{
    public void calculator(){
        System.out.println("Cacilator");
    }
}
class scCalculator{
    public void scCalculator(){
        System.out.println("SC Calculator");
    }
}
class hybridCalculator{
    public void hybridCalculator(){
        System.out.println("Hybrid Calculator");
    }
}


public class Ch12_Packages { 
    public static void main(String args[]) {
        System.out.println("Ar");
        c cc = new c();
        //cc.meth();
       // System.out.println(cc.a);
        //System.out.println(cc.b);
       // System.out.println(cc.c);   
        //System.out.println(cc.e);

        d dd = new d();
        System.out.println(dd.e);

        calculator c = new calculator();
        c.calculator();
        scCalculator sc = new scCalculator();
        sc.scCalculator();
        hybridCalculator hc = new hybridCalculator();
        hc.hybridCalculator();
    }
}