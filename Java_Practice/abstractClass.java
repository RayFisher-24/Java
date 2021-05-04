abstract class Base{
    abstract void moveIt();
    abstract void moveItt();
    abstract void on();
    abstract void off();
    
}
class Drived1 extends Base{
   
    void moveIt(){
        System.out.println("Hey1");
    }
    void moveItt(){
        System.out.println("Hey2");
    }
}
class Drived2 extends Drived1{
    void moveIt(){
        System.out.println("Hey1");
    }
    void moveItt(){
        System.out.println("Hey2");
    }
}


class abstractClass{
    public static void main(String args[]) {
        System.out.println("KK");
        Base q = new Drived1();
        q.moveIt();
        Drived1 d = new Drived1();
        d.moveIt();
        Base r = new Drived2();
        r.moveItt();
        
    }
}
