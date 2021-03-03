Abstract method and class
abstract class abstractClass{
    abstractClass(){
        System.out.println("Hello World");
    }
    abstract public void moveTO();
}
abstract class abstractClass2{
    abstract public void moveTOo();
}
class exol extends abstractClass{

    @Override
    public void moveTO(){
        System.out.println("Exol love you exol");
    }   
}
class exol2 extends abstractClass2{

    @Override
    public void moveTOo(){
        System.out.println("Exol2 love you Exol2");
    }
}

interface Biycle{
    int applyBreak(int decrement);
    int speedUp(int increment);   
}
interface xoxo{
    void pe();
    void po();
}

class Cycle implements Biycle, xoxo{
    int speed = 9;
    public void realSpeed(){
        System.out.println("The Main Speed of the Cycle is "+speed);
    }
    @Override
    public int applyBreak(int decrement){ 
        int result = speed - decrement;
        System.out.println("Speed down "+ result);
        return result;
    }
    @Override
    public int speedUp(int increment){
        int result = speed + increment;
        System.out.println("Speed down "+ result);
        return result;
    }
    @Override
    public void pe(){
        System.out.println("Pe pe pe pe");
    }
    @Override
    public void po(){
        System.out.println("Po po po po");
    }
}

/*Problem-1 Create an abstract class pen with methods write () and refill () as abstract methods 
Use the pen class from Q1 to create a concrete class fountain pen with additional method change Nib ()*/

abstract class pen{
    public void pen(){
        System.out.println("This is a pen's constructors method");
    }
    abstract void write();
    abstract void refill();
}
class fountainPen extends pen{
    public void changeNib(){
        System.out.println("change the Nib of this pen");
    }
    public void write(){
        System.out.println("This pen is writting");
    }
    public void refill(){
        System.out.println("Change the refill");
    }
}

//Prolem-2 Create a class monkey with jump ( ) and bite ( ) methods Create a class human whichinherits this monkey class and implements basicanimal interface with eat ( ) and sleep methods 
interface basicAnimal{
    void eat();
    void sleep();
}

class monkey{
    //public void name;
    //public void jump;

    public void monkeyBite(){
        System.out.println("Monkey's Bite is very Powerful");
       // return name;
    }
    public void monkeyJump(){
        System.out.println("can Jump from one branch to another");
       // return name;
    }
    public void sleep(){
        System.out.println("Sleep can improved our thought for monkey");
    }
}

class human extends monkey implements basicAnimal{
        public void programming(){
            System.out.println("Code MONKEY");
        }
        public void eat(){
            System.out.println("Basic Animal hebitet is eating");
        }
        @Override
        public void sleep(){
            System.out.println("Sleep can improved our thought for human");
        }
}

//Problem-3 Create a class telephone with ( ) , lift ( ) and disconnected ( ) methods as abstract methods create another class smart telephone and demonstrate polymorphism 

abstract class telephone{

    abstract void with();
    abstract void lift();
    abstract void disconnected();

    public void takeCall(){
        System.out.println("Telephone can take call");
    }       
}
class smartTelephone extends telephone{
    
    @Override
    public void with(){
        System.out.println("with...");
    }

    @Override
    public void lift(){
        System.out.println("lift...");
    }

    @Override
    public void disconnected(){
        System.out.println("disconnect...");
    }

}

//Problem-4 Create an interface TVremote and use it to inherit another interface smart TVremote. Create a class TV which implements TVremote interface
interface TVremote{
    void remote();
}

interface smartTVremote{
    void smartRemote();
}

class TV implements TVremote, smartTVremote{
    public void remote(){
        System.out.println("Remote...");
    }
    public void smartRemote(){
        System.out.println("Smart Remote...");
    }
}

public class Ch11_AbstractClassandMethod { 
    public static void main(String args[]) {
         System.out.println("Ch11_Abstract Classes and Method");
       // Abstract method and class
        abstractClass ac = new abstractClass();
        exol e = new exol();
        e.moveTO();

        exol2 e2 = new exol2();
        e2.moveTOo();
       
     /*-------------------------------------------------*/

        Cycle cy = new Cycle();
        cy.realSpeed();
        cy.applyBreak(2);
        cy.speedUp(9);
        cy.po();
        cy.pe();
        cy.speed =6;
        System.out.println(cy.speed);

        //Problem-1
        fountainPen fp = new fountainPen();
        fp.write();
        fp.refill();
        fp.changeNib();

        //Problem-2
        monkey m=new monkey();
        m.monkeyBite();
        human h=new human();
        h.monkeyBite();
        monkey oj = new human();
        oj.monkeyBite();
        oj.sleep();

        //Problem-3
        telephone st = new smartTelephone();
        st.disconnected();

        //Problem-4
        TVremote t = new TV();
        t.remote(); //right
        //t.smartRemote(); error
       
   
    }
}
