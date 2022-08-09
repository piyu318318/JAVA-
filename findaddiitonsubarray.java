//Question: Find subarray from given array whose sum is zero(print start 
// index and end index)
import java.io.*;
class findaddiitonsubarray
{
	public static void main(String[] args) 
	{
		int arr[] = {4,2,-3,1,6};
		//int sum =0;

		for(int i=0;i<arr.length;i++)
		{
			int sum = 0;
			sum = sum + arr[i];
			int j=i+1;
			int n=arr.length;
			while(j<n)
			{
				sum = sum + arr[j];
				if(sum == 0)
				{
					System.out.println(i+" "+j);
					break;
				}
				else
					j++;
			}
			sum =0;	
		}

	}

}

