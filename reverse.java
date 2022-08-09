import java.io.*;

class reverse
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter length of array :");
		int n = Integer.parseInt(br.readLine());
		//int last=array.length;
		int arr[] = new int[n];
		int revarr[] = new int[n];
		System.out.println("Enter array element :");
		for(int i=0;i<n;i++)
   		{
   			arr[i] = Integer.parseInt(br.readLine());
   		}

		int last=n-1;
		int j=0;
		for(int i=last;i>=0;i--)
		{
			revarr[j] = arr[i]; 
			j++;
		}
		System.out.println("reversed array is "); 
		for(int i=0;i<n;i++)
		{
			System.out.println(revarr[i]);
		}
	}		
}