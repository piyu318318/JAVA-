/*
Input:
n = 10
arr[] = {6,-1,-3,4,-2,2,4,6,-12,-7}
Output: 4
Explanation: The 4 subarrays are [-1 -3 4]
[-2 2], [2 4 6 -12], and [-1 -3 4 -2 2]
*/

class PRrintAllsubArrayWhosSumIsZero
{
	public static void main(String[] args) 
	{
		int arr[] = {6,-1,-3,4,-2,2,4,6,-12,-7};
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] == 0)
				System.out.println(arr[i]);

			int j=i+1;
			int sum =arr[i];
			while(j<arr.length)
			{
				sum = sum +arr[j];
				if(sum == 0)
				{
					System.out.println();
					//System.out.println(arr[i]+" "+arr[j]);
						for (int k=i;k<=j;k++) 
						{
							System.out.print(arr[k]+" ");
						}
					break;
				}
				else
					j++;
			}
			sum =0;
		}
	}
}