
/*
A message containing letters from A-Z can be encoded into numbers using the following mapping:
To decode an encoded message, all the digits must be grouped then mapped back into letters using the reverse of the mapping above (there may be multiple ways). For example, "11106" can be mapped into:

"AAJF" with the grouping (1 1 10 6)
"KJF" with the grouping (11 10 6)
Note that the grouping (1 11 06) is invalid because "06" cannot be mapped into 'F' since "6" is different from "06".

Given a string s containing only digits, return the number of ways to decode it.

The test cases are generated so that the answer fits in a 32-bit integer.


Input: s = "12"
Output: 2
Explanation: "12" could be decoded as "AB" (1 2) or "L" (12).


Input: s = "226"
Output: 3
Explanation: "226" could be decoded as "BZ" (2 26), "VF" (22 6), or "BBF" (2 2 6).

Input: s = "06"
Output: 0
Explanation: "06" cannot be mapped to "F" because of the leading zero ("6" is different from "06").

*/


import java.util.*;
class DeclareValues
{
	char convert(int check)
	{
		ArrayList<Integer> a1 = new ArrayList<>();
		ArrayList<Character> a2 = new ArrayList<>();
		char ch = 'a';
		a1.add(1);a1.add(2);a1.add(3);a1.add(4);a1.add(5);a1.add(6);a1.add(7);a1.add(8);a1.add(9);a1.add(10);a1.add(11);a1.add(12);a1.add(13);a1.add(14);a1.add(15);a1.add(16);a1.add(17);a1.add(18);a1.add(19);a1.add(20);a1.add(21);a1.add(22);a1.add(23);a1.add(24);a1.add(25);a1.add(26);
		a2.add('a');a2.add('b');a2.add('c');a2.add('d');a2.add('e');a2.add('f');a2.add('g');a2.add('h');a2.add('i');a2.add('j');a2.add('k');a2.add('l');a2.add('m');a2.add('n');a2.add('o');a2.add('p');a2.add('q');a2.add('r');a2.add('s');a2.add('t');a2.add('u');a2.add('v');a2.add('w');a2.add('x');a2.add('y');a2.add('z');

		int temp =0;

		for (int i=0;i<a1.size();i++) 
		{
			temp = a1.get(i);
			if(temp == check)
			{
				ch = a2.get(i);
			}	
		}


		return ch;
	}

}

class DecodeWays extends DeclareValues
{
	public static void main(String[] args) 
	{
		//String str ="09";
		//String str ="12"; ab
		String str="226";	
		DecodeWays obj = new DecodeWays();

		
		
		if(str.length() == 2)
		{
			StringBuffer strbuff = new StringBuffer(str);
			StringBuffer strbuff1 = new StringBuffer();
			String strarr[] =  str.split("");
			int intarr[] = new int[strarr.length];
			int temp;
			for(int i=0;i<strarr.length;i++) 
			{
				temp = Integer.parseInt(strarr[i]);
				if(temp>0 && temp<27)
					intarr[i] = temp;
				else
				{
					System.out.println("0");
					System.exit(0);
				}
			}
			StringBuffer buff1 = new StringBuffer();
			
			for (int i=0;i<strarr.length;i++) 
			{
				char ch = obj.convert(intarr[i]);
				buff1.append(ch);
			}
			
			//System.out.println(buff1);

		}

		if(str.length() > 2)
		{
			{
				StringBuffer strbuff = new StringBuffer(str);
				StringBuffer strbuff1 = new StringBuffer();
				
				strbuff.insert(1,' ');//add space for arraysplit

			//	System.out.println(strbuff);

				String str1 = strbuff.toString();//convert Stringbuffer into String 

				String strarr[] = str1.split(" ");
				int intarr[] = new int[strarr.length];
			
				int temp;
				for(int i=0;i<strarr.length;i++) 
				{
					temp = Integer.parseInt(strarr[i]);
					if(temp>0 && temp<27)
						intarr[i] = temp;
					else
					{
						System.out.println("0");
						System.exit(0);
					}
				}
			
				StringBuffer buff1 = new StringBuffer();
			
				for (int i=0;i<strarr.length;i++) 
				{
					char ch = obj.convert(intarr[i]);
					buff1.append(ch);
				}
				
				System.out.println(buff1);
			}
			

			//second clock for second op
			{
				StringBuffer strbuff = new StringBuffer(str);
				StringBuffer strbuff1 = new StringBuffer();
				
				strbuff.insert(2,' ');//add space for arraysplit

			//	System.out.println(strbuff);

				String str1 = strbuff.toString();//convert Stringbuffer into String 

				String strarr[] = str1.split(" ");
				int intarr[] = new int[strarr.length];

				int temp;
				for(int i=0;i<strarr.length;i++) 
				{
					temp = Integer.parseInt(strarr[i]);
					if(temp>0 && temp<27)
						intarr[i] = temp;
					else
					{
						System.out.println("0");
						System.exit(0);
					}
				}

				StringBuffer buff1 = new StringBuffer();
				
				for (int i=0;i<strarr.length;i++) 
				{
					char ch = obj.convert(intarr[i]);
					buff1.append(ch);
				}
				
				System.out.println(buff1);
			}

		}
	}	
}
