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

    @Override
    public void meth2(){
        System.out.println("I am Meth2 of Base2");
    }
    public void meth3(){
        System.out.println("I am Meth3");
    }

}

//(Problem-1)Create a class circle and use inheritance to create another class cylinder from it. Create method for area and volume
class Circle{
    public double radius;

    Circle(double r){
       // System.out.println("The radius of the Circle");
        this.radius =r;
    }
    public double resultOfArea(){
        return Math.PI*this.radius*this.radius;
    }
    public double volumeOfCircle(){
        return 4/3*Math.PI*this.radius*this.radius*this.radius;
    }

}
class Cyclinder extends Circle{
    public double height;

    Cyclinder(double r, double h){
        super(r);
        //System.out.println("The radius of the Circle");
        this.height = h;
    }
    public double resultOfVolume(){
        return Math.PI*this.radius*this.radius*this.height;
    }
}

//(Problem-2)Create a class retangle and use inheritance to create another class cuboid . try to keep it as close to real world sceario as passible
class Retangle{
    public double width;
    public double length;

    Retangle(){
        System.out.println("I am a Contructor of Retangle class");
    }
    Retangle(double width, double length){
        System.out.println("I am a Method Loaded Contructor of Retangle calss");
        this.width = width;
        this.length = length;
    }

    public double area(){
        double result = this.width*this.length;
        return result;
    }
}

class Cuboid extends Retangle{
    public double height;

    Cuboid(double width, double length, double height){
        super(width, length);
        System.out.println("I am a method overridding by Cuboid from Retangle");
        this.height =height;
    }
    public double volume(){
        double result = this.width*this.length*this.height;
        return result;
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
        //b.meth3();

        Base2 bb = new Base2();
        bb.meth2();
        bb.meth3();

        //Problem-1
        Circle c = new Circle(6);
        System.out.println(c.resultOfArea());
        System.out.println(c.volumeOfCircle());

        Cyclinder cy = new Cyclinder(7,9);
       System.out.println(cy.resultOfVolume());

        //Problem-2
        //Retangle re = new Retangle(12, 9);
        //System.out.println(re.area());

        Cuboid cd = new Cuboid(12,9,21);
        System.out.println(cd.volume());
    }
}