//MultiThreading using Therad
class MyThread1 extends Thread{

    @Override
    public void run(){
        int i =0;
        while(i<40){
            System.out.println("My Cooking Thread1 is Running");
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
            System.out.println("My Cooking Thread2 is Running");
            System.out.println("I am happy!");
            i++;
        }

    }
}

//MultiThreading using Runable interface

class MyThread3 implements Runnable{

    
    public void run(){
        System.out.println("Thread 3 is running");
        System.out.println("Thread 3 is running");
        System.out.println("Thread 3 is running");
        System.out.println("Thread 3 is running");
        System.out.println("Thread 3 is running");
        System.out.println("Thread 3 is running");
        System.out.println("Thread 3 is running");
        System.out.println("Thread 3 is running");
        System.out.println("Thread 3 is running");
        System.out.println("Thread 3 is running");
        System.out.println("Thread 3 is running");
        System.out.println("Thread 3 is running");
        System.out.println("Thread 3 is running");
        System.out.println("Thread 3 is running");


    }
}

class MyThread4 implements Runnable{

    
    public void run(){
        System.out.println("Thread 4 is running");
        System.out.println("Thread 4 is running");
        System.out.println("Thread 4 is running");
        System.out.println("Thread 4 is running");
        System.out.println("Thread 4 is running");
        System.out.println("Thread 4 is running");
        System.out.println("Thread 4 is running");
        System.out.println("Thread 4 is running");
        System.out.println("Thread 4 is running");
        System.out.println("Thread 4 is running");
        System.out.println("Thread 4 is running");
        System.out.println("Thread 4 is running");
        System.out.println("Thread 4 is running");
        System.out.println("Thread 4 is running");


    }
}


public class Ch13_Multithreading { 
    public static void main(String args[]) {
         System.out.println("Multithreading");
       /* MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();

        t1.start();
        t2.start();*/

        MyThread3 bullet1 = new MyThread3();
        Thread gun1 = new Thread(bullet1);

        MyThread4 bullet2 = new MyThread4();
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();
    }
}