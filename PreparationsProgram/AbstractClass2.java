
//we can create constructor of abstract class

abstract class Piyush
{
	abstract void show();
	static int i=0;
	Piyush()
	{
		System.out.println("i am piyush"+ i);//we can use staic variables in constructors.
		System.out.println("i am piyush");
	}
}

class Demo extends Piyush
{
	void show()
	{
		System.out.println("In show method ");
	}
}
class AbstractClass2
{
	public static void main(String[] args) 
	{
		Piyush obj = new Demo();		
		obj.show();
	}	
}
