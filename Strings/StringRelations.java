/*
1. Create a temp string and store concatenation of str1 to
   str1 in temp.
                      temp = str1.str1
2. If str2 is a substring of temp then str1 and str2 are 
   rotations of each other.

Example:                 
                 str1 = "ABACD"
                 str2 = "CDABA"

 temp = str1.str1 = "ABACDABACD"
 Since str2 is a substring of temp, str1 and str2 are 
 rotations of each other.



 Given a string s1 and a string s2, write a snippet to say whether s2 is a rotation 
 of s1? 
(eg given s1 = ABCD and s2 = CDAB, return true, given s1 = ABCD, and s2 = ACBD , 
return false)
*/

class Stringreal
{
	public static void main(String[] args) 
	{
		String str1 = "AACD";
		String str2 = "ACDA";

		StringBuffer strbuff = new StringBuffer(str1);

		for (int i=0;i<str2.length();i++) 
		{
			strbuff.append(str2.charAt(i));	
		}

		int j=0;
		int k=0;
		int count=0;


		//strbuff = abacdcdaba
		//str2 = cdaba

		for (int i=0;i<strbuff.length();i++) 
		{
			if( i == (strbuff.length()- str2.length()))
				break;
			k=i;
			j=0;
			count=0;

			while(j<str2.length())
			{

				if(strbuff.charAt(k) == str2.charAt(j))
				{
					j++;
					k++;
					count++;
					if(count == str2.length())
					{
						System.out.println("found string2 in stringbuffer at location :"+i);
						System.out.println(str2);						
					}
				}
				else
				{
					break;
				}
			}
		}

	}
}

/*
//second method 
class StringRelations
{
	public static void main(String[] args) 
	{
		ArrayList <Character> a1 = new ArrayList<>();

		String str1 = "abacd";
		String str2 = "cdaba";
		StringBuffer s1 =new StringBuffer(str1);

		char ch;

		for (int i=0;i<str2.length();i++) 
		{
			ch = str2.charAt(i);
			s1.append(ch);
		}
		//System.out.println(s1);

		//s1=abacdcdaba
		//str2=cdaba
		int j=0;
		int k=0;
		int count=0;
		int storestrateindex=0;
		int flag=0;

		for (int i=0;i<s1.length();i++) 
		{
			j=0;
			count=0;
			k=i;

			while(j<str2.length())
			{
				if(s1.charAt(k) == str2.charAt(j))
				{
					k++;
					j++;
					count++;
				}
				else
				{
					break;
				}
			}

			if(count == str2.length())
			{
				storestrateindex = i;
				System.out.println(storestrateindex);
			}

		}


	}
}


*/
