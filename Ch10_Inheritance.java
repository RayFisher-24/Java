class Base{
    public int num;

    public int getNum(){
        return num;
    }
    public void setNum(int num){
        this.num = num;
    }

    //default constructors in the base class
    Base(){
        System.out.println("Something creating");
    }

    //with parameter constructiors
    Base(int x){ 
        System.out.println("This is the Base class method overlodding "+x);
    }
}
class Derived extends Base{
    //default constructors in the Derived class
    Derived(){
        System.out.println("Subclass of Derived class");
    }

    Derived(int x, int y){
        super(x);
        int result = x+y;
        System.out.println("This is the Derived class method overlodding "+y);
    }
}

public class Ch10_Inheritance { 
    public static void main(String args[]) {
        System.out.println("Inheritance");
       // Base b = new Base();
        Derived d = new Derived(99,108);
       // b.Base();
       // b.setNum(69);
       // System.out.println(b.getNum());

       /* Derived d = new Derived();
       // d.setNum(78);
       // System.out.println(d.getNum());
        d.Derived();*/
    }
}