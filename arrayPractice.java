import java.util.Scanner;
import java.util.Arrays;
public class arrayPractice { 
    public static boolean con(int[] arr, int item){
        for(int n: arr){
            if(item==n){
                return true;
            }
        }
         return false;
    }

    public static void main(String args[]) { 

      /*  Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();*/

        int[] arr1={1789, 2035, 1899, 1456, 2013, 
            1458, 2458, 1254, 1472, 2365, 
            1456, 2265, 1457, 2456};
        //System.out.println(con(arr1[0], n));   
        System.out.println(arr1[0]); 

     /*  int [] arr1 = {
           8,9,7,4,5,2,3,1,6,10
       };

       Arrays.sort(arr1);
       System.out.println(Arrays.toString(arr1));

       String [] arr2 = {
           "java", "python", "c#", "c++"
       };

        Arrays.sort(arr2);
       System.out.println(Arrays.toString(arr2));

       int [] array = {4,8};
       int sum = 0;

       for(int e:array){
           sum=sum+e;
           
       }
       System.out.println(sum);

       int i,j,n=10;
       int [][] a = new int[10][10];
       for(i=0;i<n;i++){
           for(j=0;j<n;j++){
               System.out.printf("%2d", a[i][j]);
           }
           System.out.println();
       }
        int [] a ={20, 30, 25, 35, -16, 60, -100};
        int sum = 0;
        //double result;
        for(int i=0;i<a.length;i++)
            sum =sum+a[i];
            double avg = sum /a.length;
        System.out.println(avg);*/
        
    }
        
}
