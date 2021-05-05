import java.util.*;
//import java.lang.*;



public class Ad_1_ArrayList{
    public static int questions(){
        //Write a Java program to create a new array list, add some colors (string) and print out the collection
        ArrayList<String> al5 = new ArrayList<>();
        al5.add("red");
        al5.add("green");
        al5.add("blue");
        al5.forEach((n) -> System.out.println(n));

        // Write a Java program to iterate through all elements in a array list.
        ArrayList<String> al6 = new ArrayList<>(10);
        al6.add("Arijit");
        al6.add("ram");
        al6.add("Sam");
        al6.add("Bose");
        al6.add("Rone");

        int i=0;
        while(i<10){
            System.out.println("The Number is "+ al6.get(i));
            i++;
        }

        //Write a Java program to insert an element into the array list at the first position. 
        al6.set(0,"Ronny");
       // al6.forEach((m) -> System.out.println(m));

        //Write a Java program to retrieve an element (at a specified index) from a given array list.
        System.out.println("The index of "+al6.get(0));
       // System.out.println("the String is "+ al6.indexOf("ram"));
        

        //Write a Java program to update specific array element by given element
        al6.set(1,"Eato");
        

        //Write a Java program to remove the third element from a array list
        System.out.println("The 3rd Element is "+al6.remove(2));
        System.out.println("and now 3rd element is remove ");
        al6.forEach((m) -> System.out.println(m));

        //Write a Java program to search an element in a array list
        System.out.println("the element is in the arraylist? "+al6.contains("Eato"));

        //Write a Java program to sort a given array list.
        Object [] arr = al6.toArray();
        System.out.println(Arrays.toString(arr));

        //Write a Java program to copy one array list into another.
        ArrayList<Integer> al7 = new ArrayList<>();
        ArrayList<Integer> al8 = new ArrayList<>();
        al7.add(0,5);
        al7.add(1,9);
        al7.add(2,7);
        al7.add(3,8);

        al8.add(0,34);
        al8.add(1,39);
        al8.add(2,37);
        al8.add(3,38);

        System.out.println("Before copy the Elements");
        System.out.println("List1: "+al7);
        System.out.println("List2: "+al8);

        Collections.copy(al7, al8);

        System.out.println("After copy the Elements");
        System.out.println("List1: "+al7);
        System.out.println("List2: "+al8);

        //Write a Java program to shuffle elements in a array list.
        System.out.println("Before Shuffle the ArrayList: "+al7);
        Collections.shuffle(al7);
        System.out.println("After Shuffle the ArrayList: "+al7);

        //Write a Java program to reverse elements in a array list.
        System.out.println("Before Reverce the element: "+al8);
        Collections.reverse(al8);
        System.out.println("After Reverce the element: "+al8);

        //Write a Java program to extract a portion of a array list.
        System.out.println("The original Elements: "+al8);
        List<Integer> sub_al8 = al8.subList(0,2);
        System.out.println("The Element After Extract: "+sub_al8);

        //Write a Java program to compare two array lists.
        System.out.println("ArrayList1:  "+al7);
        System.out.println("ArrayList2: "+sub_al8);

        //arrayList buildin operator 
        System.out.println(al7.equals(al8));
 
        //Normal if else for checking two ArrayList are same
        if(al7==al8){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }

        //This formula count the Number of index inside two elements
        al8.add(6);
        al8.add(7);
        al8.add(8);
        al8.add(9);

        if(al7.equals(al8)==true){
            System.out.println("The Both ArrayList is Equals");
        }
        else{
            System.out.println("The Both Elements are Not Equals");
        }

        //Write a Java program of swap two elements in an array list.
        System.out.println("The List Elements are : "+al7);
        Collections.swap(al7, 1, 2);
        System.out.println("After Swap the 1st List: "+al7);

        //Write a Java program to join two array lists.
        System.out.println("The ArrayList Number1: "+al7);
        System.out.println("The ArrayList Number2: "+al8);
        System.out.println(al7.contains(al8));

        //Let join two ArrayList

        ArrayList<Integer> an = new ArrayList<>();
        an.addAll(al7);
        an.addAll(al8);
        System.out.println(an);
        
        //Write a Java program to clone an array list to another array list
        ArrayList<Integer> al9 = new ArrayList<>(10);
        ArrayList<Integer> al10 = new ArrayList<>();
        al9.add(321);
        al9.add(124);
        al9.add(236);
        al9.add(456);

        al10.add(1234);
        al10.add(2401);
        al10.add(1564);
        al10.add(6523);

        ArrayList<Integer> c = (ArrayList<Integer>)al9.clone();
        System.out.println("The Original ArrayList: "+al9);
        System.out.println("The Clone ArrayList: "+c);

        //Write a Java program to empty an array list.
        al10.removeAll(al10);
        System.out.println("Remove all Elements form al10 ArrayList: "+al10);

        //Write a Java program to test an array list is empty or not
        System.out.println("The List is Empty? "+al9.isEmpty());

       //Write a Java program to trim the capacity of an array list the current list size.
       al9.trimToSize();
       System.out.println("Trim the value "+al9);

       //Write a Java program to increase the size of an array list.
       al9.ensureCapacity(100);
       System.out.println(al9);

       //Write a Java program to replace the second element of a ArrayList with the specified element.
        al9.set(0,121);
        System.out.println(al9);

       //Write a Java program to print all the elements of a ArrayList using the position of the elements
        for(int i=0; i<al9.size(); i++){
            System.out.println("The "+i+" Elements is "+al9.get(i));
        }
        return 0;
    }
    public static void main(String args[]) {

        //Questions
        try{
            int q = questions();
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
        
        /*//call the method called as arr
        try{
            int z = arr();
        }
        catch(IndexOutOfBoundsException e){
            System.out.println("Their is an Exception"+e);
            //System.exit(0);
        }
        catch(NullPointerException n){
            System.out.println(n);
        }
        finally{
            System.out.println("The code running is completed");
        }
        
       // System.out.println(z);

        //Regular Array
        int [] arr = new int[5];
        arr[0]=5;
        arr[1]=6;
        arr[2]=9;
        arr[3]=8;
        arr[4]=1;
        //System.out.println(arr[0]);

        //creating an ArrayList 
        ArrayList<Integer> arrli1 = new ArrayList<>();
        ArrayList<Integer> arrli2 = new ArrayList<>(5);
        
        //adding elements
        arrli1.add(0,9);
        arrli1.add(6); 
        arrli2.add(0,94);
        arrli2.add(63); 
        arrli2.add(1,55);
        
        //updating elements
        arrli1.set(1, 5);
        
        //clone the whole arrli1
       // System.out.println(arrli1.clone());
        
        //add ALL of arrli2 elements inside in arrli1
        arrli1.addAll(arrli2);
         
        //Remove all elements of arrli1
        arrli1.removeAll(arrli1);


        for(int i=0; i<arrli1.size(); i++){
            System.out.println(i+":"+arrli1.get(i));
        }*/
        
    }
    public static int arr(){
        ArrayList<Integer> arrli3 = new ArrayList<>();
        ArrayList<Integer> arrli4 = new ArrayList<>();

        arrli3.add(687); //adding elements inside an array it's automatically added at last 
        arrli3.add(0,789); //position of an array by int index
        arrli3.add(1,689);
        arrli3.add(2, 147);

        arrli4.add(1235);
        arrli4.add(1,5894); 
        arrli4.add(4619);
        arrli4.add(2,1256);
        arrli4.add(4619);
        arrli3.add(1273);

        arrli3.addAll(arrli4);
       // arrli3.clear();
       arrli3.ensureCapacity(5000);
       
           int r1 = arrli3.indexOf(4619);
          // int r2 =arrli3.lastIndexOf();
           System.out.println(arrli3.contains(1256));
           System.out.println(r1);
           System.out.println(arrli3.listIterator(1));
           System.out.println(arrli3.removeIf(n -> (n%2==0)));
          // arrli3.removeRange(0,3);
           arrli3.toArray();
           


       // arrli3.forEach((n) -> System.out.println(n));
       for(int z=0; z<arrli3.size(); z++){
           System.out.println(z+":"+arrli3.get(z));
       }
       return 0;
    }
}