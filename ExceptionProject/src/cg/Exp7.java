package cg;

public class Exp7
{
	public static void change(int x) throws SalException
	{	try{
		if (x<=2000)
		{
			// throw new NullPointerException();  // unchecked
			throw new SalException("Invalid Salary",x); //checked
		}
		}
		finally{
			System.out.println("change method finally");		
		}
	}
	public static void main(String args[])
	{
		int a=0;
		try
		{
			a=Integer.parseInt(args[0]);
			change(a);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());	
			e.printStackTrace();
		}
		finally{
			System.out.println("Normal method finally");
		}	
		System.out.println("The End");
	}
}
