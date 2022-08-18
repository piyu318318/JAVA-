import java.util.*;
import java.io.*;
class DeclareValues
{
	int I=1,V=5,X=10,L=50,C=100,D=500,M=1000;
}

class Work extends DeclareValues
{
	int convertValues(String str)
	{
		String str1 = new String("");
		{
			int i=0;

			while(i<str.length())
			{

				if(str.charAt(i) == 'I')
					str1= str1 + 1 +" ";

				if(str.charAt(i) == 'V')
					str1= str1 + 5 +" ";

				if(str.charAt(i) == 'X')
					str1= str1 + 10 +" ";

				if(str.charAt(i) == 'L')
					str1= str1 + 50 +" ";

				if(str.charAt(i) == 'C')
					str1= str1 + 100 +" ";

				if(str.charAt(i) == 'D')
					str1= str1 + 500 +" ";

				if(str.charAt(i) == 'M')
					str1= str1 + 1000 +" ";

				i++;
			}
		}

		String arr[] = str1.split(" ");//convert String to an array 

		int size = arr.length;

		int newarr[] = new int[size];
		
		for(int j=0; j<size;j++) 
		{
			newarr[j] = Integer.parseInt(arr[j]);//parse String into an integer	
		}
		
		int sum = 0;
		int len=newarr.length;
		int j = newarr.length-1;//will point last element of array
		int i=j-1;//will point j-1 to comapre if j is greater. if yed then substract and replace as 0 value.

		while(len>0)//loop for the lesser element check and replaced them as 0.
		{
			
			if(newarr[j] > newarr[i])
			{
				sum = sum +( newarr[j]- newarr[i]);
				newarr[i]= 0;
				newarr[j]= 0;

				j--;
			}
			len--;
		}

		for(int m=0;m<newarr.length;m++)//will add all remaining elements to the sum
		{
			sum = sum + newarr[m];
		}
		
		//System.out.println(sum);

	return sum;		
	}
}


class RomanDecimalCalculator
{
	public static void main(String[] args)throws IOException 
	{
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//String str = br.readLine();
		//String strstr = br.readLine();

		Work obj = new Work();

		String str = new String("CXXIV");
		String strstr = new String("IV");
		
		int num1=obj.convertValues(str);;
		int num2=obj.convertValues(strstr);;		

		System.out.println(num1+num2);	
		System.out.println(num1-num2);	
		System.out.println(num1*num2);	
		System.out.println(num1/num2);	
		



	}
}
