

class RevereseWordsinGivenString
{
	public static void main(String[] args) 
	{
		String str="i.like.this.program.very.much";

		String arr[] = str.split("\\.");
		String arr2[] = new String[arr.length];
		String str2="";

		int j=0;
		for (int i=arr.length-1;i>0;i--) 
		{
			arr2[j] = arr[i];
			j++;
		}

		for(String st: arr2)
		{
			System.out.print(st+" ");
		}

	}
}