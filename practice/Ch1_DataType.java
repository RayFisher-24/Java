import java.util.Scanner;
public class Ch1_DataType { 
    public static void main(String args[]) { 
        System.out.println("DataType");
        //Write a program to sum three numbers in Java.
        int a = 24;
        int b = 21;
        int c = 20;
        int sum = a + b + c;
        System.out.println(sum);

        //Write a program to calculate CGPA using marks of three subjects (out of 100)
        float sub1 = 42;
        float sub2 = 52;
        float sub3 = 40;
        //Naver use a integer to get a output in float
        float CGPA = (sub1 + sub2 + sub3)/30;
        System.out.println(CGPA);

        //Write a Java program that asks the user to enter his/her name and greets them with Hello <name>, have a good day text.

        Scanner sc = new Scanner(System.in); //1st import Scanner from java.util.Scanner; 
        // Then create a (↥) new Scanner
        //System.in == input data from user
        System.out.println("Enter your Number ↧");
        String name = sc.next();
        System.out.println("hello "+name+", have a good day");

        //Write a Java program to convert Kilometers to miles.
        //1KM = 0.6213Miles
        float km =100;
        float miles = km/0.6213f;
        System.out.println(miles);

        //Write a Java program to detect whether a number entered by the user is an integer or not.
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter the Number");
        boolean number = sc2.hasNextInt(); //camelCaseConvertion
        System.out.println(number);

        //Write a Java program to convert temperature from Fahrenheit to Celsius degree.
        Scanner temp = new Scanner(System.in);
        System.out.print("Enter the Temp in F degree: ");
        float F = temp.nextFloat();
        float C = ((5*(F-32.0f))/9.0f);
        System.out.println(F+"F Converted into "+C+"C");

        //Write a Java program that reads a number in inches, converts it to meters.
        float inches = 5.0f;
        float meters = inches * 0.0254f;
        System.out.println(inches+"inch converts to "+meters+"meters");

        //Write a Java program that reads an integer between 0 and 1000 and adds all the digits in the integer.
        int num = 5656;
        int fDigit = num%10;
        int remainderNum = num/10;
        int sDigit = remainderNum%10;
        remainderNum = remainderNum/10;
        int tDigit = remainderNum%10;
        remainderNum = remainderNum/10;
        int frDigit = remainderNum%10;

        int sum = fDigit + sDigit + tDigit + frDigit;
        System.out.println(sum)

        //Write a Java program to convert minutes into a number of years and days.
        double minInYear = 60*24*365;
        double min = 3456789;

        long year = (long)(min/minInYear);
        int day = (int)(min/60/24)%365;
        System.out.println((int) min + " min into " + year+" year "+ day+" day " );
        
        int minutes=3456789;
        int year = minutes / 525600;
        int day = minutes / 1440;
        int remainingMinutes = day % 525600;


        System.out.println(minutes + " minutes is " + year + " years and "  +  remainingMinutes + " days ");

       //Write a Java program that prints the current time in GMT.

        Scanner input = new Scanner(System.in);
        System.out.println("GMT time zone ");
        long timeZoneChange = input.nextInt();

        long totalMillieSec = System.currentTimeMillis();
        long totalSec = totalMillieSec/1000;
        long currentSec = totalSec%60;

        long totalMin = totalSec/60;
        long currentMin = totalMin%60;

        long totalhour = totalMin/60;
        long currentHour = ((totalhour+timeZoneChange)%24);

        System.out.println(currentHour+":"+currentMin+":"+currentSec);

        //Write a Java program to compute body mass index (BMI).

        double mass= 452;
        double hight= 72;        
        double BMI = mass*0.45359237/(hight*0.0254*hight*0.0254); //1lb = 0.45359237kg
        System.out.println(BMI); //1 in = 0.025400 m

        //Write a Java program to takes the user for a distance (in meters) and the time was taken (as three numbers: hours, minutes, seconds), and display the speed, in meters per second, kilometers per hour and miles per hour (hint: 1 mile = 1609 meters).
        double meters = 2500;
        double metersBySec = 0.000046766124*meters;
        System.out.println(metersBySec);

        double hours = 5;
        double kmInHour = 0.084179026*hours;
        System.out.println(kmInHour);
        //Write a Java program that reads a number and display the square, cube, and fourth power.
        double val = 15;
        System.out.printf("Fourth power: %6.2f\n", Math.pow(val, 4));
        
        //Write a Java program to break an integer into a sequence of individual digits.
        
        int n1 = 12345/10000%10;
        int n2 = 12345/1000%10;
        int n3 = 12345/100%10;
        int n4 = 12345/10%10;
        int n5 = 12345/1%10;
        System.out.println(n1+" "+n2+" "+n3+" "+n4+" "+n5);
        
        //Write a Java program to test whether a given double/float value is a finite floating-point value or not.
        Double dn1 = 0.000213456321d;
        boolean d1f = Double.isFinite(dn1);
        Double dn2=dn1/0;
        boolean d2f=Double.isFinite(dn2);
        Double dn3=Double.POSITIVE_INFINITY *0;
        boolean d3f=Double.isFinite(dn3);
        System.out.println("\nFinite");
        System.out.println(dn1 +" is "+ d1f);
        System.out.println(dn2 +" is "+ d2f);
        System.out.println(dn3 +" is "+ d3f);

        Float fn1 = 5.3f;
        boolean f1f = Float.isFinite(fn1);
        Float fn2 = fn1/0;
        boolean f2f = Float.isFinite(fn2);
        Float fn3 = 0f/0f;
        boolean f3f = Float.isFinite(fn3); //not a number
        System.out.println(" ");
        System.out.println(fn1 +" is "+ f1f);
        System.out.println(fn2 +" is "+ f2f);
        System.out.println(fn3 +" is "+ f3f); 

        //Write a Java program to compare two given signed and unsigned numbers.
        int in1 = Integer.MIN_VALUE;
        int in2 = Integer.MAX_VALUE;
        System.out.println(in1+","+in2);
        System.out.println("-----------------");

        int compareSingedNum= Integer.compare(in1,in2);
        System.out.println(compareSingedNum);

        int compareUnsingedNum = Integer.compareUnsinged(in1, in2);
        System.out.println(compareUnsingedNum);

        //Write a Java program to compute the floor division and the floor modulus of the given dividend and divisor.
        int x = -2365;
        int y = 125;
        System.out.println();
        System.out.println("Floor division using '/' operator: " + (x / y));
        System.out.println("Floor division using floorDiv() method is: " + Math.floorDiv(x, y));
        System.out.println();
        System.out.println("Floor modulus using '%' operator: " + (x % y));
        System.out.println("Floor modulus using floorMod() method is: " + Math.floorMod(x, y));

     
        //Write a Java program to extract the primitive type value from a given BigInteger value.
        BigInteger bigval = BigInteger.valueOf(Long.MAX_VALUE);
        System.out.println("\nBigInteger value: "+bigval);
		long val_Long = bigval.longValue();
		System.out.println("\nConvert the said BigInteger to an long value: "+val_Long);
        int val_Int = bigval.intValue();
		System.out.println("\nConvert the said BigInteger to an int value: "+val_Int);
        short val_Short = bigval.shortValue();
        System.out.println("\nConvert the said BigInteger to an short value: "+val_Short);
        byte val_Byte = bigval.byteValue();
        System.out.println("\nConvert the said BigInteger to byte: "+val_Byte);
        long val_ExactLong = bigval.longValueExact();
		System.out.println("\nConvert the said BigInteger to exact long: "+val_ExactLong);
    
        //Write a Java program to get the next floating-point adjacent in the direction of positive and negative infinity from a given float/double number. 
        float fn = 0.2f;
        System.out.println("\nInitial floating number: " + fn);		
        float next_down_fn = Math.nextDown(fn);
        float next_up_fn = Math.nextUp(fn);
        System.out.println("Float " + fn + " next down is " + next_down_fn);
        System.out.println("Float " + fn + " next up is " + next_up_fn);
        double dn = 0.2d;
       System.out.println("\nInitial double number: " + dn);		
        double next_down_dn = Math.nextDown(dn);
        double next_up_dn = Math.nextUp(dn);
        System.out.println("Double " + dn + " next down is " + next_down_dn);
        System.out.println("Double " + dn + " next up is " + next_up_dn);
    } 
}