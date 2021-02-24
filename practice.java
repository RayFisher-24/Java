//Create a class telephone with ( ) , lift ( ) and disconnected ( ) methods as abstract methods create another class smart telephone and demonstrate polymorphism 

/*interface camera{
    void takeSnap();
    void recordVideo();
    void checkFace();
    void showAR();
}
interface deal{
    int dealNumber();
    String showContact();
}
interface pay{
    double digitalPaymnet();
    double choosePay();
}*/
interface read{
    void readBook();
   // String writeNotes();
}

abstract class myPhone{

    abstract void with();
    abstract void lift();
    abstract void disconnected();

    public void takeCall(){
        System.out.println("Telephone can take call");
    }       
}
class smartPhone extends myPhone{

  //  public String txt;
    
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

    @Override 
    public void readBook(){
     //   return this.txt =t;
    }

}


public class practice { 
    public static void main(String args[]) {

        //Problem-3
        myPhone st = new smartPhone();
        st.disconnected();
        
    }
}
