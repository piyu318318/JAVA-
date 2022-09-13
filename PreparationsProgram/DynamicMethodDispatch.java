//dynamic method dispatch

/*
in dynamic method dispatch we create the reference  of parent class and object of a 
child class. as child class extends all properties from parent child knows all about
parent.parent class doesnt know about child class.

*/

class Apple
{
	void display()
	{
		System.out.println("Apple is fruit ");
	}
}

class Banana extends Apple
{
	void display() //oveerrride the method display
	{
		System.out.println("Banana is fruit");
	}
}

class DynamicMethodDispatch
{
	public static void main(String[] args) 
	{
		Apple obj  = new Banana(); //reference of parent and object of banana
		obj.display();
		//banana will get called bcoz we are allocating memory for the banana and
		//creating reference of Apple 
    

	}
}
