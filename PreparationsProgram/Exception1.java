class Demo extends Exception
{
	public mahexcep(String s)
	{
		super(s);
	}	
}

public class Exception1
{
	public static void main(String[] args) 
	{
		try
		{
			throw new mahexcep("piyush");
		}
		catch
		{
			  System.out.println("Caught");
		}
	}		
}