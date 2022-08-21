//find out close and open parethesis 

class OpenAndCloseParenthesis
{
	public static void main(String[] args) 
	{
		String str = "(()))()((";

		int count =0;// (=increased the count and  )=increased the count
		int lastopening =0;
		int lastclosing =0;

		for (int i=0;i<str.length();i++) 
		{
			if(str.charAt(i) == '(')
			{
				lastclosing=i;
				count++;
			}
			if(str.charAt(i) == ')')
			{
				lastopening=i;
				count--;
			}
		}	


		//System.out.println("\nFinal count is " +count);

		if(count<0)
			System.out.println("You must have to add  openinig brackets :"+count);
		else if(count>0)		
			System.out.println("You must have to add  closing brackets  :"+count+" before index "+(lastclosing+1));
		else if(count ==0)
			System.out.println("Number of opening brackets equals to number of closing bracktes bruh");

	}
}
