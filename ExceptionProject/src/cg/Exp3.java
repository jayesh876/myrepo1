package cg;

public class Exp3
{
	public static void change(int x)
	{
		int y=55/x;
	}
	public static void main(String args[])
	{
		int a=0;
		try
		{
			a=Integer.parseInt(args[0]);
			change(a);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());	
			e.printStackTrace();
		}
		catch(NumberFormatException e)
		{
			System.out.println(e.getMessage());	
			e.printStackTrace();
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("The End");
	}
}
