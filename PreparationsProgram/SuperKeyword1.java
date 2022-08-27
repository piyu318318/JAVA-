//super keyword used to call super class constructor.
//super keyword used to call super class methods.
//super keyword also used to refer the superclass variables. 


class A
{
	A()
	{
		System.out.println("In A Default constructor"); 
	}

	A(int i)    //will executes first step1
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

	B(int i) 
	{
		super(i);//willl call superclass para constructors  
		System.out.println("In B parameterized con");//step2 will execute this statment 
	}
}


class SuperKeyword1
{
	public static void main(String[] args) 
	{
		B obj = new B(9);//step 1
	}
}
