//try clock contains code in which the exception is going to be occured and throws the exception
//catch block is used to catch the exception thrown by the try block
//finally block always gets executes 
//The finally block in java is used to put important codes such as clean up code e.g. closing the file or closing the connection
//Exception is throws and compiler will check linearly. 

class ExceptionsConcept
{
	public static void main(String[] args) 
	{
			
		String str = null;	
		int a=10;

		try
		{
			int b=1/0;//ArithMatic Exception throwed

			if(str.equals("piyush"))
				System.out.println("india");
			else
				System.out.println("hiiii");
		}
		
		catch(ArithmeticException ae)//if you try to access obj who is refering null at that time catch will catches the exception 
		{
			System.out.println(" Arithmatic  exception");
		}

		catch(NullPointerException ne)//if you try to access obj who is refering null at that time catch will catches the exception 
		{
			System.out.println(" null pointer exception");
		}
    
	    finally
	    {
	      System.out.println("i always executes");
	    }
		
	}
} 
