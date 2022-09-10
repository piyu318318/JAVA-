//string palindrome
import java.io.*;

class Three
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;//=new String("race a car");
		System.out.println("Enter string");
		str = br.readLine();
		int len = str.length();
		char ch;
		String temp ="";
		
		/*
		for(int i=0;i<len-1;i++)
		{
			ch = str.charAt(i);
			temp = ch + temp; 
		}
		*/

		for(int i=len-1;i>=0;i--)
		{
			 ch = str.charAt(i);
			 temp = temp + ch;
		}

		System.out.println(temp);

		if(temp.equals(str))
			System.out.println("Its a palindrome string :");
		else
			System.out.println("Not a palindrome.");
	}

}