class A
{
	A()
	{
		System.out.println("In A Default constructor");//step 3 this will execute first goes to 
	}

	A(int i)
	{
		System.out.println("In A parameterized con");
	}
}

class B extends A
{
	B()
	{
		System.out.println("In B Default constructor");
	}

	B(int i)//step 2 will execute this after superclass default constructor gets execute. 
	{
		System.out.println("In B parameterized con");
	}
}


class ConstructorsInInheritance1
{
	public static void main(String[] args) 
	{
		B obj = new B(9);//step 1
	}
}
