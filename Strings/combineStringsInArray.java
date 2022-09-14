import java.util.*;

//if string length is even add 2 element in the array.
//if string length is odd add 2 elements and for last element in array add underscore.

class combineStringsInArray
{
	public static void main(String[] args) 
	{
		ArrayList<StringBuffer> a1 = new ArrayList<>();
		
		String str = "piyush"; // even length o/p = pi yu sh
		//String str = "piyushdixit"; odd length o/p = pi yu sh di xi t_
		int len = str.length();

		int flag = 0;

		if(len%2 != 0)
			flag=1;



		int i=0;
		int j=0;

		while(i<str.length())		
		{
			StringBuffer strbuff = new StringBuffer("");

			j=0;			
			while(j<2)
			{
				strbuff.append(str.charAt(i));
				i++;
				if(flag == 1 && i == str.length())
				{
					strbuff.append('_');
					break;
				}
				j++;
			}

			a1.add(strbuff);


			}		
		System.out.println(a1);
	}
} 
