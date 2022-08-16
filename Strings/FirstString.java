

class FirstString
{
	public static void main(String[] args) 
	{
		String s1 ="PiyushDixit";
		System.out.println(s1.length());//11

		System.out.println(s1.charAt(2));//returns y 

		System.out.println(s1.substring(3));//ushDixit will return

		System.out.println(s1.substring(2,5));//yus 5th elelemnt will not consider  

		String str1="piyush";
		String str2="Dixit";
		System.out.println(str1.concat(str2));//concat the two string  

		String s="india is great.";
		System.out.println(s.indexOf("is"));//i is 6th position will return 6 


		String st1="Learn Share Learn";
		System.out.println(st1.indexOf("ea",3));// will check ea from index 3 and return 13.

		String st = "Learn Share Learn";
		System.out.println(st.lastIndexOf("a"));//returns 14  

		boolean result = "piyush".equals("piyush");//returns true
		System.out.println(result); 

		boolean result1 = "piyush".equalsIgnoreCase("PIYUSH");//returns true
		System.out.println(result1);// 


		String str11="piyush";
		String str22="annna";
		System.out.println(str11.compareTo(str22));// Compares two string lexicographically.
		/*
		 This returns difference s1-s2. If :
		 out < 0  // s1 comes before s2
		 out = 0  // s1 and s2 are equal.
		 out > 0   // s1 comes after s2.
		*/

		String word1 ="PiyuSH";
		String word2 = word1.toLowerCase();
		System.out.println(word2);// will return all letters as lowercase of word1


		String w1= "abhINVav";
		String w2= w1.toUpperCase();
		System.out.println(w2);// 


		String sstr=" india is the country ";
		System.out.println(sstr.trim());//will trim the leading as welll as tailing spaces


		//String replace (char oldChar, char newChar)
		// Returns new string by replacing all occurrences of oldChar with newChar  

		String s11="indiaisgrate";
		String s22= s11.replace('i','f');
		System.out.println(s22);// 

		System.out.println();// 

 

	}
}
