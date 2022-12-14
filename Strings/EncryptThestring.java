/*
Input:
S = "aaaaaaaaaaa"
Output:
ba 
Explanation: 
aaaaaaaaaaa
Step1: a11 (a occurs 11 times)
Step2: a11 is ab [since 11 is b in
hexadecimal]
Step3: ba [After reversing]


Input:
S = "abc"
Output:
1c1b1a
Explanation: 
abc
Step1: a1b1c1
Step2: 1c1b1a [After reversing]
*/

import java.util.*;
public class EncryptThestring
{
	public static void main(String[] args) 
	{
		//System.out.println(Integer.toHexString(val1));

		Hashtable<Character,Integer> h1 =  new Hashtable<Character,Integer>();  

		String s2 = "aaaaaaaaaaa";
		StringBuffer s1 = new StringBuffer(s2) ;

		//char temp = s1.charAt(0);				

		int count =0;

		for (int i=0;i<s2.length();i++) 
		{
			char temp = s2.charAt(i);				

			for (int j=0;j<s2.length();j++) 
			{
				if(s2.charAt(j) == temp && s2.charAt(j)!='0')
				{
					count++;
					s1.insert(j,'0');
				}	
			}
			Integer.toHexString(count);
			h1.put(temp,count);
			count=0;

		}

		System.out.println(h1);
		
			 	
	}
}