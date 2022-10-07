package cg;

public class Exp2
{
	public static void main(String args[])
	{
		int a=100;
		int b=0;
		try
		{	// monitor the error code
			 b=a/0;
			System.out.println(b);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Can not devide by zero");
			e.printStackTrace();
		}
		System.out.println("The End");
	}
}