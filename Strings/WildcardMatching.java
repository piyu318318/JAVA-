/*
Given an input string (s) and a pattern (p), implement wildcard pattern matching with 
support for '?' and '*' where:

'?' Matches any single character.
'*' Matches any sequence of characters (including the empty sequence).
The matching should cover the entire input string (not partial).

Example 1:

Input: s = "aa", p = "a"
Output: false
Explanation: "a" does not match the entire string "aa".

Example 2:

Input: s = "aa", p = "*"
Output: true
Explanation: '*' matches any sequence.

Example 3:

Input: s = "cb", p = "?a"
Output: false
Explanation: '?' matches 'c', but the second letter is 'a', which does not match 'b'.
*/


class WildcardMatching
{
	public static void main(String[] args) 
	{
		String str1 = "cb";
		String str2 = "?a";

		int flag =0; 
		StringBuffer strbuff1 = new StringBuffer(str1);
		StringBuffer strbuff2 = new StringBuffer(str2);


		if(str2.length() == 1)
		{
			if(str2.contains("*"))
			{
				char temp  =  strbuff1.charAt(0);

				for (int i=1;i<strbuff1.length();i++ ) 
				{
					if(strbuff1.charAt(i) == temp)
					{

					}
					else
					{
						flag =1;
						break;
					}
				}

			}
		}
		else
		{
			for (int i=1;i<strbuff2.length();i++) 
			{
				if(strbuff1.charAt(i) != strbuff2.charAt(i))
				{
					flag =1 ;
					break;
				}
				
			}
		}

		if(flag == 1)
			System.out.println("false");
		else
			System.out.println("true");

	}
}
