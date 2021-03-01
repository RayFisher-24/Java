class Good extends Thread{
    public void run(){
        int j =0;
        while(j<10){
            System.out.println("Good Morning");
            j++;
        }
    }
}
class Welcome extends Thread{
    public void run(){
        int i =0;
        while(i<10){
            try{
                Thread.sleep(1);
            }
            catch (Exception e){
                System.out.println(e);
            }
            System.out.println("Welcome");
            i++;
        }
    }
}

public class test {
    public static void main(String[] args) {
       Good g = new Good();
       g.start();
       g.setPriority(6);
       System.out.println(g.getPriority());
       Welcome w = new Welcome();
       w.start();
       System.out.println(w.getState());
       System.out.println(Thread.currentThread().getState()); 

    }
}
