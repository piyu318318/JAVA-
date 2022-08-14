/*
Given a matrix of size n x m, where every row and column is sorted in increasing order, 
and a number x. Find whether element x is present in the matrix or not.

Example 1:
Input:
n = 3, m = 3, x = 62
matrix[][] = {{ 3, 30, 38},
              {36, 43, 60},
              {40, 51, 69}}
Output: 0
Explanation:
62 is not present in the matrix, 
so output is 0.

Example 2:
Input:
n = 1, m = 6, x = 55
matrix[][] = {{18, 21, 27, 38, 55, 67}}
Output: 1
Explanation: 55 is present in the matrix.
*/

class SearchInARowColumnSortedMatrix
{
	public static void main(String[] args) 
	{
		int arr[][] = {{ 3, 30, 38},
             {36, 43, 60},
             {40, 51, 69}};

       // int arr[][] = {{18, 21, 27, 38, 55, 67}};

         int key =38;
         int flag=0;
         for (int i=0;i<arr.length;i++) 
         {
         	for (int j=0;j<arr[i].length;j++) 
         	{
         		if(arr[i][j] == key)
         		{
         			flag=1;
		        	System.out.println("Key "+key+" found at position row "+i+"  and column "+j+" in an matrix :");
         			break;
         		}			
         	}

         }
         	if(flag == 0)
         	{
         		System.out.println("Key not found in an matrix brather !");
         	}
	}
}
