//we can overload the static methods in java but we cannot ovverride the static methods.
//to avoid the overriding we use static keyword or final keyword.
class Animal
{
	static void display(String name,int age)
	{
		System.out.println("Dog name is  "+name+" dog age is :"+name);
	}

	static void display(String name)
	{
		System.out.println("Dog name is  "+name);
	}
}

class StaticMethodOveload
{
	public static void main(String[] args) 
	{
		Animal obj = new Animal();
		obj.display("royal");
		obj.display("jerry",10);

	}		
}
