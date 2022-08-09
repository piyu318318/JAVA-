import java.io.*;

class Work
{
	void Bubble(int arr[])
	{
		for (int i=0;i<arr.length;i++) 
		{
			for(int j=0;j<arr.length-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] =temp;
				}
			}	
		}
	}

	
	void display(int arr[])
	{
		System.out.println("Sorted array is :");

		int n =arr.length;
		for (int i=0;i<n;i++) 
		{
			System.out.print(arr[i]+ " ");
		}
	}


	void bubblesort(int arr[],int key)
	{
		int start = 0;
		int last = arr.length-1;
		int mid = (start+last)/2;

		while(start <= last)
		{
			if(key > arr[mid])
			{
				start = mid+1;
			}
			else if(key == arr[mid])
			{
				System.out.println("\nElement found at "+(mid+1));
				break;
			}
			else
			{
				last = mid-1;
			}
			mid = (start+last)/2;	
				
		}
	}
}

class Binary
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("How many elements :");
		int n= Integer.parseInt(br.readLine());
		int arr[] = new int[n];

		System.out.println("Enter array elements :");

		for(int i=0;i<n;i++) 
		{
			arr[i] = Integer.parseInt(br.readLine()); 		
		}

		System.out.println("Enter key element to search :");
		int key = Integer.parseInt(br.readLine());

		Work obj = new Work();

		obj.Bubble(arr);
		obj.display(arr);
		obj.bubblesort(arr,key);
	}
}