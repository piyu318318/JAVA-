//reverse a word in string
import java.io.*;

class Six
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a String : ");
		String str = br.readLine();

		String arr[] = str.split(" ");
		//String newarr[] = new String[arr.length];

		System.out.println("Reversed word in array or string is :");
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}
		
	}
}