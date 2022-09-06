//we can create constructor of abstract class

abstract class ABC
{
	ABC(int a)
	{
		System.out.println("Parameterized Constructor of an abstract class a="+ x);
	}
}

class ConstructorOfAbstractClass extends ABC
{	
	ConstructorOfAbstractClass()
	{
		super(20);
		System.out.println("Class Constructor");
	}

	public static void main(String[] args) 
	{
		ConstructorOfAbstractClass obj = new ConstructorOfAbstractClass();
	}
}
