//finalize method is available in object class so any class can override finalize method
//finalize method  is protected
//has an empty implementation. In our class, clean-up activities are there. Then we have to override this method to define our clean-up activities.
//finalize() method releases system resources before the garbage collector runs for a specific object. 
//JVM allows finalize() to be invoked only once per object.
//when you want to perform some actions before obj deletes we use finalize
class Demo
{
	protected void finalize()
	{
		System.out.println("object is deleted btuh");
	}
}

class  FinalizeMethods
{
	public static void main(String[] args) 
	{
		Demo obj = new Demo();
		System.out.println("object is created ");

		obj.finalize();

	}	
}
