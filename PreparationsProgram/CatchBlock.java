//following will error generarte bocoz already Superclass Exception is catched the arithmatic error so.
/*
C:\java1\java remain concepts>javac CatchBlock.java
CatchBlock.java:14: error: exception ArithmeticException has already been caught
                        catch(ArithmeticException e)
                        ^
1 error

C:\java1\java remain concepts>
*/


class CatchBlock
{
	public static void main(String args[])
	{
			try
			{
					int y= 10/0;
			}
			catch(Exception e)
			{
				System.out.println("catched in exception block");
			}
			catch(ArithmeticException e)
			{
				System.out.println("catched in arithmatic exception block");
			}

	}
}
