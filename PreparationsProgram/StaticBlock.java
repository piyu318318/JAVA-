//in static blocks this class is called by jvm and always executes first in the program
class Demo
{

	void show()
	{
		System.out.println("in show method");
	}

	static
	{
		System.out.println("in static class this class is called by jvm and always executes first in the program");
	}
}

class StaticBlock
{
	public static void main(String[] args) 
	{
		Demo obj= new Demo();
		obj.show();	
	}
}
