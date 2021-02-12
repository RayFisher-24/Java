
class Employee{//custom class
    int id;
    String name;
    public void printEmp(){
        System.out.println("My name is "+name);
        System.out.println("And my id is "+id);
    }
}

public class Ch8_OOPs { 
    public static void main(String args[]) { //main method in this Ch8_OOPs class
        System.out.println("OOPs in Java ");
        Employee arijit = new Employee(); //Instantiating a new employee object
        
        Employee jhon = new Employee();

        //setting properties or attributes for arijit
        arijit.id = 1;
        arijit.name = "arijit";

        //setting attributes for jhon
        jhon.id = 2;
        jhon.name = "jhon";

        arijit.printEmp();
        jhon.printEmp();
    }
}