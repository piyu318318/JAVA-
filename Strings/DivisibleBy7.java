//Given an n-digit large number in form of string, check whether it is divisible 
//by 7 or not. Print 1 if divisible by 7, otherwise 0.

class DivisibleBy7
{
	public static void main(String[] args) 
	{
		String num ="997";

		int last = num.length();

		StringBuffer s1 = new StringBuffer(num);

		String abc = s1.substring(0,last);
		System.out.println(abc);

		int no = Integer.parseInt(abc);

		if(no%7 == 0)
			System.out.println("number "+no +" is divisible by 7");
		else
			System.out.println("number "+no +" is not divisible by 7");
/*

second method to do it
		String num ="997";
		num = num + " ";
		String arr[] = num.split(" ");

		int arr2[] = new int[arr.length];

		for (int i=0;i<arr2.length;i++)
		{
			String no = arr[i];
			arr2[i] = Integer.parseInt(no);
			
			if(arr2[i]%7 == 0 )
				System.out.print("number Divisible by 7");	
			else
				System.out.print("number is not Divisible by 7");	

		}
*/

	}
}


