import java.util.*;
class Asg1_12
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);    ////	Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the three numbers: " ); 
		System.out.println("Number_1: ");
		int num_1 = sc.nextInt();
		System.out.println("Number_2: ");
		int num_2 = sc.nextInt();
		System.out.println("Number_3; ");
		int num_3 = sc.nextInt();
		
		double avg;
		avg = (num_1+num_2+num_3)/3;
		System.out.println("Average = "+avg);
	}
}