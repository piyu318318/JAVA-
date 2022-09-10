//Given an array of size N-1 such that it only contains distinct integers in the range of 1 to N. 
//Find the missing element.

class findmissingelement1ton
{
	public static void main(String[] args) 
	{
		//int arr[] ={1,2,3,5};//here missing elelment is 4
		int arr[] ={6,1,2,8,3,4,7,10,5};//here missing elelment is 9
		
		int n = arr.length;
		int check = arr.length+1;
		int cnt=1;

		//first sort the array then chech each elemnt is avaialble in the array or not.
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





		
		for(int i=0;i<n;i++)
		{
			if(arr[i] == cnt)
			{
				cnt++;
			}
			else
			{
				System.out.print("missing element is :"+cnt);
			}
		}
			
		





/*
int arr[] ={1,2,3,5};
		int n = arr.length;
		int check = arr.length+1;
		int cnt=1;
		for(int i=0;i<n;i++)
		{
			if(arr[i] == cnt)
			{
				cnt++;
			}
			else
			{
				System.out.print("missing element is :"+cnt);
			}
		}
*/

	}
}