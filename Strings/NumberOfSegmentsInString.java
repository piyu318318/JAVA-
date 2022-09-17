/*
Given a string s, return the number of segments in the string.
A segment is defined to be a contiguous sequence of non-space characters.

Input: s = "Hello, my name is John"
Output: 5
Explanation: The five segments are ["Hello,", "my", "name", "is", "John"]


Input: s = "Hello"
Output: 1

*/


class NumberOfSegmentsInString
{
	public static void main(String[] args) 
	{
		//String str = "Hello, my name is John";
		String str = "Hello";
		char chararr[] = str.toCharArray();

		int count=1;
		
		char check =' ';

		for (int i=0;i<chararr.length;i++) 
		{
			if(chararr[i] == check)
			{
				count++;
			}	
		}

		System.out.println(count);

	}
}
