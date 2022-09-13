

class A
{
	int x=10;
}

class B extends A //extends all properties of A
{
	int y=20;
}

class C extends B //extends all properties of A as well as B bcoz B extends A and c extends B
{
	void add()
	{
		System.out.println("addition is "+(x+y));
	}
}

class Multilevel
{
	public static void main(String[] args) 
	{
		C obj = new C();
		obj.add();	
	}
}
