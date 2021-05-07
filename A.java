class A
{
	public static void main(String args[])
	{
		for(int index=0;true;index++)
		{
		int w = (int)888.8;
		byte x = (byte)100L;
		long y = (byte)100;
		byte z = (byte)100L;
		System.out.println("Enter Decimal number: "+w+" "+" "+x+" "+y+" "+z);
		System.out.println(++w*8);
		char a = 'A';
		a++;
		System.out.println((int)a);
		boolean b = true;
		if(b)
			System.out.println((int)a);
		//byte b = 50;
		//b=b*50;
		char p='D';
		char q= 84;
		p++;
		q++;
		System.out.println(p+" "+q);
		double m = 295.04;
		int o = 300;
		byte n = (byte)m;
		byte k = (byte)o;
		System.out.println(n+" "+k);
		break;
		}
		
	}
}