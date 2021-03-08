package com.company;
//import com.company.practice;

class practiceJava{

    public int a = 50;
    protected int b = 90;
    private int c = 80;
    int d = 60;

    public void method(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }

    public int add(int x, int y){
        System.out.println(x+y);
        return x+y;
    }
}

public class practice { 
    public static void main(String args[]) { 
        System.out.println("Welcome");
        practiceJava p = new practiceJava();
        p.add(6,9);
        p.method();
        System.out.println(p.a);
        System.out.println(p.b);
       // System.out.println(p.c);
        System.out.println(p.d);
    }
}