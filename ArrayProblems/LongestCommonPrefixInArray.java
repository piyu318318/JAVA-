import java.util.*;
class LongestCommonPrefixInArray
{
	public static void main(String[] args) 
	{
		String str[] = {"geeksforgeeks", "geeks","geek","geezer"};
		String pre = str[0];
		LongestCommonPrefixInArray.longestprefix(str,pre);

	}

	public static void longestprefix(String str[],String pre)
	{
		//String pre = str[0];
		int i=1;
		while(i< str.length)
		{
			while(str[i].indexOf(pre) !=0 )
				pre = pre.substring(0,pre.length()-1);
			i++;
		}
		System.out.print(pre);

	}
}