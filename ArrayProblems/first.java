//take array
//take target ele from user 
// if sum of two numbers in the array is equal to target element display

import java.io.*; 
class first
{
	public static void main(String args[])throws IOException
	{
   		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   		//int arr[] = {1,3,4,5,7,2,4};
   		System.out.println("How many elements you want :");
   		int n = Integer.parseInt(br.readLine());
   		int arr[] = new int[n];
   		System.out.println("Enter array element :");
   		for(int i=0;i<n;i++)
   		{
   			arr[i] = Integer.parseInt(br.readLine());
   		}
   		System.out.println("Enter target element :");
   		int target = Integer.parseInt(br.readLine());
   		int size=arr.length;

   		for(int i=0;i<size;i++)
   		{
   			for(int j=i+1;j<size;j++)
   			{
   				if(arr[i]+arr[j] == target && arr[i]<arr[j])
   				{
   					System.out.println(arr[i]);
   					System.out.println(arr[j]);
   					break;
   				}
   			}
   		}
   } 
}