
class InsertSort2
{
	public static void main(String[] args) 
	{
		int arr[] ={7,3,5,10,14,2};


		for (int i=0;i<arr.length;i++) 
		{
			int temp = arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>temp)
			{
				arr[j+1] =arr[j];
				j= j-1;
			}
			arr[j+1]=temp;
		}


		/*
		for (int i=1;i<arr.length;i++) 
		{	
			int temp = arr[i];
			int j=i-1;

			while(j>=0 && arr[j]>temp)
			{
				arr[j+1]=arr[j];
				j=j-1;
			}
			arr[j+1]=temp;
		}
	*/


		for (int no :arr) 
		{
			System.out.print(no+" ");		
		}
	}
}