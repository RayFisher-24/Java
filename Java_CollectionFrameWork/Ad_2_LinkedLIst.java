
import java.util.*;

public class Ad_2_LinkedLIst{
    public static int link(){
     /*   //Write a Java program to append the specified element to the end of a linked list.
       LinkedList<Integer> ll2 = new LinkedList<>();
       ll2.add(0,2);
       ll2.add(3);
       ll2.add(1,6);

       ll2.forEach((n) -> System.out.println("LinkedList: "+n));
       ll2.addLast(6);
       System.out.println("The LinkedList Elements are: "+ll2);

       //Write a Java program to iterate through all elements in a linked list.
        for(Integer e: ll2){
           System.out.println("The All Elements of LinkedList are: "+e);
        }

       //Write a Java program to iterate through all elements in a linked list starting at the specified position.
       LinkedList<String> ll3 = new LinkedList<>();
      
        ll3.add("White");
        ll3.add("Red");
        ll3.add("Green");
        ll3.add("Blue");
        ll3.add("Black");

        Iterator p1 = ll3.listIterator(1);
        while(p1.hasNext()){
          System.out.println(p1.next());
        }

        //Write a Java program to iterate a linked list in reverse order
        System.out.println("The Original Elements are: "+ll3);
        Collections.reverse(ll3);
        System.out.println("The Reverse Elements are: "+ll3);

        Iterator p2 = ll3.descendingIterator();
        while(p2.hasNext()){
            System.out.println("The Reverse ordering of the Element "+p2.next());
        }

        //Write a Java program to insert elements into the linked list at the first and last position.
        System.out.println("The Elements are: "+ll3);
        ll3.offerFirst("Pink");
        ll3.offerLast("Yellow");
        System.out.println("Now the Elements are: "+ll3);

        //Write a Java program to insert the specified element at the front of a linked list.
        ll3.addFirst("Orange");
        System.out.println("Adding Orange at 1st in the List: "+ll3);

        //Write a Java program to insert the specified element at the end of a linked list.
        ll3.offer("Brown");
        System.out.println("Adding Brown in the List: "+ll3);*/

        //Write a Java program to insert some elements at the specified position into a linked list.
        LinkedList<String> ll4 = new LinkedList<>();
        ll4.add("Arijit");
        ll4.add("Rama");
        ll4.add("Sueo");

        LinkedList<String> ll5 = new LinkedList<>();
        ll5.add("Halo");
        ll5.add("Pellow");

        ll4.addAll(ll5);
        System.out.println("The ADDing of LikedList's Elements are look like this: "+ll4);


        //Write a Java program to get the first and last occurrence of the specified elements in a linked list.
   
        Object o1 = ll4.getFirst();
        System.out.println("The 1st Element of the List: "+o1);
        System.out.println("The 1st Element of the List: "+ll4.getFirst());
        System.out.println("The last Element of the List: "+ll4.getLast());

        //Write a Java program to display the elements and their positions in a linked list.
        
        Object o2 = ll4.toArray();
        System.out.println(o2);

        return 1;
    }

    public static void main(String args[]){
        try{
            int c = link();
        }
        catch(IndexOutOfBoundsException e){
            System.out.println("Their is an ArrayList Exception"+e);
            //System.exit(0);
        }
        catch(NullPointerException n){
            System.out.println(n);
        }
        catch(Exception f){
            System.out.println("Thie is an Exception"+f);
        }
        finally{
            System.out.println("The code running is completed");
        }

        //Test 
       /* LinkedList<Integer> ll1 = new LinkedList<>();
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
        }*/  
       
    }
}