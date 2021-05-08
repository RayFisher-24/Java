import java.util.*;

class hashSET{
    public void ques1(){
        //Write a Java program to append the specified element to the end of a hash set.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Number1 ");
        int a = sc.nextInt();
        System.out.print("Enter your Number2 ");
        int b = sc.nextInt();
        System.out.print("Enter your Number3 ");
        int c = sc.nextInt();
        System.out.print("Enter your Number4 ");
        int d = sc.nextInt();
        HashSet<ArrayList> set = new HashSet<>(5);

        ArrayList<Integer> hs1 = new ArrayList<>();
        hs1.add(a);
        hs1.add(b);
        hs1.add(c);
        set.add(hs1);
        hs1.add(3,d);  
        System.out.println(hs1);    
    }    
    public void ques2(){
        //Write a Java program to iterate through all elements in a hash list.
        HashSet<String> hs2 = new HashSet<>();
        hs2.add("Yellow");
        hs2.add("Black");
        hs2.add("Red");
        hs2.add("Blue");
        hs2.add("White");


       // hs2.forEach((n) -> System.out.println(n));
        Iterator p1 = hs2.iterator();
        while(p1.hasNext()){
            System.out.println(p1.next());
        }
        
    }
    public void ques3(){
        //Write a Java program to get the number of elements in a hash set.
        HashSet<String> hs3 = new HashSet<>();
        hs3.add("Yellow");
        hs3.add("Black");
        hs3.add("Red");
        hs3.add("Blue");
        hs3.add("White");

        System.out.println(hs3.size());

        //Write a Java program to empty an hash set.
        hs3.clear();
        //Write a Java program to test a hash set is empty or not.
        System.out.println("Is this hashset is Empty? "+hs3.isEmpty());
    }
    public void ques4(){
        //Write a Java program to clone a hash set to another hash set.
        HashSet<String> hs4 = new HashSet(20,0.25f);
        hs4.add("Ram");
        hs4.add("Sam");
        hs4.add("Wan");
        hs4.add("Qee");

        System.out.println(hs4);
        hs4.add("Sas");
        System.out.println(hs4.clone());

        //Write a Java program to convert a hash set to an array.

        HashSet<String> hs5 = new HashSet<>();
        hs5.add("Hash1");
        hs5.add("Hash2");
        hs5.add("Hash3");
        hs5.add("Hash4");
        hs5.add("Hash5");
        System.out.println(hs5);

        String [] arr = new String[hs5.size()];
        hs5.toArray(arr);

        for(String E:arr){
            System.out.println(E);
        }

        //Write a Java program to convert a hash set to a List/ArrayList.
        HashSet<String> hs6 = new HashSet<>();
        hs6.add("Hash6");
        hs6.add("Hash7");
        hs6.add("Hash8");
        hs6.add("Hash9");
        hs6.add("Hash10");

        //HashSet
        System.out.println(hs6);

        List<String> al = new ArrayList<>(hs6);
        List<String> ll = new LinkedList<>(hs6);
        Set<String> ts = new TreeSet<>(hs6);
        
        //ArrayList
        System.out.println(al);
        //LikedList
        System.out.println(ll);
        //TreeSet
        System.out.println(ts);

        //Write a Java program to compare two hash set.
        System.out.println(hs6.equals(hs5));
        

        //Write a Java program to compare two sets and retain elements which are same on both sets.
        System.out.println( hs5.retainAll(hs6));
       
    }
    
}
public class Ad_3_HashSet{
    public static void main(String args[]){
        System.out.println("HashSet");
        try{
            hashSET hs = new hashSET();
           /* hs.ques1();
           hs.ques2();
           hs.ques3();*/
           hs.ques4();
        }
        catch(IndexOutOfBoundsException i){
            System.out.println("Thier is n Exception "+i);
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("The code are cleanup");
        }
    }
}