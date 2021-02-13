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
    public void setName(String n){
        name = n;
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
}

//Create a class Rectangle with a method to initialize its side, calculating area, perimeter etc.
class Rectangle{
    int l;
    int w;
    public int area(){
        return l*w;
    }
    public int perimeter(){
        return 2*(l+w);
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
    public static void main(String args[]) { 

        //Problem-1
        Employee emp1 = new Employee();
        emp1.setName("ARijitMOndal");
        emp1.salary = 233;
        System.out.println(emp1.getName());
        System.out.println(emp1.getSalary());

        //Problem-2
        Cellphone realmi = new Cellphone();
        realmi.ring();
        realmi.vibrat();

        //Problem-3
        Square sq = new Square();
        sq.side = 3;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());

        //Problem-4
        Rectangle re = new Rectangle();
        re.l = 5;
        re.w = 6;
        System.out.println(re.area());
        System.out.println(re.perimeter()); 

        //Problem-5
        TommyVecetti game = new TommyVecetti();
        game.RockstarGame();  
    }
}