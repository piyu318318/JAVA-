//same as Q1 but take input as unsorted array
import java.io.*;

class Second
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("How many elements :");
		int n=Integer.parseInt(br.readLine());
		int arr[] = new int[n];
		System.out.println("Enter array elements : ");
		for(int i=0;i<n;i++)
		{
			arr[i] = Integer.parseInt(br.readLine());
		}
		System.out.println("Enter target element :");
		int target = Integer.parseInt(br.readLine());

		Second.sort(arr);

		System.out.println("Sorted array is \n");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		
		Second.check_sum_of_two_elements(arr,target);

		
	}


	/*
	static void sort(int arr[])
	{
		int temp;
		for (int i=0;i<arr.length ;i++ ) 
		{
			for (int j=i+1;j<arr.length;j++) 
			{
				int last =arr.length;

				if(i==last && j==i+1)
				{
					arr[i] = arr[last];
				}

				if(arr[i]>arr[j])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j]=temp; 
				}
			}	
		}
	}
	*/
	//bubblle sort
	static void sort(int arr[])
	{
		int temp;
		for (int i=0;i<arr.length;i++ ) 
		{
			for (int j=0;j<arr.length-i-1 ;j++ )
			{
				if(arr[j]>arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}	
		}
	}


	static void check_sum_of_two_elements(int arr[],int target)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]+arr[j] == target && arr[i]<arr[j])
				{
					System.out.println("\nAddition of "+arr[i]+" and "+arr[j]+" is tagrget element :"+target);
				}
			}
		}
	}
}

