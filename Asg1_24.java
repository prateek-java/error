/*import java.util.*;
import java.lang.Math.*;

class Asg1_24
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
			sum = sum +(r*Math.pow(8,i));
			
			i++;
		}
		System.out.println(" Binary to  : "+(int)sum);
	}
}
*/
// Binary to Octal

import java.util.*;
import java.lang.Math.*;
class Asg1_24
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
		int j=1; double s = 0; int l=0; 
		while(sum!=0)
		{
			l=(int)sum%8;
			sum = sum/8;
			s = s+ l*j;
			j=j*10;
		}

		System.out.println(" Binary number to Octal : "+(int)s);
		
	}
}