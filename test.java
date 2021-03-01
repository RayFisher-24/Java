class MyThreadRunnable1 implements Runnable{
    public float num = 2.0f;
    
    MyThreadRunnable1(String name){
        System.out.println(name+" is the Overlodding Constructor.");
    }


    @Override
    public void run(){
        System.out.println(num+" it 's Thread run Method");
    }
}







class MyThread extends Thread{

    MyThread(){
        System.out.println("This is Thread Constructor Method.");
    }
    MyThread(String num){
        super(num);
        System.out.println("This is Thread Constructor Overloaded Method.");
    }
    MyThread(Runnable r){
        System.out.println("ABCD");
    }
    

    @Override
    public void run(){
        
    }
}

public class test {
    public static void main(String[] args) {
       /* MyThreadRunnable1 bullet1 = new MyThreadRunnable1("arijit");
        Thread gun1 = new Thread(bullet1);
        gun1.start();*/

        MyThread m = new MyThread(6);
        m.start();
       
    }
}
