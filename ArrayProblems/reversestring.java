class reversestring
{
	public static void main(String[] args) 
	{
		String str="india is my";
		char arr[] =str.toCharArray();

		for (int i=arr.length-1;i>=0; i--) 
		{
			System.out.print(arr[i]);	
		}

		String str2 = new String(arr);
		System.out.print("\n"+str2);//convert char array into string
	}
}