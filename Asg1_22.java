import java.util.*;
import java.lang.Math.*;
class Asg1_22
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Binary number: ");
		
		int Num1 = sc.nextInt();
		int r;
		double sum=0;
		int i=0;
		while(Num1!=0)
		{
			r = Num1%10;
			Num1=Num1/10;
			
			sum = sum + (r*Math.pow(2,i));
			
			i++;
			
		}
		System.out.println(" Binary number to Decimal : "+(int)sum);
		
	}
}