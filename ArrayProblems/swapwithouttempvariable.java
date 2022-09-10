import java.io.*;
class swapwithouttempvariable
{
	public static void main(String[] args) 
	{
		int a=2,b=8;
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.print("after swapping value od a :"+a+" value of b:"+b);
	}	
}