

import java.util.*;

class ReverseWordLegacyClass
{
	public static void main(String[] args) 
	{
		StringBuffer strbuff2 =  new StringBuffer("");

		Vector <String> v1 = new Vector<String>();
		
		String str ="This is Java";
		String strarr[] = str.split(" ");

		for (int i=0;i<strarr.length ;i++ ) 
		{
			String temp = strarr[i];
			v1.add(temp);	
		}

		for (int i=0;i<strarr.length ;i++ ) 
		{
			String temp = v1.get(i);
			StringBuffer strbuff =  new StringBuffer(temp);

			for (int j=temp.length()-1;j>=0 ;j-- ) 
			{
				strbuff2 = strbuff2.append(strbuff.charAt(j));
			}

			strbuff2 = strbuff2.append(" ");
		}

		v1.clear();
		String str2 = strbuff2.toString();
		String strarr2[] =  str2.split(" ");

		for (int i=0;i<strarr2.length ;i++ ) 
		{
			String temp = strarr2[i];
			v1.add(temp);
		}

		System.out.println(v1);

	}
}
