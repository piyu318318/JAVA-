
//A class within a class is called as innnerclass in java.
//In Java, it is also possible to nest classes (a class within a class). 
/*The purpose of nested classes is to group classes that belong together, which makes your code more
 readable and maintainable.*/

class ABC
{
	int x=10;

	class XYZ
	{
		int y=20;
		int z=x+=y; //can acess the x bcoz XYZ is in the scope of class ABC
	}
}

class InnerClass
{
	public static void main(String[] args) 
	{
		ABC outer = new ABC();
		ABC.XYZ inner = outer.new XYZ();

		System.out.println(inner.y+outer.x);
		System.out.println(inner.z);

	}
}
