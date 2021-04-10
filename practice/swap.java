class Car{
    int model, no;
    Car(int no, int model){ 
        this.model=model;
        this.no=no;
    }
    void print(){
    System.out.println(no+" "+model);
    }   
}

class CarWrapper{
    Car c;

    CarWrapper(Car c){ this.c=c; }
}

class swap{
    public static void swap(Car c1, Car c2){
        int temp = c1.no;
        c1.no = c2.no;
        c2.no = temp;

        int z = c1.model;
        c1.model = c2.model;
        c2.model = z;
    }
    
    public static void wrapper(CarWrapper cw1, CarWrapper cw2){
        Car temp1 = cw1.c;
        cw1.c = cw2.c;
        cw2.c = temp1;
    }
    public static void main(String args[]) {
        System.out.println("Swap two Number");
        Car c1 = new Car(1, 500);
        Car c2 = new Car(2, 600);
        swap(c1, c2);

        System.out.println(c1.no);
        System.out.println(c2.no);

        c1.print();
        c2.print();

        //Create a wrapper
        CarWrapper cw1 = new CarWrapper(c1);
        CarWrapper cw2 = new CarWrapper(c2);
        wrapper(cw1, cw2);
        cw1.c.print();
        cw2.c.print();
    }
}