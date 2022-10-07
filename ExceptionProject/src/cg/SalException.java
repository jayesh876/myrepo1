package cg;

public class SalException extends Exception   /// checked exception
{
	private double sal;
   public SalException(String msg,double sal)
   {
	super(msg);
	this.sal=sal;
   }
@Override
public String toString() {
	return "SalException [sal=" + sal + "]"+ super.getMessage();
}



}