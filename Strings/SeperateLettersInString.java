
//add all the letters and remove special characters. 

class SeperateLettersInString
{
	public static void main(String[] args) 
	{
		String str = "i@flw$avn";
		
		StringBuffer s1 = new StringBuffer("");

		for (int i=0;i<str.length();i++) 
		{
			int ch = str.charAt(i);
			if(ch >= 65 && ch <=90)
			{
				s1.append(str.charAt(i));
			}
			if(ch >= 97 && ch <=122)
			{
				s1.append(str.charAt(i));
			}
		}
		System.out.println(s1);	
	}
}
