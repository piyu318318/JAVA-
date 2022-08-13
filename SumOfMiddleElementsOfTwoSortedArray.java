
class SumOfMiddleElementsOfTwoSortedArray
{
	public static void main(String[] args) 
	{
		int arr1[] = {1, 2, 4, 6, 10};

		int arr2[] = {4, 5, 6, 9, 12};

		int newarr[] = new int[arr1.length+arr2.length];

		for (int i=0;i<arr1.length;i++) 
		{
			newarr[i]=arr1[i];	
		}

		int k=0;
		for (int j=arr1.length;j<newarr.length;j++) 
		{
			newarr[j] = arr2[k];
			k++;
		}

		

		//now sort the array 
		
		for (int i=0;i<newarr.length;i++) 
		{
			for (int j=0;j<newarr.length-i-1;j++) 
			{
				if(newarr[j]>newarr[j+1])
				{
					int temp = newarr[j];
					newarr[j]=newarr[j+1];
					newarr[j+1] = temp;
				}
			}	
		}
		/*
		for(int no:newarr) //will print an sorted array
		{
			System.out.print(no+" ");
		}
		*/

		int start = 0;
		int last =newarr.length-1;
		int mid= (start+last)/2;

		System.out.println();
		//System.out.println(mid);
		System.out.println(newarr[mid]+newarr[mid+1]);

	}
}
