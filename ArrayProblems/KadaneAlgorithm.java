/*
Input:
N = 5
Arr[] = {1,2,3,-2,5}
Output:
9
Explanation:
Max subarray sum is 9
of elements (1, 2, 3, -2, 5) which 
is a contiguous subarray.
Input:
N = 4
Arr[] = {-1,-2,-3,-4}
Output:
-1
Explanation:
Max subarray sum is -1 
of element (-1)

*/
class KadaneAlgorithm
{
	public static void main(String[] args) 
	{
		//int arr[] = {-1,-2,-3,-4};
		int arr[] = {1,2,3,-2,5};
		int n=arr.length;
		
		int i=0;
		int max=arr[0];
		int sum=0;
		while(i<n)
		{
			for(int j=0;j<arr.length;j++) 
			{
				sum = sum + arr[i];
				if(sum > max)
				{
					max=sum;					
				}
				break;
			}
			i++;
		}
		System.out.println(max);
		
	}
}