package cg;

public class Exp6
{
	public static void change(int x) throws Exception
	{	try{
		if (x<=2000)
		{
			// throw new NullPointerException();  // unchecked
			throw new Exception("Invalid Salary"); //checked
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
		}
		finally{
			System.out.println("Normal method finally");
		}	
		System.out.println("The End");
	}
}
