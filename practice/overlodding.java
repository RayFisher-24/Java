class over{
    over(){
        System.out.println("Defualt of the parent class");
    } 
    over(String a){
        System.out.println("1. This is the overloded Construtor of parent class");
    }
    public static void lod(int y){
        System.out.println("lod");
    }
}
class over2 extends over{
    over2(){
        System.out.println("Defualt of the sub class");
    }
    over2(String a, String b){
        super(a);
        System.out.println("2. This is the overloaded Construtor of sub class");
    }
    public static void lod(){
        System.out.println("Defualt");
    }
    public static void lod(int x, int y){
        System.out.println("1. lod in subclass");
    }
    public static void lod(int x, int y, int z){
        System.out.println("2. lod in subclass");
    }
}
class over3 extends over2{
    over3(String a, String b, String c){
        super(a,b);
        System.out.println("3. This is the overloaded Construtor of sub class's sub class");
    }
}
class overlodding{
    public static void main(String args[]) {
        System.out.println("Construtor Overlodding");
        over o = new over();
        over2 o2= new over2();
        o2.lod();
        over3 o3 = new over3("a","e", "w");
        

    }
}