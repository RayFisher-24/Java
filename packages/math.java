package com.xcode;
class abcd{
    double a = 5.6;
    public double b = 5.7;
    protected double c = 5.8;
    private double d = 5.9;
    public void pack(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
class w extends abcd{
    public void pack(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        //System.out.println(d);
    }
}

public class math{
    public int a;
    public int b;
    public int c;
    public int calculation(int a, int b){
        int result = a+b;
        return result;
    }
    protected int calculation(int a, int b, int c){
        int multiplication = a*b*c;
        return multiplication;
    }
    private int calculation(int a, int b, int c, int d){
        int devied = ((a-b)-(c-d));
        return devied;
    }
    public static void main(String args[]) {
        math c = new math();
        int r = c.calculation(4,2,6,8);
        try{
            System.out.println(r);
        } catch(ArithmeticException a){
            System.out.println(a);
        } 

        w q= new w();
        q.pack();
    }
}