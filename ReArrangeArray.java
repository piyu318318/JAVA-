/*
Input:
N = 6
arr[] = {1,2,3,4,5,6}
Output: 6 1 5 2 4 3
Explanation: Max element = 6, min = 1, 
second max = 5, second min = 2, and 
so on... Modified array is : 6 1 5 2 4 3
*/

class ReArrangeArray
{
	public static void main(String[] args) 
	{
		int arr[] ={1,2,3,4,5,6};
		int len=arr.length;
		int temp[] = new int[len];
		int i=0;//pointing starting of an array 
		int j=arr.length-1;//pointing last element of an array 
		int k=0;

		while(k<len )
		{
			if(k%2 == 0)
			{
				temp[k] = arr[j];
				j--;				
			}
			else
			{
				temp[k] = arr[i];
				i++;
			}
			k++;
		}

		for(int no:temp)
		{
			System.out.print(no +" ");
		}
	}
}
