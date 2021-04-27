import java.lang.Math;
import java.util.Scanner;

class abc{
	abc(int a){
		double result = 2 * Math.PI * a * a;
		System.out.printf("The result is %.2f%n", result);
	}
}
class bcd{
	/*@Override
	public void run(){
		System.out.println("This is a Override Method from Thread");
	}*/
	public int sum(int a, int b){
		return a/b;
	}
	public void arr(){
		int [] arrays = new int[10];
		arrays[0] = 6;
		arrays[1] = 9;
		arrays[2] = 8;
		arrays[3] = 1;
		arrays[4] = 4;
		arrays[5] = 3;
		arrays[6] = 5;
		arrays[7] = 0;
		arrays[8] = 4;
		arrays[9] = 8;
		
		try{
			int a = arrays[12];
			System.out.println(a);
			int r = arrays[8]/arrays[7];
			System.out.println(r);
			
		} catch(ArrayIndexOutOfBoundsException a){
			System.out.println("The Exception is "+ a);
		} catch(ArithmeticException e){
			System.out.println("The Exception is "+ e);
		}
		
	}
}
class Myexception extends Exception{

	@Override
	public String getMessage(){
		return "This Number is less than 0";
	}

	@Override
	public String toString(){
		return "This Number Equal to 9";
	}

}

public class Excep{
	public static int abcd(int z) throws ArithmeticException{
		
		if(z<0){
			throw new Myexception();
		}
		return z;
	}
	public static void main(String args[]) {
		System.out.println("");
		try{	
			int r = abcd(3);
			System.out.println(r);
		}
		catch(Exception q){
			System.out.println("Exception");
		}
		
	
	/*	abc Exception1 = new abc(6);
		bcd Exception2 = new bcd();
		//Exception2.start();
		Exception2.arr();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number ");
		int a = sc.nextInt();
		if(a<9){
			try{
				throw new Myexception();
			} catch (Exception e){
				System.out.println(e.getMessage());
			}
		}
		else if(a>=9){
			try{
				throw new Myexception();
			} catch (Exception e){
				System.out.println(e.toString());
			}
		}
		
		try{
			int r = Exception2.sum(2,0);
			System.out.println(r);
		}
		catch(ArithmeticException a){
			System.out.println("The Exception is "+ a);
		}
		System.out.println("This the End of this Program");*/
		
	}
}