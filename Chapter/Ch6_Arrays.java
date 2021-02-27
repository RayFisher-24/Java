import java.util.Scanner;
public class Ch6_Arrays { 
    public static void main(String args[]) { 
        System.out.println("Arrays");
        int [] marks = {45,87,98,88,30,71,63,45,12,32};
        System.out.println("Marks of Zero " + marks[0]);
        System.out.println("Marks of one " + marks[1]);
        System.out.println("The Length of the Array is "+ marks.length);

        System.out.println("Array using loops");
        for (int i=0; i<marks.length; i++){
            System.out.println(marks[i]);
        }

        System.out.println("Array in Reverce order");
        for (int i=marks.length-1; i>=0; i--){
            System.out.println(marks[i]);
        }

        String [] Students = {"Arijit", "Roishe", "Dishari", "Aditi"};
        System.out.println(Students.length);

        float [] flop = {2.4f, 2.6f};
        System.out.println(flop[0]);

        System.out.println("2-D Arrays");
        int [][] flats;
        flats = new int[2][3];
        flats[0][0]=101;
        flats[0][1]=102;
        flats[0][2]=103;
        //Each floor have 3 rooms
        flats[1][0]=201;
        flats[1][1]=202;
        flats[1][2]=203;

        for(int i=0; i<flats.length;i++){
            for(int j=0; j<flats[i].length;j++){
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
        
        //Create an array of 5 floats and calculate their sum
        float [] arraysOf = {2.1f,2.1f,5.3f,5.3f,1.1f};
        float sum_arraysOf = arraysOf[0]+arraysOf[1]+arraysOf[2]+arraysOf[3]+arraysOf[4];
        System.out.printf("%.2f%n",sum_arraysOf);

       // float [] arraysOf = {2.1f,2.1f,5.3f,5.3f,1.1f};
        //float sum =0;
        for(float elements:arraysOf){
            sum = sum+elements;   
        }
        System.out.printf("%.2f%n",sum);
       
       //Write a program to find out whether a given integer is present in an array or not.
        float [] arraysOf = {2.1f,2.1f,5.3f,5.3f,1.1f};
        float num =2.1f;
        boolean isInArrays = false;
        for(float elements:arraysOf){
            if(num==elements){
                isInArrays = true;
            }  
        }
        if(isInArrays){
            System.out.println("The value inside in this Array");
        }
        else{
             System.out.println("The value not inside in this Array");
        }

        //Calculate the average marks from an array containing marks of all students in physics using a for-each loop.
        float [] marksOfPhysics = {24,55,17,87,100};
        float sum = 0;
        for(float elements:marksOfPhysics){
            sum = (sum+elements);
        }
        System.out.println(sum/marksOfPhysics.length);

        //Create a Java program to add two matrices of size 2x3.
       
       int [][] mat1 = {{1,2,3},{4,5,6}};
       int [][] mat2 = {{6,5,4},{3,2,1}};
       int [][] result = {{0,0,0},{0,0,0}};

       for (int i=0;i<mat1.length;i++){ // row number of times
            for (int j=0;j<mat1[i].length;j++) { // column number of time
                System.out.format(" Setting value for i=%d and j=%d\n", i, j);
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }        

        for(int i=0;i<mat1.length;i++){
            for(int j=0;j<mat1[i].length;j++){
                System.out.print(result[i][j]);
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
            System.out.println(" ");
            
        }     
        
        //Write a Java program to reverse an array.
        int [] reverseOfArr;
        reverseOfArr = new int[5];
        reverseOfArr[0]=62;
        reverseOfArr[1]=52;
        reverseOfArr[2]=42;
        reverseOfArr[3]=32;
        reverseOfArr[4]=22;
        
        for(int i=reverseOfArr.length-1;i>=0;i--){
            System.out.print(reverseOfArr[i]);
            System.out.print(" ");
        }
        
        //Reverse by Swapping
        int [] arr = {1, 21, 3, 4, 5, 34, 68};
        int l = arr.length;
        int n = Math.floorDiv(1,2);
        int temp;

        for(int i=0;i<n;i++){
            temp = arr[i];
            arr[i]= arr[l-i-1];
            arr[l-i-1] = temp;

        }
        for(int element:arr){
            System.out.print(element+" ");
        }

        //Write a Java program to find the maximum element in an array.
        int [] arr = {1, 21, 3, 4, 5, 34, 68};
        int max = Integer.MIN_VALUE;

        for(int e:arr){
            if(max<e){
                max = e;
            }
        }
        System.out.println(max);
        
        //Write a Java program to find the maximum element in a Java array.
        int [] arr = {1, 21, 3, 4, 5, 34, 68};
        int min = Integer.MAX_VALUE;

        for(int e:arr){
            if(min>e){
                min = e;
            }
        }
        System.out.println(min);
        
        //Write a Java program to find whether an array is sorted or not.
        int [] arr = {1,2,3,4,5};
        boolean isSorted =true;

        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                isSorted = false;
                break;
            }
        }
        if(isSorted){
            System.out.println("Array is Sorted");
        }
        else{
            System.out.println("Array is not Sorted");
        }

    }
}        