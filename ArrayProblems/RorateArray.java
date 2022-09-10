//rotate an array
import java.io.*;

class RorateArray
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		/*
		System.out.println("Before rotate :");

		int arr[] ={1,2,3,4,5,6};
		for(int no: arr)
		{
			System.out.print(no+" ");
		}
		System.out.println("\nenter how many number you want to rotate  :");
		int n= Integer.parseInt(br.readLine());

		
		int last=arr.length-1;
		int j=1;
		
		while(n>0)
		{
			int temp=arr[0];

			for(int i=0;i<arr.length-1;i++)
			{
				arr[i]= arr[i+1];
			}
			arr[arr.length-1] = temp; 
			n--;
		}


		System.out.println("after rotate :");
		for(int no: arr)
		{
			System.out.print(no+" ");
		}
		*/

		int arr[] ={1,2,3,4,5,6};
		for(int no: arr)
		{
			System.out.print(no+" ");
		}
		System.out.println("\nenter how many number you want to rotate  :");
		int n = Integer.parseInt(br.readLine());

		while(n>0)
		{
			int temp = arr[arr.length-1];
			int last = arr.length-1;
			for (int i=arr.length-1;i>0 ;i--) 
			{
				 arr[i] =arr[i-1];
			}
			arr[0] = temp;
			n--;
		}


		for(int no: arr)
		{
			System.out.print(no+" ");
		}
	}
}

