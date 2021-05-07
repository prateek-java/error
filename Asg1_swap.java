import java.util.*;

class Asg1_swap
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);         //	Scanner sc = new Scanner(System.in);
		System.out.println("Input number_1: ");
		int num_1 = sc.nextInt();  // 10
		System.out.println("Input Number_2: ");
		int num_2 = sc.nextInt();  //20
		
		num_1 = num_1*num_2;  // 10*20
		num_2 = num_1/num_2;  //200/20=10
		
		num_1 = num_1/num_2;  // 200/10=20
		
		System.out.println("number_1 = "+num_1 +" "+"number_2 = "+num_2);
	}
}
		
		