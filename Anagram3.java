import java.io.*;

class Anagram3
{
	public static void main(String[] args) 
	{
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s1= "listen";
		String s2="silent";

		s1.trim();
		s2.trim();

		char arr1[] = s1.toCharArray();
		char arr2[] = s2.toCharArray();

		int n1= arr1.length;
		for(int i=0;i<n1-1;i++)
		{
			for(int j=0;j< n1-i-1;j++)
			{
				if(arr1[j] > arr1[j+1])
				{
					char temp = arr1[j];
					arr1[j] = arr1[j+1];
					arr1[j+1] = temp;
				}
			}		
		}

		int n2= arr2.length;
		for(int i=0;i<n2-1;i++)
		{
			for(int j=0;j< n2-i-1;j++)
			{
				if(arr2[j] > arr2[j+1])
				{
					char temp = arr2[j];
					arr2[j] = arr2[j+1];
					arr2[j+1] = temp;
				}
			}		
		}


		String s11 = new String(arr1);
		String s22 = new String(arr2);

		System.out.println(s11);
		System.out.println(s22);

		if(s11.equals(s22))
			System.out.println("its an anagram");
		else
			System.out.println("its not anagram");

	}
}