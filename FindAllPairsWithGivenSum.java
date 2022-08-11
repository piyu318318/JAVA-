/*
Given two unsorted arrays A of size N and B of size M of distinct elements, the task is to find 
all pairs from both arrays whose sum is equal to X.
A[] = {1, 2, 4, 5, 7}
B[] = {5, 6, 3, 4, 8} 
X = 9 
Output: 
1 8
4 5 
5 4
Explanation:
(1, 8), (4, 5), (5, 4) are the
pairs which sum to 9
*/
class FindAllPairsWithGivenSum
{
	public static void main(String[] args) 
	{
		int arr1[] = {1, 2, 4, 5, 7};
		int arr2[] = {5, 6, 3, 4, 8};
		int x=9;

		for (int i=0;i<arr1.length;i++) 
		{
			int j=0;
			while(j<arr2.length)
			{
				if(arr1[i] + arr2[j] == 7)
				{
					System.out.println(arr1[i] +" "+arr2[j]);
				//	System.out.println((i+1) +" "+(j+1)); //this line will print array index whos sum is 9
					j++;
				}
				else
					j++;
			}	
		}
	}
	
}
