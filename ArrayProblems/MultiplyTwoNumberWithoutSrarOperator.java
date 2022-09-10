//multiply two numbers without * operator
import java.io.*;
class MultiplyTwoNumberWithoutSrarOperator
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter first number :");
        int a = Integer.parseInt(br.readLine());
		System.out.println("Enter second number :");
        int b = Integer.parseInt(br.readLine());
        int sum=0;
        for(int i=0;i<b;i++)
        {
        	sum = sum +a;
        }	
		
		System.out.println("Multiplication of "+a+" and "+b+" is :"+sum);
	}

}