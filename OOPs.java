//Practice
class Car{ //custom class
    String name;
    int price;
    int doors;
    String model;
    public void printCar(){
        System.out.println("The Car Name is "+name);
        System.out.println("The Car Model is "+model);
        System.out.println("The Car Price is "+price);
        System.out.println("The Car Doors is "+doors);
    }
}

class Employee{//custom class           
    int salary;
    int id;
    String name;
    public void printEmp(){
        System.out.println("My name is "+name);
        System.out.println("And my id is "+id);
    }
}

class Curcle{
    private int area;
    private int radius;
    private double pi;


    public int getArea(){
        return area;
    }
    public void setArea(int a){
        this.area = a;
    }

    public int getRadius(){
        return radius;
    }
    public void setRadius(int r){
        this.radius = r;
    }

    public double getPi(){
        return pi;
    }
    public void setPi(double p){
        this.pi = p;
    }

}


public class Ch8_OOPs { 
    public static void main(String args[]) { //main method in this Ch8_OOPs class
      System.out.println("OOPs in Java ");

      Curcle c = new Curcle();
      c.setPi(3.14);
      c.setRadius(4);
      c.setArea((c.setPi)*(c.setRadius));

      System.out.println(c.getArea());

      /*//Practice  
        Car tesla = new Car();
        tesla.name = "Tesla";
        tesla.doors = 4;
        tesla.model = "Model3";
        tesla.price = 36980;
        tesla.printCar();

      
        Employee arijit = new Employee(); //Instantiating a new employee object 
      //setting properties or attributes for arijit
        arijit.id = 1;
        arijit.name = "arijit";
        arijit.printEmp();
        arijit.salary = 36;

        Employee jhon = new Employee();
        //setting attributes for jhon
        jhon.id = 2;
        jhon.name = "jhon";
        jhon.printEmp();*/


    }
} 