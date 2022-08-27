

/*whenever you create the object of subclass superclass constructor 
will get called first then it will call subclass constructor*/

class A
{
	A()
	{
		System.out.println("In class A");//will get execute first
	}
}


class B extends A
{

	B()
	{
		//super();///will call the superclass constructor means call the A()
		System.out.println("In class B");//will get execue after class A constructor
	}
}

class ConstructorsInInheritance
{
	public static void main(String[] args) 
	{
		B  obj = new B();		
	}	
}
