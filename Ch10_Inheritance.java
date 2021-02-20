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

class Base1{
    public int number;

    public void meth1(){
        System.out.println("I am Meth1");
    }
    public void meth2(){
        System.out.println("I am Meth2 of Base1");
    }
}

class Base2 extends Base1{

    @override
    public void meth2(){
        System.out.println("I am Meth2 of Base2");
    }
    public void meth3(){
        System.out.println("I am Meth3");
    }

}

public class Ch10_Inheritance { 
    public static void main(String args[]) {
        System.out.println("Inheritance");
       // Base b = new Base();
       // Derived d = new Derived(99,108);
       // b.Base();
       // b.setNum(69);
       // System.out.println(b.getNum());

       /* Derived d = new Derived();
       // d.setNum(78);
       // System.out.println(d.getNum());
        d.Derived();*/


        Base1 b = new Base1();
        //b.meth2();

        Base2 bb = new Base2();
        bb.meth2();
    }
}