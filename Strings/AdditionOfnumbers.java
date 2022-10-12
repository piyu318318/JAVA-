//addition of a given number

class AdditionOfnumbers
{
	public static void main(String[] args) 
	{
		//int no =200;  op should be 2+0+0 = 2
		int no =123123;

		String str = String.valueOf(no);
		int sum =0;
		for (int i=0;i<str.length() ;i++ ) 
		{
			if(str.charAt(i) == '0')
				sum += 0;
			else if(str.charAt(i) == '1')
				sum += 1;
			else if(str.charAt(i) == '2')
				sum += 2;
			else if(str.charAt(i) == '3')
				sum += 3;
			else if(str.charAt(i) == '4')
				sum += 4;
			else if(str.charAt(i) == '5')
				sum += 5;
			else if(str.charAt(i) == '6')
				sum += 6;
			else if(str.charAt(i) == '7')
				sum += 7;
			else if(str.charAt(i) == '8')
				sum += 8;
			else if(str.charAt(i) == '9')
				sum += 9;
		}

		System.out.println("sum of the number is :"+sum);
	}
}
