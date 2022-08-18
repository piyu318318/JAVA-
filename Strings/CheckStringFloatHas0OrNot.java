//if string is 23.0000000 print string if numbers after dot are greater than zero print invalid

class CheckStringFloatHas0OrNot
{
	public static void main(String[] args) 
	{
		String str = new String("23.0000000020");
		int temp=0;
		int flag=0;
		int count=0;
		for (int i=0;i<str.length();i++) 
		{
			if( !Character.isDigit(str.charAt(i)))
			{
				temp =i+1;
			}
			
		}	

		for(int i=temp;i<str.length();i++)
		{
			if(str.charAt(i) != '0')
			{
				count++;
				break;
			}

		}

		if (count>0) 
			System.out.println("invalid");
		else
			System.out.println(str);

	}
}
