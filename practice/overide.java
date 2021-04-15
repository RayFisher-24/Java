class overide1{
    public int a;
    public static int A(int a){
        return a;
    }
    void print(){
        System.out.println("A");
    }

}
class overide2 extends overide1{
    @Override
    void print(){
        System.out.println("B");
    }
}

class overide{
    public static void main(String args[]) {

        overide1 o1 = new overide1();
        o1.A(5);
        o1.print();
        overide2 o2 = new overide2();
        //o2.print();

        overide1 obj = new overide2();
        obj.print();
    }
}