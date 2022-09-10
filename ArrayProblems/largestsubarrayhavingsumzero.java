/*
Given an array having both positive and negative integers. The task is to compute the 
length of the largest subarray with sum 0.
Input:
N = 8
A[] = {15,-2,2,-8,1,7,10,23}
Output: 5
Explanation: The largest subarray with
sum 0 will be -2 2 -8 1 7.
*/

class largestsubarrayhavingsumzero
{
	public static void main(String[] args) 
	{
		int arr[] = {15,-2,2,-8,1,7,10,23};
		int n=arr.length;
		

			for(int i=0;i<arr.length;i++) 
			{
				int sum =0;
				sum = sum + arr[i];
				int j=i+1;
				while(j<n)
				{
					sum = sum +arr[j];
					if(sum == 0)
					{
						System.out.println(i+" "+j);
						break;
					}
					else
						j++;
				}			
				sum=0;
			}

	}	
}	
