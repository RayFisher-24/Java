import java.util.Scanner;

class practiceJava{

    public practiceJava(int sum, int add){
        this.sum=sum;
        this.add=add;
        System.out.println("JAVA");
    }

    int sum;
    int add;

    public int getSum(){
        return sum;
    }
    public int getAdd(){
        return add;
    }
    
    public int toInt(){
        return this.getSum()+this.getAdd();
    }
}
class runTime{
    int a;
    public runTime(int a){
        this.a=a;
        System.out.println(a);
    }
}

public class modifier{

    public static void main(String[] args) {
       System.out.println("MODIFIER");

       runTime rt = new runTime(8);

        practiceJava p = new practiceJava(5,9);
        //p.setSum(5);
        System.out.println(p.toInt());
       
    }
}