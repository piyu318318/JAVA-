class FindOutSubstring
{
	static int occurenceofsubstring=0;
	public static void main(String[] args) 
	{

		String str1 = "acabasabkasab";
		String str2="ab";
		int count=0;
		int k=0;
		int j=0;
		for( int i=0;i<str1.length();i++) 
		{
			k=i;
			while(j<str2.length())
			{
				if(str1.charAt(k) == str2.charAt(j))
				{
					count++;
					j++;
					k++;
				}
				else
					break;

			}

			if(count == str2.length())
			{
				occurenceofsubstring++;
			}

			count=0;
			j=0;
		}
		System.out.println("String1 is "+str1);
		System.out.println("String2 is "+str2);
		System.out.println("substring found in string is :"+FindOutSubstring.occurenceofsubstring);
	}	
}
