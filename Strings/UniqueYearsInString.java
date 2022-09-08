import java.util.*;

class UniqueYearsInString
{
	public static void main(String[] args)
	{
		Set <String> set1 = new HashSet<String>();

		String str1="UN was established on 24-10-1945.India got freedom on 15-08-194712.";
		
		StringBuffer s1 = new StringBuffer(str1);
		StringBuffer s2 = new StringBuffer();

		int count=0;
		int check=0;

		for (int i=0;i<s1.length();i++) 
		{

			if(i == s1.length()-4)
				break;

			count =0;

			if((s1.charAt(i)) == '-' && (!Character.isDigit(s1.charAt(i+5)))) 
			{
				if(Character.isDigit(s1.charAt(i+1)) && Character.isDigit(s1.charAt(i+2)) && Character.isDigit(s1.charAt(i+3)) && Character.isDigit(s1.charAt(i+4)))
				{
				//	s2.append(s1.charAt(i)); //we dont want - to get print
					s2.append(s1.charAt(i+1));
					s2.append(s1.charAt(i+2));
					s2.append(s1.charAt(i+3));
					s2.append(s1.charAt(i+4));

					count++;
				}
 			}

 			if(count == 1 )
				s2.append(' ');

		}

		//now convert stringbuffer into string

		String str = s2.toString();

		String strarr[] = str.split(" ");
		
		String temp;

		for(int i=0;i<strarr.length;i++) 
		{
			temp = strarr[i];
			set1.add(temp);
		}

		System.out.println(set1);
	}	
}
