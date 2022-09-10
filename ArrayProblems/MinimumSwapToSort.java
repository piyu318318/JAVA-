//Given an array of n distinct elements. Find the minimum number of swaps required to sort the
// array in strictly increasing order.

//Use Insertion sort

class MinimumSwapToSort
{
	public static void main(String[] args) 
	{
		int arr[] ={2, 8, 5, 4};

		for(int i=1;i<arr.length;i++)
		{
			int temp=arr[i];
			int j= i-1;
			while(j>=0 && arr[j]>temp) //checking negative index
			{
				arr[j+1] = arr[j];
				j=j-1;
			}
			arr[j+1] =temp;

		}

		for(int no:arr)
		{
			System.out.print(no+ " ");
		}
		

	}
}