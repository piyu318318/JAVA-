//Question: make array elements unique by incrementing duplicates by 1
import java.util.*;
class makearrayelementsunique
{
	public static void main(String[] args) 
	{
		int arr[]={3,1,1,2,7};
		int x=arr.length;
		int temp[] = new int[x];
		int n =arr.length;

		while(n>0)
		{
			for(int i=0;i<arr.length;i++) 
			{
				for (int j=i+1;j<arr.length;j++) 
				{
					if(arr[i] == arr[j])
					{
						arr[i] = arr[i] + 1;

					}
				}
			}
			n--;
		}

		for(int no:arr)
		{
			System.out.print(no+" ");
		}
	}
}
