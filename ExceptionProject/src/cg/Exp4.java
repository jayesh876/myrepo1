package cg;

public class Exp4
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
		/*
		catch(ArrayIndexOutOfBoundsException e)   /// subclass exception catch block should come first
		{
			System.out.println(e.getMessage());	
			e.printStackTrace();
		}
		*/
		// 
		catch(Exception e)   // It must be last block
		{
			System.out.println("Common catch block");
			//System.out.println(e.getMessage());	
			e.printStackTrace();
		}

		System.out.println("The End");
	}
}
