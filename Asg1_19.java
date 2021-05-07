import java.util.*;

class Asg1_19
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Decimal number: ");
		
		int n = sc.nextInt();
		int r=0; int i=1; bn=0;
		
		while(n!=0)
		{
			r n%2;
			n=n/2;
			bn bn +r*i;
			i=i*10;
		}
				System.out.println("Print binary number: " +bn);
	}
	
}


/*
   bn   i   	r   n
   0	1   	0	10
   10	10		1	5
   10	100		0	2								bn	r	i
   1010	1000	1	1            last itr:   bn = 10+ 	1	*1000;
   
   */