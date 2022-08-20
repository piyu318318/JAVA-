//largest string length 
 
//find largest string as wll as find largest string starting index and ending index

class FindLargestStringLengthAndItsIndex
{
	public static void main(String[] args) 
	{
		String arr[] = {"geeksforgeeks","geek","geeks","geezer"};
		
		//char chararr[] = new char[arr.length];  

		StringBuilder st = new StringBuilder("");

		for (int i=0;i<arr.length;i++) 
		{
			if(i != arr.length-1)
			{
				st.append(arr[i]);
				st.append(",");
			}
			else
				st.append(arr[i]);
		}

//		System.out.println(st);
		StringBuilder cmp= new StringBuilder("");
//		geeksforgeeks,geeks,geek,geezer
		int temp=0;
		int count=0;
		int max=0;
		int last=0;
		for (int i=0;i<st.length();i++) 
		{
			if(st.charAt(i) == ',')
			{
				//System.out.print(count+" ");
				if(max<count)
				{
					max=count;
					count=0;
					last =i-1;
				}
				else
					count=0;
			}
			else
			{
				count++;
			}		
		}
		
		int first = 0;
		for(int i=max-1;i>0;i--)
		{
			if(st.charAt(i) == ',')
			{
				first = i+1;
				break;
			}
		}

		

		StringBuilder largeststr = new StringBuilder("");
		StringBuilder common = new StringBuilder("");

		for(int i=first;i<max;i++)
		{
			largeststr.append(st.charAt(i)); 
		}

		System.out.println("largest String is : "+ largeststr);
		System.out.println("largest string starts at index :"+first);
		System.out.println("largest string ends at index :"+last);
		System.out.println("largest string length is: "+max);

	}
}
