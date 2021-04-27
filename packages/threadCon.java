class MyThread1 extends Thread{
    MyThread1(String name){
        super(name);
        int a=1;
        while(a<100){
            System.out.printf("%d The Number is %s%n",a,name);
            a++;
        }
    }
    public void run(){

    }
}
public class threadCon{
    public static void main(String args[]) {

        MyThread1 t1 = new MyThread1("Arijit");
        t1.start();
        System.out.println(t1.getId());
        System.out.println(t1.getName());
    }
}