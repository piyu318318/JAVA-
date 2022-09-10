//arr1 = 1 2 3 4 5 
//arr2 = 6 7 8 9 10
//arr3 = 1 2 3 4 5 6 7 8 9 10

import java.io.*;
class alternatearray
{
	public static void main(String[] args) 
	{
		int arr1[] = {1,2,3,4,5};
		int arr2[] = {6,7,8,9,10};	
		int arr3[] = new int[arr1.length+arr2.length];

		int k=0;
		int i=0;
		int j=0;
		while(k<arr3.length)
		{
			if(i%2 == 0 && j%2==0)
			{
				arr3[k] = arr1[i];
				k++;
				arr3[k] = arr2[j];
				i++;
				j++;
				k++;
			}
			
			else
			{
				arr3[k] = arr1[i];
				k++;
				arr3[k] = arr2[j];
				i++;
				j++;
				k++;	
			}	
		}

		for(int no:arr3)
		{
			System.out.print(no+" ");
		}				
	}
}