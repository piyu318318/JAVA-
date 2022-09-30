
import java.util.*;

class ReverseWordLegacyClass1
{
	public static void main(String[] args) 
	{
		Stack <StringBuffer> s1 = new Stack <StringBuffer>();

		String str ="This is Java";
		String strarr[] = str.split(" ");
	//	StringBuffer strbuff1 = new StringBuffer("");

		for (int i=0;i<strarr.length;i++) 
		{
			StringBuffer strbuff1 = new StringBuffer("");

			String temp =  strarr[i];
			for (int j=temp.length()-1;j>=0 ;j--) 
			{
				strbuff1.append(temp.charAt(j));
			}


			s1.push(strbuff1);
		}

		System.out.println(s1);
	}
}
