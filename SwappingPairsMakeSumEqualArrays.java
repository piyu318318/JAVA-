/*
Input: N = 6, M = 4
A[] = {4, 1, 2, 1, 1, 2}
B[] = (3, 6, 3, 3)
Output: 1
Explanation: Sum of elements in A[] = 11
Sum of elements in B[] = 15, To get same 
sum from both arrays, we can swap following 
values: 1 from A[] and 3 from B[]

Input: N = 4, M = 4
A[] = {5, 7, 4, 6}
B[] = {1, 2, 3, 8}
Output: 1
Explanation: We can swap 6 from array 
A[] and 2 from array B[]

*/



class SwappingPairsMakeSumEqualArrays
{
	public static void main(String[] args) 
	{
		//int arr1[]	= {3, 6, 3, 3};//13
		//int arr2[] = {4, 1, 2, 1, 1, 2};//13
		int arr1[]={5, 7, 4, 6};
		int arr2[] = {1, 2, 3, 8};
		int sum1= 0;
		int sum2= 0;

		

		int n= arr2.length;

		for (int i=0;i<arr1.length;i++) 
		{
			int j=0;

			while(j<n)
			{
				int temp=arr1[i];
				arr1[i]=arr2[j];
				arr2[j]=temp;
				

				for (int k=0;k<arr1.length;k++) 
				{
			 		sum1 = sum1 + arr1[k];					
				}

				for (int l=0;l<arr2.length;l++) 
				{
		 			sum2 = sum2 +arr2[l];
				}	
				


				if(sum1 == sum2)
				{
					System.out.println(arr1[i]+" "+arr2[j]);
					System.exit(0);
					//break;
				}
				else
				{
					temp=arr1[i];
					arr1[i]=arr2[j];
					arr2[j]=temp;
				}
				sum1=0;
				sum2=0;
				j++;
			}			
		}

	}
}
