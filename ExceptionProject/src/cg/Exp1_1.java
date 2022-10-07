package cg;

public class Exp1_1
{
	public static void change(int x)
	{
		int y=55/x;
	}
	public static void main(String args[])
	{
		int a=0;
		
		a=Integer.parseInt(args[0]);
			change(a);
		
		System.out.println("The End");
	}
}