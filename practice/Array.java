import java.util.Scanner;
class student{
    public int roll;
    public int universityId;
    public String name;
    public int phoneNumber;
    public String hobby;

    student(int roll, int universityId, String name, int phoneNumber, String hobby){
        this.roll=roll;
        this.universityId=universityId;
        this.name=name;
        this.phoneNumber=phoneNumber;
        this.hobby=hobby;
    }

}
class runTime{
    public int a,b,c;
    runTime(int a, int b, int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
}
public class Array{

    public static int array(int[] arr){
        int sum=0;

        for(int w=0; w<arr.length;w++){
            sum+=arr[w];
            System.out.println(arr[w]);
            System.out.println(sum);
        }
        System.out.println(arr.getClass());
        return sum;
    }


    //Create an array of 5 floats and calculate their sum.
    public static void sum(float [] floatSum){

        float sum1=0;
        for(int p=0; p<floatSum.length;p++){
            sum1 += floatSum[p];
        }
        System.out.println(sum1);

    }

    //Write a program to find out whether a given integer is present in an array or not.
    public static void cheakArray(int [] presenting){
        Scanner w = new Scanner(System.in);
        System.out.println("Enter the checking value ");
        int check = w.nextInt();
        boolean isInArray = false;
        for(int e:presenting){
            if(e==check){
               isInArray = true;
                break;
            }
        }
        if(isInArray){
            System.out.println("yes");
        }
    }

    //Calculate the average marks from an array containing marks of all students in physics using a for-each loop.
    public static void avg(int [] phyMark){

        int sum=0;

        for(int elements:phyMark){
           sum = sum + elements;
        }
        int average = sum/phyMark.length;
         System.out.println("The sum is "+average);
    }

    //Create a Java program to add two matrices of size 2x3

    public static void arr3D(int [][] DDD){
        for(int i=0; i<DDD.length; i++){
            for(int j=0; j<DDD[i].length; j++){
                int sum = DDD[i][j]+DDD[i][j];
                System.out.print(sum);
            }
        }
    }

    public static void main(String[] args) {
       System.out.println("ARRAY");

       int [][] DDD = new int[2][3];
       //1st 
       DDD[0][0]=101;
       DDD[0][1]=102;
       DDD[0][2]=103;
       //2nd
       DDD[1][0]=201;
       DDD[1][1]=202;
       DDD[1][2]=203;

       arr3D(DDD);


      /* //Problem-1
        float [] floatSum = new float[5];
        floatSum[0]=4.69f;
        floatSum[1]=7.69f;
        floatSum[2]=8.69f;
        floatSum[3]=1.69f;
        floatSum[4]=8.69f;
        sum(floatSum);

        //Problem-2
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number1: ");
        int a = sc.nextInt();
        System.out.print("Enter the number2: ");
        int b = sc.nextInt();
        System.out.print("Enter the number3: ");
        int c = sc.nextInt();

        int [] presenting = new int[3];
        presenting[0]=a;
        presenting[1]=b;
        presenting[2]=c;
        cheakArray(presenting);

        //Problem-3
        int [] phyMark = new int[5];
        phyMark[0]=69;
        phyMark[1]=75;
        phyMark[2]=87;
        phyMark[3]=91;
        phyMark[4]=68;
        avg(phyMark);

        //Problem-4


       int [] arr = new int[4];
       arr[0]=10;
       arr[1]=9;
       arr[2]=4;
       arr[3]=16;
       array(arr);

       int [] cloneArr = arr.clone();
       System.out.println(cloneArr==arr);
       System.out.println(cloneArr[0]==arr[0]);

        String [][] nameField;
        nameField = new String[2][3];

        System.out.println(nameField.getClass().getSuperclass());
        
        //1st Array
        nameField[0][0]="Arijit";
        nameField[0][1]="Roishe";
        nameField[0][2]="Huru";
        
        //2nd Array
        nameField[1][0]="Sam";
        nameField[1][1]="Ram";
        nameField[1][2]="Jojo";

        for(int i=0; i<nameField.length; i++){
            for(int j=0; j<nameField[i].length; j++){
                System.out.print(nameField[i][j]+" ");

            }System.out.print("\n");
        }

        int [][] intArray;
        intArray = new int[2][2];
        intArray[0][0]=101;
        intArray[0][1]=102;
        intArray[1][0]=201;
        intArray[1][1]=202;

        for(int i=0; i<intArray.length; i++){
            for(int j=0; j<intArray[i].length;j++){
                System.out.print(intArray[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }

       student [] arr;
       arr=new student[3];
       arr[0]=new student(1, 20600314, "Arijit", 91233,"Programming");
       arr[1]=new student(2, 20600331, "David", 89269,"Photography");
       arr[2]=new student(3, 20600369, "Sam", 78443,"UX");

       for(int i=arr.length-1;i>=0;i--){
           System.out.println(arr[i].name);
       }  

       int [] arr1 = new int[2];
       arr1[0]=10.0f;
       arr1[1]=10.0f;

       for(int e:arr1){
           if(e%2==0){
               System.out.println(e);
           }   
       }

       double [] arr = new double[5];
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        arr[3]=4;
        arr[4]=5;
        
        double sum=0;
        for(int i=0; i<arr.length;i++){
            sum= sum +arr[i]; 
        }
        System.out.println(sum);
        double average = sum/arr.length;
        System.out.println(average);

       int [] arr = {1,2,3,4,5,6};
       for(int i=0; i<arr.length; i++){
           System.out.println(arr[i]);
       }

       runTime [] arr;
       arr = new runTime[2];
       arr[0]=new runTime(1,2,3);
       arr[1]=new runTime(4,5,6);
      // arr[2]=new runTime(6,9,3);

       for(int j=0; j<arr.length;j++){
           System.out.println(arr[j].a);
       }

       
       student [] arr;
       arr=new student[3];
       arr[0]=new student(1, 20600314, "Arijit", 91233,"Programming");
       arr[1]=new student(2, 20600331, "David", 89269,"Photography");
       arr[2]=new student(3, 20600369, "Sam", 78443,"UX");

        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i].name);
        }
       for(student e:arr){
           System.out.println(e);
       }

       int [] arr = new int[5];
       arr[0]=5;
       arr[1]=4;
       arr[2]=9;
       arr[3]=8;
       arr[4]=9;
       //System.out.println(arr[4]);
       for(int i=0; i<arr.length;i++){
           System.out.println("Index of "+ i+" : "+arr[i]);
       }*/
    }
}