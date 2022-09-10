/*
Given a boolean 2D array, where each row is sorted. Find the row with the maximum number of 1s.
Input:
N = 3, M = 4
Mat[] = {{0 1 1 1},
         {0 0 1 1},
         {0 0 1 1}}
Output: 0
Explanation: Row 0 has 3 ones whereas
rows 1 and 2 have just 2 ones.

Input: 
N = 2, M = 2
Mat[] = {{0 1},
         {1 1}}
Output: 1
Explanation: Row 1 has 2 ones whereas
row 0 has just a single one. 

*/

class MaximumNoOf1sRow
{
	public static void main(String[] args) 
	{
		
		int arr[][] ={
			{0, 1, 1, 1},
         	{0, 0, 1, 1},
         	{0, 0, 1, 1}
		};
		
		/*
		int arr[][] ={
			{0,1},
			{1,1}
		};
		*/
		int max=0;
		int count=0;
		int maxrow =0;

		for (int i=0;i<arr.length;i++) 
		{
			for (int j=0;j<arr[i].length;j++) 
			{
				if(arr[i][j] == 1)
				{
					count=count+1;
				}			
			}
			if(max<count)
			{
				max = count;
				maxrow= (i+1);
			}
			count=0;
		}

	//System.out.println(max);
	System.out.println("row which contains maximum 1s is :  "+ maxrow +" and it contains "+max+" 1s in the row.");
	
	}
	


}
