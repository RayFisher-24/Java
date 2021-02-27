//create a class cylinder and use getter and setters to set its radius and height 
class Cylinder1{
    private int radius;
    private int height;
    public int getRadius(){
        return radius;
    }
    public void setRadius(int r){
        this.radius = r;
    }
    public int getHeight(){
        return height;
    }
    public void setHeight(int r){
        this.height = r;
    }
}

//use ➊ to calculate surface and volume of the cylinder 
class Cylinder2{
    private int radius;
    private int height;
    
    public Cylinder2(int radius, int height){
        this.radius = radius;
        this.height = height;
    }
    public double volume(){
        return Math.PI * radius * radius *height;
    }
     public double surface(){
        return 2*Math.PI * radius *height + 2*Math.PI * radius * radius;
    }   
}

//Overload a constructor used to initialize a rectangle of length and breath 5 for using custom parameters 
class Rectangle{
    private int length;
    private int breath;
    public Rectangle(){
        this.length=4;
        this.breath=9;
    }
    public Rectangle(int length, int breath){
        this.length=length;
        this.breath=breath;
    }
    public int getLength(){
        return length;
    }
    public int getBreath(){
        return breath;
    }
}

//Repeat ➊ for a sphere
class Sphere{
    private int radius;
    public Sphere(int radius){
        this.radius = radius;
    }
    public double volume(){
        return 1.33333333333 * Math.PI * radius * radius * radius;
    }

}

public class Ch9_AccessmodifierandConstructor { 
    public static void main(String args[]) { 
        System.out.println("Accessmodifier&Constructor");

        //Problem-1
        Cylinder cy = new Cylinder();
        cy.setRadius(9);
        System.out.println(cy.getRadius());
        cy.setHeight(9);
        System.out.println(cy.getHeight());

        //Problem-2
        Cylinder2 cys = new Cylinder2(9,8);
        System.out.println(cys.volume());
        System.out.println(cys.surface());

        //Problem-3
        Rectangle re = new Rectangle(4,9);
        System.out.println(re.getLength());
        System.out.println(re.getBreath());

        //problem-4
        Sphere sp = new Sphere(8);
        System.out.println(sp.volume());


    }
}
