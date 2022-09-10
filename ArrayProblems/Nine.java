//check datatype entered in a string is it integer or flaot

import java.io.*;

class Nine
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a String : ");
		String str = br.readLine();
		int flag=0;
		int len = str.length();
		for(int i=0;i<len;i++)
		{
			if(Character.isLetter(str.charAt(i)))
				{
					flag=4;
					break;
				}

			if(Character.isDigit(str.charAt(i)))
			{
				flag=1;
			}			
		}
		
		if(flag == 1 && str.contains("."))
		{
			System.out.println("It contains double or float datatype");
			
		}
		else if(flag ==1 )
		{
			System.out.println("String contains integer datatype");
		}
		else if(flag ==0)
		{
			System.out.println("String doesnt contains integer or flaot or double datatype");
		}
		else if(flag == 4)
		{
			System.out.println("string contains letters.");
		}
	}
}