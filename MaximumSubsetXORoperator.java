/*
Given an array arr[] of N positive integers. Find an integer denoting the maximum XOR subset 
value in the given array arr[].

Input : 
N = 3
arr[] = {2, 4, 5}
Output : 7
Explanation : 
The subset {2, 5} has maximum 
subset XOR value.

input : 
N= 3
arr[] = {9, 8, 5}
Output : 13
Explanation : 
The subset {8, 5} has maximum 
subset XOR value.
*/


class MaximumSubsetXORoperator
{
	public static void main(String[] args) 
	{
		
		//int arr[]= {2,4,5};
		int arr[]= {9,8,5};

		int max =0;

		for (int i=0;i<arr.length;i++) 
		{
			int j=i+1;

			while(j<arr.length)
			{
				int xor = arr[i]^arr[j];
				if(xor > max)
				{
					max=xor;
				}
				j++;
			}
		}
		System.out.println("maximum XOR is :"+ max);
	}
} 
