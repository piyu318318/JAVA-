//Given an array arr[] of positive integers of size N. Reverse every sub-array group of size K.
/*
N = 5, K = 3
arr[] = {1,2,3,4,5}
Output: 3 2 1 5 4
Explanation: First group consists of elements
1, 2, 3. Second group consists of 4,5.

ex 2:
N = 4, K = 3
arr[] = {5,6,8,9}
Output: 8 6 5 9
*/
import java.io.*;
class reversesubarray
{
	public static void main(String[] args) 
	{
		int arr[] = {5,6,8,9};
		int k=3;
		int n=arr.length;
		int first = k;
		int last = n-first;
		int temp1[] = new int[first];
		int temp2[] = new int[last];
		int temp3[] = new int[n];

		for(int i=0;i<first;i++)
		{
			temp1[i] = arr[i]; 
		} 

		int j=0;
		for(int i=first;i<n;i++)
		{
			temp2[j] = arr[i];
			j++;	
		}

		int x=0;
		for(int i=temp1.length-1;i>=0;i--)
		{
			temp3[x] = temp1[i];
			x++;
		}

		for(int i=temp2.length-1;i>=0;i--)
		{
			temp3[x] = temp2[i];
			x++;
		}

		for(int no:temp3)
		{
			System.out.print(no);
		}
	}
}


