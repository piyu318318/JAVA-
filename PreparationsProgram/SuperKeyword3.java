//super keyword used to call super class constructor.
//super keyword used to call super class methods.
//super keyword also used to refer the superclass variables. 


class A
{
	A()
	{
		System.out.println("In A Default constructor"); 
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
		super(6);  //will get called superclass para cons
		System.out.println("In B Default constructor");////after suoerclass con executes it will get called

	}

	B(int i) 
	{
		System.out.println("In B parameterized con"); 
	}
}


class SuperKeyword3
{
	public static void main(String[] args) 
	{
		B obj = new B(9);//step 1
	}
}
