import java.io.*;

class Work
{
	void linrearSearch(int arr[],int search)
	{
		int flag=0;
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i] == search)
			{
				flag=1;
				System.out.println("Element found at position "+(i+1));
			}
		}

		if(flag == 0)
			System.out.println("Element not found .");
	}
}

class LinearSearch
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enetr length of array :");
		int n = Integer.parseInt(br.readLine());	

		int arr[] = new int[n];

		for(int i=0;i<n;i++)
		{
			arr[i] = Integer.parseInt(br.readLine());
		}


		System.out.println("Enetr length of array :");
		int search = Integer.parseInt(br.readLine());

		Work  obj = new Work();
		obj.linrearSearch(arr,search);
	}
}

