//Given an array of N integers. Find the first element that occurs at least K number of times.

class EachElementOccursfrequency
{
	public static void main(String[] args) 
	{
		int arr[] = {1, 7, 4, 3, 4, 8, 7};
		//int printarr[] = new int[arr.length]; 
		int n=arr.length;
		for(int i=0;i<n;i++)
		{
			int cnt=0;
			{
				for(int j=0;j<n;j++)
				{
					if(arr[i] == arr[j])
					cnt++;
				}
				if (cnt==2)
					System.out.println("frequency of "+arr[i]+" is "+cnt);
				cnt=0;
			}
			
		}	
	}
}