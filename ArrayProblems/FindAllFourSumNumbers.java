//A[] = {10,2,3,4,5,7,8} k=23
class FindAllFourSumNumbers
{
	public static void main(String[] args) 
	{
		//int arr[] = {0,0,2,1,1};
		int arr[]={10,2,3,4,5,7,8};
		int k=3;
		inr sum=0;

		for(int i=0;i<arr.length;i++)
		{
			int j=0;
			count=0;
			sum=0;
			for (int j=0;j<arr.length && count < 4;j++) 
			{
				sum = sum +arr[j];
			}

			if(sum == k)
		}		
	}	
}