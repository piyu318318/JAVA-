//we can oveload the main method in java.
//but we cannot override the main method in java. 

class MainMethodOverload
{

	public static void main(int args) 
	{
		System.out.println("main method with int arguments .");
	}

	public static void main(char args) 
	{
		System.out.println("main method with char arguments .");
	}

	public static void main(String[] args) 
	{
		System.out.println("main method with string arguments .");
		MainMethodOverload.main(1);
		MainMethodOverload.main('a');

	}
}
