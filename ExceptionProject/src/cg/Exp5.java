package cg;

public class Exp5
{
	public static void change(int x) throws Exception
	{
		if (x<=2000)
		{
			//throw new NullPointerException("Enter proper salary");  // unchecked  // manually throw or raise exception
			throw new Exception("Invalid Salary"); //checked  // either u write try catch or mention in method signeture to be thrown
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
		
		System.out.println("The End");
	}
}
