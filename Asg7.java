import java.util.*;
class Asg7
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("First number: ");
		int i = sc.nextInt();
		System.out.println("Second number: ");
		int j = sc.nextInt();
		
		System.out.println("Multiplication ");
		int c = i*j;
		System.out.println("Result: "+c);
		
		System.out.println("Quotient: ");
		double d = i/j;
		System.out.println("Result: "+c);
		
		System.out.println("Addition: ");
		int e = i+j;
		System.out.println("Result: "+c);
		
		System.out.println("Subtraction: ");
		int f = i-j;
		System.out.println("Result: "+c);
		
		System.out.println("Remainder: ");
		int g = i%j;
		System.out.println("Result: "+c);
	}
}