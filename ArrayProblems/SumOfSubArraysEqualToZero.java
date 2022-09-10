/*
You are given an array arr[] of size n. Find the total count of sub-arrays having their sum equal to
0.

Input:
n = 6
arr[] = {0,0,5,5,0,0}
Output: 6
Explanation: The 6 subarrays are 
[0], [0], [0], [0], [0,0], and [0,0].
*/

class SumOfSubArraysEqualToZero
{
	public static void main(String[] args) 
	{
		int arr[] = {0,0,5,5,0,0};


		for(int i=0;i<arr.length;i++) 
		{
			if( arr[i] == 0)
			{
				System.out.print(arr[i]+" ");
			}
		}


		System.out.println();


		for(int i=0;i<arr.length;i++)
		{
			int j=i+1;

			if(arr[i]!=0)
				break;
			
			while(arr[j] == 0)
			{				
				j++;
			}
			System.out.println(arr[i]+" "+arr[j-1]);
		}

	}

}