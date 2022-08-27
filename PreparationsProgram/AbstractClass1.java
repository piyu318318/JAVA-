//abstract class in java
//if a class having a one abstract method then class must be defined as abstract.
//abstract class is called as in incomplete classs
//concrete class is a complete class which  means it does not have abstract methods. 
//WE can create constructor of an abstract class

abstract class Country
{
	abstract void show();
	String name1 ="piyush";
	String name2 ="ramos";
	void display()
	{
		System.out.println("abstract class can have abstract methods as well as it can have its own methods too.");
	}
}

class India extends Country //concrete class
{
	//now override the methods 
	void show()
	{
		System.out.println("its india");
	}

	void name()
	{
		System.out.println("name is "+name1);
	}
}

class Spain extends Country //concrete class
{
	//now override the methods 
	void show()
	{
		System.out.println("its spain");
	}

	void name()
	{
		System.out.println("name is "+name2);
	}
}


class AbstractClass1
{
	public static void main(String[] args) 
	{

		India obj1 = new India();				
		Spain obj2 = new Spain();				

		obj1.show();
		obj1.name();
		obj1.display();//you can call bcoz India class extends Country class

		System.out.println("\n");
		obj2.show();
		obj2.name();
		obj2.display();//you can call bcoz Spain class extends Country class


	}
}
