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
/*Create a class Employee with the following properties and methods:
 Salary (property) (int)
 getSalary (method returning int)
 name (property) (String)
 getName (method returning String)
 setName (method changing name)*/

class Employee{//custom class           
    int salary;
    int id;
    String name;
    public void printEmp(){
        System.out.println("My name is "+name);
        System.out.println("And my id is "+id);
    }
    public int getSalary(){
        return salary;
    }

    public String getName(){
        return name;
    }
}

//Create a class cellphone with methods to print ringing vibrating, etc.
class Cellphone{
    public void ring(){
        System.out.println("Ring...");
    }
    public void vibrat(){
        System.out.println("Vibrat...");
    }
}

 //Create a class Square with a method to initialize its side, calculating area, perimeter etc.
class Square{
    int side;
    public int area(){
        return side * side;
    }
    public int perimeter(){
        return 4*side;
    }

//Create a class Rectangle with a method to initialize its side, calculating area, perimeter etc.
class Rectangle{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 2*(side+side);
    }
}

//Create a class TommyVecetti for Rockstar Games capable of hitting (print hitting…), running, firing, etc.
class TommyVecetti{
    public void RockstarGame(){
        System.out.println("hitting...");
        System.out.println("running...");
        System.out.println("firing...");
    }
}


public class Ch8_OOPs { 
    public static void main(String args[]) { //main method in this Ch8_OOPs class
      System.out.println("OOPs in Java ");

        
      Car tesla = new Car();
        tesla.name = "Tesla";
        tesla.doors = 4;
        tesla.model = "Model3";
        tesla.price = 36980;
        tesla.printCar();

      //Problem-1
      Employee arijit = new Employee(); //Instantiating a new employee object 
      //setting properties or attributes for arijit
        arijit.id = 1;
        arijit.name = "arijit";
        arijit.printEmp();
        arijit.salary = 36;

        int salary = arijit.getSalary();
        System.out.println("Salary is "+salary);

        Employee jhon = new Employee();
        //setting attributes for jhon
        jhon.id = 2;
        jhon.name = "jhon";
        jhon.printEmp();
        jhon.salary = 12;
        int salary2 = jhon.getSalary();
        System.out.println("Salary is "+salary2);
        Employee arijit = new Employee();
        arijit.name = "Arijit";

        String name = arijit.getName();
        System.out.println("MY name is "+name);

        //Problem-2
        Cellphone realmi = new Cellphone();
        realmi.ring();
        realmi.vibrat();

        //Problem-3
        Square sq = new Square();
        sq.side = 2;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());
        
        //Problem-4
        Rectangle re = new Rectangle();
        re.side = 2;
        System.out.println(re.area());
        System.out.println(re.perimeter()); 

        //Problem-5
        TommyVecetti game = new TommyVecetti();
        game.RockstarGame();   






            

            



    }
}