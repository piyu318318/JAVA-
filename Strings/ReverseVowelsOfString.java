/*
Given a string s, reverse only all the vowels in the string and return it.

The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both cases.

 Input: s = "hello"
Output: "holle"

Input: s = "leetcode"
Output: "leotcede"

*/

import java.util.*;
class ReverseVowelsOfString
{
	public static void main(String[] args) 
	{

		Stack <Character> a1= new Stack <>();
		String str = "leetcode";
//		String str = "hello";


		//String strarr[] = str.split("");

		StringBuffer strbuff1 = new StringBuffer(str);
		StringBuffer strbuff2 = new StringBuffer("");


		for (int i=0;i<strbuff1.length();i++) 
		{
			if(strbuff1.charAt(i) == 'a' || strbuff1.charAt(i) == 'e' || strbuff1.charAt(i) == 'i' || strbuff1.charAt(i) == 'o' || strbuff1.charAt(i) == 'u' || strbuff1.charAt(i) == 'A' || strbuff1.charAt(i) == 'E' || strbuff1.charAt(i) == 'I' || strbuff1.charAt(i) == 'O' || strbuff1.charAt(i) == 'U' )
			{
				char temp = strbuff1.charAt(i); 
				a1.push(temp);
			}
		}

		for (int i=0;i<strbuff1.length() ;i++ ) 
		{
			if(strbuff1.charAt(i) == 'a' || strbuff1.charAt(i) == 'e' || strbuff1.charAt(i) == 'i' || strbuff1.charAt(i) == 'o' || strbuff1.charAt(i) == 'u' || strbuff1.charAt(i) == 'A' || strbuff1.charAt(i) == 'E' || strbuff1.charAt(i) == 'I' || strbuff1.charAt(i) == 'O' || strbuff1.charAt(i) == 'U' )
			{
				char temp = a1.pop();
				strbuff2.append(temp);
				//strbuff2.charAt(i) = temp;
			}	
			else
				strbuff2.append(strbuff1.charAt(i));
		}


		System.out.println(strbuff2);		

	}
}
