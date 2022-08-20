//india is country swap the first and last leeters of word 
//iandii si yountrc

class ToSwapFirstAndLastWordsInASenTence
{
	public static void main(String[] args) 
	{

		String s1="messi is a super human";
		char arr[] = s1.toCharArray();
		int size=s1.length();
		int first = 0;//will always point to the first letter of word after space is detected
		int last =0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] == ' ')
			{
				last = i-1;
				//swap here
				char temp = arr[first];				
				arr[first]=arr[i-1];
				arr[i-1]=temp;

				first = i+1;
			}

			if(i == arr.length-1)//this funciton for last word of the sentence
			{
				last = arr.length-1;
				char temp = arr[first];
				arr[first] = arr[last];
				arr[last] = temp;
				break;			
			}
		}

		for (char ch :arr ) //prints the swapped first and last letter of words
		{
			System.out.print(ch);	
		}		
	}	

}
