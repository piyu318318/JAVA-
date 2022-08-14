/*
Given a sorted array arr[] of size N. Find the element that appears only once in the array.
All other elements appear exactly twice. 
Input:
N = 11
arr[] = {1, 1, 2, 2, 3, 3, 4, 50, 50, 65, 65}
Output: 4
Explanation: 4 is the only element that 
appears exactly once.
*/

class FindElementThatAppearsOnceInSortedArray
{
	public static void main(String[] args) 
	{
		int arr[] = {1, 1, 2, 2, 3, 3, 4, 50, 50, 65, 65};
		int flag=0;
		int count=0;
		for (int i=0;i<arr.length;i++) 
		{
			if(arr[i] != -1)
			{
				for (int j=i+1;j<arr.length;j++) 
				{
					if(arr[i] == arr[j])
					{
						flag=1;
						arr[j]=-1;
						break;
					}
				}
				if (flag == 0) 
				{
					System.out.println(arr[i]);	
				}
				flag=0;
			}
		}


	}

}