class Earth{
    int a; 
    public int getA(){
        return a;
    }
    public void setA(int a){
        this.a = a;
    }
    void print(){
        System.out.println("This is the prent class");
    }

    public static int sum(int e, int f){
        int add = e+f;
        return add;
    }  
}
class drivedEarth extends Earth{
    int b;

    public int getB(){
        return b;
    }
    public void setB(int b){
        this.b = b;
    }  
}
class e extends drivedEarth{
    
}

class inheritance{
    public static void main(String args[]) {
        Earth e = new Earth();
        e.setA(9);
        System.out.println(e.getA());
        drivedEarth de = new drivedEarth();
        de.setB(8);
        System.out.println(de.getB());
        e a = new e();
       // a.setC(4);
       // System.out.println(a.getC());
        a.print();
        a.setA(66);
        a.setB(69);
        System.out.printf("%d%n%d%n",a.getA(), a.getB());
        System.out.format("%d%n%d%n",a.getA(), a.getB());
        System.out.println(e instanceof Earth);
        System.out.println(e instanceof drivedEarth);
        System.out.println(a.sum(9,8));
    }
}
