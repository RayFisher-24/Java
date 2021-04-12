class Earth{
    int a; 
    public int getA(){
        return a;
    }
    public void setA(int a){
        this.a = a;
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

class inheritance{
    public static void main(String args[]) {
        Earth e = new Earth();
        e.setA(9);
        System.out.println(e.getA());
        drivedEarth de = new drivedEarth();
        de.setB(8);
        System.out.println(de.getB());
    }
}
