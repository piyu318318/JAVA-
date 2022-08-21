

//str1 = aab
//str2 = xxy
import java.util.*;
class IsomorphicsStrings
{
	public static void main(String[] args) 
	{

		String s1 = "aab";
		String s2 = "xxy";
		
		if(s1.length() == s2.length())
		{



	 		StringBuffer s11= new StringBuffer ("");
	 		StringBuffer s22= new StringBuffer ("");

			int check1=0;
			int check2=0;

			

			//for string 1
			
			char temp1 = s1.charAt(0);

			for(int i=0;i<s1.length();i++) 
			{
				if(s1.charAt(i) == temp1)
				{
					s11.append(check1);
				}
				else
				{
					check1++;
					s11.append(check1);
				}
			}

			System.out.println(s11);


			//for String2
			
			char temp2 = s2.charAt(0);

			for(int i=0;i<s2.length();i++) 
			{
				if(s2.charAt(i) == temp2)
				{
					s22.append(check2);
				}
				else
				{
					check2++;
					s22.append(check2);
				}
			}

			//toString will comvert this stringBuffer into the String  
			String s1new = s11.toString();
			String s2new = s22.toString();
			
			s1new.trim();
			s1new.trim();

			System.out.println(s22);

			if(s1new.equals(s1new))
				System.out.println("isomorphic Strings ");
			else
				System.out.println("not isomorphic Strings ");
		}
		else
		{
			System.out.println("both String has different length how it could be isomorphics brooo !")
		}
	}
}
