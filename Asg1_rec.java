
/*
Test Data:
Width = 5.5 Height = 8.5
Expected Output
Area is 5.6 * 8.5 = 47.60
Perimeter is 2 * (5.6 + 8.5) = 28.20
*/

class Asg1_rec
{
	
	public static void main(String args[])
	{
		//Scanner sc = new Scanner(System.in);
		float w = 5.5F;
		float h = 8.5F; 
		System.out.println("Widht = "+w);
		System.out.println("Height = "+h);
		double area;
		area = w*h;
		System.out.println("Area is 5.5 * 8.5 = "+area);
		double per;
		per = 2*(w+h);
		System.out.println("Area is 2 * (5.5 + 8.5) = "+per);
	}
}