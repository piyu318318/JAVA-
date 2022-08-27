import java.util.*;
import java.io.*;
class PalindromeStringUsingArrayList
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a String to check its palindrome or not :");
		String str1 = br.readLine();
		ArrayList <Character>a1 = new ArrayList<Character>();
		ArrayList <Character>a2 = new ArrayList<Character>();

		for (int i=str1.length()-1;i>=0;i--) 
		{
			char temp=str1.charAt(i);
			a1.add(temp);	
		}

		for (int i=0;i<str1.length();i++) 
		{
			char temp=str1.charAt(i);
			a2.add(temp);	
		}


		if(a1.equals(a2) == true)
			System.out.println("Palindrome");
		else
			System.out.println("not a palindrome");
	}
}
