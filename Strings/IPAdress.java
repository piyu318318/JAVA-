/*
Write a program to Validate an IPv4 Address.
According to Wikipedia, IPv4 addresses are canonically represented in dot-decimal notation, which consists of four decimal numbers, each ranging from 0 to 255, separated by dots, e.g., 172.16.254.1 .
A valid IPv4 Address is of the form x1.x2.x3.x4 where 0 <= (x1, x2, x3, x4) <= 255.
Thus, we can write the generalized form of an IPv4 address as (0-255).(0-255).(0-255).(0-255).
Note: Here we are considering numbers only from 0 to 255 and any additional leading zeroes will be considered invalid.
*/
class IPAdress
{
	public static void main(String[] args) 
	{
		String str = "-172.16.2554.11";

		String strarr[] = str.split("\\.");

		int intarr[] = new int[strarr.length];

		for (int i=0;i<strarr.length;i++) 
		{
			String temp= strarr[i];
			intarr[i] = Integer.parseInt(temp);	
		}

		int flag=0;
		int erornumber=0;
		int negativenumber=0;
		for (int i=0;i<intarr.length;i++ ) 
		{
			if(intarr[i]<0)
			{
				negativenumber =intarr[i];
				System.out.println("Invalid IPAdress");			
				System.out.println("negative number !!"+negativenumber);
				flag=1;
				break;
			}

			if(intarr[i]>=255  )
			{
				erornumber = intarr[i];
				flag=1;
				System.out.println("Invalid IPAdress");			
				System.out.println(erornumber+" this number is invalid brother");
				break;
			}	

		}

		if(flag == 0)
		{
			System.out.println("IPAdress is correct !");
		}
		
		/*
		for(int no:intarr)
		{
			System.out.print(no+" ");
		}
		*/

	}
}
