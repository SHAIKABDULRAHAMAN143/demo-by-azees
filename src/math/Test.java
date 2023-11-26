package math;

public class Test {
	public static void main(String[] args) {
		System.out.println("main starts ");
		int a=10;
		System.out.println(a+2);
		System.out.println(a-2);
		System.out.println(a*2);
		try 
		{
		System.out.println(a/0);
		
		}
		catch(ArithmeticException e) 
		{
			System.out.println("cant divide the number by zero ");
		}
	}
	}
	

