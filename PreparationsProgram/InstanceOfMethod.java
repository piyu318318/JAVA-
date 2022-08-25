//The java instanceof operator is used to test whether the object is an 
//instance of the specified type (class or subclass or interface).

class InstanceOfMethod
{
	public static void main(String[] args) 
	{
		InstanceOfMethod obj1 = new InstanceOfMethod();
		InstanceOfMethod obj2 = null;

		String str= new String("asd");
		System.out.println(obj1 instanceof InstanceOfMethod);//true 
		System.out.println(obj2 instanceof InstanceOfMethod);//false		

	}
}
