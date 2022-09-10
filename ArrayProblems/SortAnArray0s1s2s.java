//Given an array of size N containing only 0s, 1s, and 2s; sort the array in ascending order.
/*
Input: 
N = 5
arr[]= {0 2 1 2 0}
Output:
0 0 1 2 2
Explanation:
0s 1s and 2s are segregated 
into ascending order.
*/

class SortAnArray0s1s2s
{
	public static void main(String[] args) 
	{
		int arr[]={0,2,1,2,0};

		//insertion sort O(n²) in the average and worst case, and O(n) 
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

		/*
		//bubble sort time comple o(n^2)

		for (int i=0;i<arr.length;i++) 
		{
			for (int j=0;j<arr.length-i-1;j++)
			{
				if (arr[j]>arr[j+1]) 
				{
					int temp = arr[j];
					arr[j] =arr[j+1];
					arr[j+1] =temp;
				}
			}		
		}
	*/
		System.out.println("After sorting os and 1s:");
		for(int no: arr)
		{
			System.out.print(no+" ");
		}
	}
}