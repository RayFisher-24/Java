class Good extends Thread{
    public void run(){
        while(true){
            System.out.println("Good Morning");
        }
    }
}
class Welcome extends Thread{
    public void run(){
        while(true){
            System.out.println("Welcome");
        }
    }
}

public class test {
    public static void main(String[] args) {
       Good g = new Good();
       g.start();
       Welcome w = new Welcome();
       w.start();

    }
}
