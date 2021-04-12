public class Ch5_Loops { 
    public static void main(String args[]) { 
        System.out.println("Loops");
      byte x = 3;
       while (x<99){
           System.out.println(x);
           x++;
       }

       int x = 5; 
       int y = 4;
        while (x+y==9){
           for (inty=4; y<20; y++){
                System.out.println(y);    
           }
        }
        
        int y = 25;
        do{
            System.out.println(y);
            y--;
        }while(y>0);
        

        for (int y=0; y<10; y++){
            System.out.println(y);
        }

        */

        /*Write a program to print the following pattern
            ****

            ***

            **

            * 
          */
       	int n =4;
        for (int y=n; y>0; y--){
            for (int j=0; j<y; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }

        //Write a program to sum first n even numbers using a while loop
        int sum = 0;
        int n = 3;
        int i = 0;
        while(i<n){
            sum = sum + (2*n);
            System.out.println("the number is " + sum);
            i++;
        }
        //Write a program to print the multiplication table of a given number n.
        int table = 3;
        for (int i=1; i<=10; i++){
            System.out.printf("%d X %d = %d \n", table, i, table*i);
        }

        //Write a program to print a multiplication table of 10 in reverse order.
        int tableOfTen = 10;
        for (int j=10; j>=1; j--){
            System.out.printf("%d X %d = %d \n", tableOfTen, j, tableOfTen*j);
        }

        //Write a program to find factorial of a given number using for loops.

        int factorial = 1;
        for(int i=1; i<=5; i++){
            factorial*=i;
            System.out.println(factorial);
        }

        //What can be done using one type of loop can also be done using the other two types of loops - True or False.
        //Ans - True

        //Write a program to calculate the sum of the numbers occurring in the multiplication table of 8.
        int n = 8;
        int sum = 0;
        //for(int i=0; i<10; i++) - Goes from i=0 to i=9
        for(int i=1;i<=10;i++){
            sum += n*i;
        }
        System.out.println(sum);
    }
}