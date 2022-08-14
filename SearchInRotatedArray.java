//here 2 methods used to obtained an output



//method1
class SearchInRotatedArray
{
	public static void main(String[] args) 
	{
		int arr[] =  {5, 6, 7, 8, 9, 10, 1, 2, 3};

		int key=3;
		//int key=10;
		//int key=7;
		int minindex=0;
		int maxindex=0;
		int min=arr[0];
		int max=0;
		int last=arr.length-1;
		for (int i=1;i<arr.length;i++) 
		{
			if(arr[i] < min)
			{
				min = arr[i];
				minindex=i;
				maxindex = i-1;
				max=arr[i-1]; 
			}
				
		}	
		//System.out.println(min);
		//System.out.println(minindex);
		//System.out.println(maxindex);
		//System.out.println(max);
		SearchInRotatedArray2.binary(arr,minindex,maxindex,min,max,key,last);
	}


	static void binary(int arr[],int minindex,int maxindex,int min,int max,int key,int last)
	{
		if (key<=max)
		{
			for (int i=maxindex;i>0;i--) 
			{
				if(arr[i] == key )
				{
					System.out.println("key found at index  "+(i+1));
					break;
				}
			}
		}
		if(key>=min && key<=arr[last])
		{
			for (int i=minindex;i<arr.length;i++) 
			{
				if(arr[i] == key )
				{
					System.out.println("key found at index  "+(i+1));
					break;
				}		
			}
		}
	}
}




///method2 starts here simple linear search 

/*
Given a sorted and rotated array A of N distinct elements which is rotated at some point, and given 
an element key. The task is to find the index of the given element key in the array A.
Input:
N = 9
A[] = {5, 6, 7, 8, 9, 10, 1, 2, 3}
key = 10
Output:
5
Explanation: 10 is found at index 5.

Input:
N = 4
A[] = {3, 5, 1, 2}
key = 6
Output:
-1
Explanation: There is no element that has value 6.

*/

class work
{
	static int search(int arr[],int key)
		{
			int number=0;
			for (int i=0;i<arr.length;i++) 
			{
				if(arr[i] == key )
				{
					number = i+1;
					break;
				}
			}
			return number;
		}			
}

class SearchInRotatedArray
{
	public static void main(String[] args) 
	{
		int arr[] =  {5, 6, 7, 8, 9, 10, 1, 2, 3};
		int key=10;


		work obj = new work();
		System.out.println(obj.search(arr,key));
		
	}
}
