import java.io.*;

class Anagram2
{
	public static void main(String[] args) 
	{
		String strone="liSten";
		String strsecond="silent";

		String str1=strone.toLowerCase();
		String str2=strsecond.toLowerCase();
		
		char arr1[] = str1.toCharArray();		
		char arr2[] = str2.toCharArray();		
		int len = arr1.length;
		int i;
		if(arr1.length == arr2.length)
		{
			i=0;
			for(int j=0;j<arr1.length;j++)//for the str1 
			{
				if(arr1[i] == arr2[j]  )
				{
					arr2[j] = 'a';
					i++;	
					break;
				}
				i++;
			}

		}

		int flag=0;

		for(char ch : arr2)
		{
			if(ch != 'a')
				flag=1;
				break;
		}

		if(flag ==1 )
			System.out.println("Its not an Anagram :");
		else
			System.out.println("Its an Anagram broo :");

	}
}