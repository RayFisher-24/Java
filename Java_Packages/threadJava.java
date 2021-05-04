import java.lang.Thread;
import java.lang.Runnable;
import java.lang.Thread.State;

/*class subThread extends Thread{

    @Override
    public void run(){
        System.out.println("Extends the Thread by subclass");
    }
}
class thread implements Runnable{
    public void run(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("State of thread");
        try{
            Thread.sleep(200);
        } catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
class run implements Runnable{
    public void run(){
        System.out.println("Runable");
    }
    public void add(int a, int b){
        int result = a+b;
        System.out.println("The addition is "+ result);
    }
}

class MyThread1 extends Thread{
    @Override
    public void run(){
        int i =0;
        while(i<40){
            System.out.println("1. My Thread1 is running");
            System.out.println("I am happy!");
            i++;
        }
    }
}
class MyThread2 extends Thread{
    @Override
    public void run(){
        int i =0;
        while(i<40){
            System.out.println("2. My Thread2 is running");
            System.out.println("I am happy!");
            i++;
        }
    }
}
class MyThread3 extends Thread{
    @Override
    public void run(){
        for(int i=0; i<=10; ++i){
            System.out.println("3. My Thread is running");
        }
    } 
}
class MyThreadRunnable1 implements Runnable{

    @Override
    public void run(){
        for(int i=0; i<=10; ++i){
            System.out.println("4. My Thread is running");

            while(i<5){
                System.out.println("The math is "+i);
                i++;
            }
        }
    }
}
class MyThreadRunnable2 implements Runnable{

    @Override
    public void run(){
        try{
            Thread.sleep(2000);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println();
    }
}
*/

class thread extends Thread{
    public thread(String name){ 
        super(name);
    }
    public thread(Runnable r, String name){ 
        super(name);
    }
    public void run(){
        int i =34;
        while(i<100){
            System.out.println("I am a Thread "+ this.getName());
            i++;
        }
        
    }
}
class thread2 extends Object{

}
public class threadJava{
    public static void main(String args[]) {

        thread r1 = new thread("Arijit1 (max)");
        thread r2 = new thread("Arijit2 (min)");
        thread r3 = new thread("Arijit3");
        thread r4 = new thread("Arijit4");
        r1.setPriority(Thread.MAX_PRIORITY);
        r2.setPriority(Thread.MIN_PRIORITY);
        r1.start();
        r2.start();
        r3.start();
        r4.start();
       /*System.out.println(r1.getName());
        //r.setDaemon(true);
        System.out.println("1: "+r.getId());
        System.out.println("2: "+r.getName());
        System.out.println("3: "+r.getClass());
        System.out.println("4: "+r.getState());
        System.out.println("5: "+r.getThreadGroup());
        System.out.println("6: "+r.getPriority());
        System.out.println("7: "+r.getUncaughtExceptionHandler());
        System.out.println("8: "+r.getStackTrace());*/
       // System.out.println("9: "+r.isDaemon());



       /* MyThread3 t3 = new MyThread3();
        t3.start();
        MyThreadRunnable1 r1 = new MyThreadRunnable1();
        Thread t = new Thread(r1);
        t.start();

        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start();
        System.out.println(t1.getState());
        t2.start();
        t1.isDaemon();
        
      run r = new run();
        Thread track = new Thread(r);
        track.start();
        r.add(4,9);
      subThread s= new subThread();
        s.start();
        System.out.println(s.getState());*/
        
       
    }
}