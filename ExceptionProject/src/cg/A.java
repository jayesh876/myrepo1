package cg;

class A
{
	public void show() throws Exception      ///// can throw superexception
	{
		throw new Exception("Invalid salary");
	}
}
class B extends A
{
	
	public void show() throws SalException    ///   either same or subclassexception
	{
		throw new SalException("",2000);
	}
	
}

// if superclass method can declare superexception checked exception and overrided method can throw same or suclass exception
// if superclass method does not declare any exception then overrided method should not throw any exception or it can throw unchecked excetion