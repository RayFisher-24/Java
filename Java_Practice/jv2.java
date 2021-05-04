class PracticeMain{
    
}
public class jv2{
    public static void main2(){
        System.out.println("Hello world");
    }

    public static int foo(int x, int ...arr){
        int result = x;
        for(int elements:arr){
            result += elements;
        }
        return result;
    }
    public static void main(String args[]) {
        System.out.println("jv2");
       // jv2 j = new jv2();
        main2();
       
       System.out.println("The sum of this two number is "+foo(3, 6));
       System.out.println("The sum of this three number is "+foo(3, 6, 4));
       System.out.println("The sum of this four number is "+foo(3, 6, 4, 9));

    }
}