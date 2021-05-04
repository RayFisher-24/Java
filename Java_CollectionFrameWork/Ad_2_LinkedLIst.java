import java.util.LinkedList;

public class Ad_2_LinkedLIst{
    public static void main(String args[]){
        LinkedList<Integer> ll1 = new LinkedList<>();
        ll1.add(1);
        ll1.add(2);
        ll1.addLast(9);
        ll1.add(8);
        ll1.addFirst(7);
        ll1.addLast(10);
        System.out.println(ll1.toArray());
            
        ll1.forEach((n) -> System.out.printf("The values is %d%n",n));
       
        for(int i=0; i<ll1.size(); i++){
            System.out.println(i+":"+ll1.get(i));
        }
       
        
        
       
    }
}