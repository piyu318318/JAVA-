import java.io.*;
class Satkar
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a number :");
		String str = br.readLine();
		int cnt=0;
		char arr[] = str.toCharArray();
		for(int i=0;i<str.length();i++)
		{
			if(arr[i] == 'd')
			{
				cnt++;
			}
		}

		System.out.println(cnt);
	}
}