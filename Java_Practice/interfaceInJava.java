interface Vehicle{
    void applyBreak(int b);
    void speedUp(int s);
    void gearChange(int c);
}
interface twoWheel{
   default void color(String c){
      // System.out.println("color :"+c);    
   }
}
class bike implements Vehicle, twoWheel{
    
    int gear;
    int speed;

    @Override
    public void applyBreak(int decrement){ 
        speed = speed - decrement;
    }
    public void speedUp(int increment){
        speed = speed + increment;
    }
    public void gearChange(int newGear){
        gear = newGear;
    }
    public void color(String color){
        System.out.println("The color is "+color);
    }
    public void printStates(){
       System.out.println("speed : "+speed+ " Gear : "+gear);
    }
}
class interfaceInJava{
    public static void main(String args[]) {
        System.out.println("interface");
        //Vehicle vv = new Vehicle();
        bike v = new bike();
        twoWheel tw = new bike();
        tw.color("BLUE");
        v.applyBreak(14);
        v.speedUp(20);
        v.gearChange(9);
        v.color("red");
        v.printStates();
    }
}