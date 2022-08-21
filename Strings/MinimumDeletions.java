
import java.util.*;
class MinimumDeletions
{
	public static void main(String[] args) 
	{
//		HashMap<> h1 = new HashMap<>();
		String str = "abcba";
		StringBuffer s1 = new StringBuffer(str);
		StringBuffer minstr = new StringBuffer("");//contains minimum letters occurs in a string
		ArrayList <Integer> arr = new ArrayList<Integer>();//contains minimum elements indexes

		char temp= s1.charAt(0);
		char minchar = s1.charAt(0);
		int min=9999;
		int count=0;
		int j=0;

		for(int i=0;i<s1.length();i++)
		{
			temp=s1.charAt(i);
			while(j<s1.length())
			{
				if(s1.charAt(j) == temp)
				{
					count++;
				}
				j++;
			}
			if(count<min)
			{
				minchar=s1.charAt(i);
				min=count;
			}
			
			count=0;
			j=0;
		}

		//System.out.println(min);
		//System.out.println(minchar);



		for(int i=0;i<s1.length();i++) 
		{
			temp=s1.charAt(i);
			while(j<s1.length())
			{
				if(s1.charAt(j) == temp)
				{
					count++;
				}
				j++;
			}
			if(count==min)
			{
				arr.add(i);
				minchar=s1.charAt(i);
				minstr.append(minchar); 
			}
			
			count=0;
			j=0;
		}

		//System.out.println(minstr);

		//System.out.println(arr);

		MinimumDeletions.checkpalindrome(s1);

	}


	
	static void checkpalindrome(StringBuffer s1)
	{
		String s2="";

	// /	int j=0;
		for(int i=s1.length()-1;i>=0;i--) 
		{
			s2 = s2 + s1.charAt(i); 
		}

		String ss = s1.toString();//Stringbuffer will convert to String
		ss.trim();
		s2.trim();
		if(ss.equals(s2))
			System.out.println("palindrome");
		else
			System.out.println("no palindrome");

	}
}


