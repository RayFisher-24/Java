import java.util.Scanner;

class Curcle{
    private double radius;

    public Curcle(){
        this.radius=6;
    }
    public Curcle(double radius){ //method overidding
        this.radius = radius;
    }
    
    public double radius(){
        return Math.PI * radius * radius;
    }
    public double diameter(){
        return 2* radius;
    }

    public double getRadius(){
        return radius;
    }
    public void setRadius(double r){
        this.radius = r;
    }

}

class Squre{
    private double area;
    private double side;
    //private double length;
    
    public Squre(){
       // this.area=49;
        this.side = 9;
    }
    public Squre(int side){
        this.side = side;
    }
    public double area(){
        return side*side;
    }
    public double length(){
        return side*side*side;
    }
}

class Lolo{
    
    private String name;

    public Lolo(String name){
        this.name = name;
    }
    public String Name(){
        return name;
    }

    public String getName(){
        return name;
    }
    public void setName(String n){
        this.name = n;
    }

}

class Arijit{

    private String name;

    public Arijit(String name){
        this.name = name;
    }
    public String voi(){
        return name;
    }
}

class Access{
    private int num;
    public void setNum(int n){
        this.num = n;
    }
    public int getNum(){
        return num;
    }
}

class Accessed{
    private int num1;
    private int num2;
    private int sum;
    private int num;

    public Accessed(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }
    public int meMo(){
        return num = num1+num2;
    }
    public int meMO(){
        return sum = num1*num2;
    }
}


public class OOPs { 
    public static void main(String args[]) { //main method in this Ch8_OOPs class


      Accessed ac = new Accessed(68,19);

      /*ac.setNum(69);
      System.out.println(ac.getNum());*/
      System.out.println(ac.meMo());
      System.out.println(ac.meMO());

      System.out.println("OOPs in Java ");
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter you Name ");
      String result = sc.nextLine();
      Lolo l = new Lolo(result);
      Arijit mi = new Arijit("Arijit Mondal");
      System.out.println("Your name is "+mi.voi()+" With a great Big Smile");
     
      //sc.setName("Arijit");
      //System.out.println(sc.getName());
      System.out.println("The Name is "+l.Name());

/*    Squre sq = new Squre();
      double result = sq.area();
      System.out.println(result);
      System.out.println(sq.length());

      Curcle c = new Curcle();
      c.setRadius(5);
      System.out.println(c.getRadius());
     // System.out.println(c.radius());
     // System.out.println(c.diameter());*/


    }
} 