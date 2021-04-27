class abcd{
    public void ab(int a){
        int i = 0;
        while(i<100){
            System.out.println(a);
            i++;
        } 
    }
}
class sub1 extends abcd{

    @Override
    public void ab(int a){
        int i = 0;
        while(i<100){
            System.out.println(a);
            i++;
        } 
    }
}
class sub2 extends abcd{

    @Override
    public void ab(int a){
        int i = 0;
        while(i<100){
            System.out.println(a);
            i++;
        } 
    }

}
public class lifeCycle{
    public static void main(String args[]) {

        sub1 s1 = new sub1();
        sub2 s2 = new sub2();
        s1.ab(2);
        s2.ab(4);
        
    }
}