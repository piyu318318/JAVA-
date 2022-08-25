class StringPool
{
	public static void main(String[] args) 
	{

		String s1 ="piyush";	//piyush will get allocate in  string pool and s1 refer s1	
		String s2 ="piyush";	//as piyush is same s2 will refer to piyush it will be shallow copy
		String s3 ="piyush";	//as piyush is same s3 will refer to piyush it will be shallow copy
		String s4 ="piyush";	//as piyush is same s4 will refer to piyush	it will be shallow copy
		String s5 ="piyush";	//same 	
		String s6 ="piyush";		
		String s7 ="piyush";//alll this refering to piyush 
		String s8="india";//it will check if india is in the string poool s8 will refer to india
		
		if(s1==s2)
		{
			System.out.println("Same");//return not same  bcoz s1 refering piyush and s8 refering india
		}	

		if(s1 == s8)
		{
			System.out.println("Not Same");//return not same  bcoz s1 refering piyush and s8 refering india
		}


	}	
}
