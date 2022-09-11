//arr1= [1,2,3]
//arr2 = [a,b,c];
//print = 1a2b3c

class AlternateArray1
{
	public static void main(String[] args) 
	{
		int arr1[] = {1,2,3};	
		String arr2[] = {"a","b","c"};

		StringBuffer s1 = new StringBuffer("");

		int n= arr1.length + arr2.length ;

		int no;
		for (int i=0;i<arr1.length;i++)
		{
			no = arr1[i];
			String str = String.valueOf(no);
			s1.append(no);
			s1.append(arr2[i]);
		}	

		System.out.println(s1);

	}
}
