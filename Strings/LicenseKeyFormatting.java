

class LicenseKeyFormatting
{
	public static void main(String[] args) 
	{
		String str= "5F3Z-2e-9-w";
		int K = 4;

		StringBuffer stbuff = new StringBuffer("");
		StringBuffer stbuff2 = new StringBuffer("");

		int j=0;
		for (int i=0;i<str.length();i++) 
		{	
			if(Character.isDigit(str.charAt(i)) || Character.isLetter(str.charAt(i)))
			{
				stbuff.append(str.charAt(i));
			}
		}


		double divide = stbuff.length()/2;

	//	System.out.println(divide);
		int div = (int)divide;

		if(div%2==0)
		{
			stbuff.insert(div,'-');
			System.out.println(stbuff);

		}

		int part = stbuff.length() ;
		if(part%2 != 0)
		{
			stbuff.append('@');
			stbuff.insert(1,'-');
			
			int count=0;

			for (int i=2;i!='@';i++ ) 
			{
				if(stbuff.charAt(i) == '@')
				{
					break;
				}
				if(count == div)
				{
					stbuff.insert(i,'-');
					count=0;
				}
				else
					count++;
			}

			stbuff.deleteCharAt(stbuff.length()-1);
			//System.out.println(stbuff);

		}
			


	}
}
