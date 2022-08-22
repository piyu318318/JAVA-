/*
Your task  is to implement the function atoi. The function takes a string(str) as argument and converts it to an integer and returns it.

Note: You are not allowed to use inbuilt function.

Input:
str = 123
Output: 123
Example 2:

Input:
str = 21a
Output: -1
Explanation: Output is -1 as all
characters are not digit only.
*/
class ATIO
{
	public static void main(String[] args) 
	{
		String str ="123";
		//String str ="123as";

		str = str +" ";
		
		String strarr[] = str.split(" ");

		int result =0;
		int flag=0;

		for (int i=0;i<str.length();i++) 
		{
			if(Character.isLetter(str.charAt(i)))
			{
				flag=1;
				break;
			}	
		}

		if(flag == 0)
		{
			for (int i=0;i<strarr.length;i++) 
			{	
				String temp = strarr[i];
				result = Integer.parseInt(temp);	
			}
		}
		

		if(flag==0)
			System.out.println("ATIO number is : "+result);
		else
			System.out.println("characters are not digit only.");

	}	
}
