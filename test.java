//import classes.practice;
//package classes;


public class test { 
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
    }
}