/*
Given an array A of positive integers. Your task is to find the leaders in the array. 
An element of array is leader if it is greater than or equal to all the elements to its right side.
The rightmost element is always a leader.
Input:
n = 6
A[] = {16,17,4,3,5,2}
Output: 17 5 2
Explanation: The first leader is 17 
as it is greater than all the elements
to its right.  Similarly, the next 
leader is 5. The right most element 
is always a leader so it is also 
included
ex2:
Input:
n = 5
A[] = {1,2,3,4,0}
Output: 4 0
*/

class LeadersInArray
{
	public static void main(String[] args) 
	{
		//int arr[] = {1,2,3,4,0};
		int arr[] ={16,17,4,3,5,2};
		int n=arr.length;

		//for(int i=0;i<n;i++)
		int flag=0;
		for(int i=0;i<n;i++) 
		{
			for(int j=i+1;j<n;j++) 
			{
				flag=1;
				if(arr[i]<arr[j])
				{
					flag=0;
					break;
				}			
			}

			if(flag ==1)
				System.out.print(arr[i] + " ");			
		}
		
	}
}
