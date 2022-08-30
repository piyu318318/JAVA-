

class MultiplyTwoStrings
{
	public static void main(String[] args) 
	{
		String str1="60";
		str1 = str1 +" ";
		String str2="40";
		str2 = str2 +" ";

		String arr1[] = str1.split(" ");
		String arr2[] = str2.split(" "); 

		int intarr1[] = new int[arr1.length];
		int intarr2[] = new int[arr2.length];

		

			String temp = arr1[0]; 
			intarr1[0]= Integer.parseInt(temp);
		

			String temp1 = arr2[0]; 
			intarr2[0]= Integer.parseInt(temp1);

		int mul=0;
		
		System.out.println(intarr1[0]*intarr2[0]);
		
	}
}
