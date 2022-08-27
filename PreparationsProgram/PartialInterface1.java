
interface Base
{
	void show();
	void display();
}

abstract class Derived1 implements Base
{
	public void display()
	{
		System.out.println("helllo from display");
	}
}

class Derived2 extends Derived1
{
	public void show()
	{
		System.out.println("Its show bro");
	}
	
}


class PartialInterface1
{
	public static void main(String[] args) 
	{
		Derived2 obj = new Derived2();
		obj.show();
		obj.display();
	}
}
