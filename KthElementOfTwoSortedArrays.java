/*Given two sorted arrays arr1 and arr2 of size N and M respectively and an element K.
The task is to find the element that would be at the k’th position of the final sorted array.
Input:
arr1[] = {2, 3, 6, 7, 9}
arr2[] = {1, 4, 8, 10}
k = 5
Output:
6
Explanation:
The final sorted array would be -
1, 2, 3, 4, 6, 7, 8, 9, 10
The 5th element of this array is 6.

Input:
arr1[] = {100, 112, 256, 349, 770}
arr2[] = {72, 86, 113, 119, 265, 445, 892}
k = 7
Output:
256
Explanation:
Final sorted array is - 72, 86, 100, 112,
113, 119, 256, 265, 349, 445, 770, 892
7th element of this array is 256.
*/

class KthElementOfTwoSortedArrays
{
	public static void main(String[] args) 
	{
		int arr1[] ={2,3,6,7,9};
		int arr2[] ={1,4,8,10};
		int k=5;

		//int arr1[] = {100, 112, 256, 349, 770};
		//int arr2[] = {72, 86, 113, 119, 265, 445, 892};
		//int k=7;

		int arr[] = new int[arr1.length+arr2.length];

		for (int i=0;i<arr1.length;i++) 
		{
			arr[i] = arr1[i];	
		}

		int m=0;//pointing first element of arr1
		for (int i=arr1.length;i<arr.length;i++) 
		{
			arr[i] = arr2[m];
			m++;	
		}

		//now sort an array here i have used insertion sort  

		for (int i=0;i<arr.length;i++) 
		{
			for(int j=0;j<arr.length-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] =temp;
				}
			}	
		}

		System.out.print(arr[k-1]);

	}
}
