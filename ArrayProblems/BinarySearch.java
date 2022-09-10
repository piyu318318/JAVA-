import java.io.*;

class BinarySearch
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("How many array elements you want :");
		int n =Integer.parseInt(br.readLine());
		int arr[] = new int[n];
		System.out.println("Enter array elemnts :");
		for(int i=0;i<n;i++)
		{	
			arr[i] = Integer.parseInt(br.readLine());
		}
		System.out.println("Enter key to be searched :");
		int key = Integer.parseInt(br.readLine());

		BinarySearch.sort(arr);
		System.out.println("Sorted array is :");
		for(int no:arr)
		{
			System.out.print(no+" ");
		}
		BinarySearch.binary(arr,key);

	}

	static void sort(int arr[])
	{
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;i<arr.length-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp; 
				}
			}
		}
	}

	static void binary(int arr[],int search)
	{
		int start = 0;
		int last = arr.length-1;
		int mid = (start+last)/2;
		while(start<=last)
		{
			
			if(arr[mid]<search)
			{
				start = mid+1;			
			}
			else if(arr[mid] == search )
			{
				System.out.println(search+" element found  at position :"+mid);
				//System.out.println(" element found  at position :");
				break;
			}
			else 
			{
				last = mid-1;
			 	mid = (start+last)/2;
			}
		}
	}
}

