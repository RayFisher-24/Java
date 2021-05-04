import java.util.ArrayList;
//import java.lang.*;



public class Ad_1_ArrayList{
    public static int questions(){
        //Write a Java program to create a new array list, add some colors (string) and print out the collection
        
        return 0;
    }
    public static void main(String args[]) {

        //Questions
        try{
            int q = questions();
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