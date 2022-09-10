/*
Given an array arr[] and an integer K where K is smaller than size of array, the task is to find 
the Kth smallest element in the given array. It is given that all array elements are distinct.
Input:
N = 6
arr[] = 7 10 4 3 20 15
K = 3
Output : 7
Explanation :
3rd smallest element in the given 
array is 7.

Input:
N = 5
arr[] = 7 10 4 20 15
K = 4
Output : 15
Explanation :
4th smallest element in the given 
array is 1


*/
class FindKthSmallestElement
{
	public static void main(String[] args) 
	{
		int arr[] = {7, 10, 4, 3, 20, 15};	
		int k=3;

		for(int i=0;i<arr.length;i++) 
		{
			for(int j=0;j<arr.length-i-1;j++) 
			{
				if(arr[j]>arr[j+1]) 
				{
					int temp = arr[j];
					arr[j] =arr[j+1];
					arr[j+1]=temp;						
				}
			}	
		}

		for (int i=0;i<arr.length;i++) 
		{
			if (i == k-1) 
			{
				System.out.print(arr[i]+" ");
			}
		}
	}
}