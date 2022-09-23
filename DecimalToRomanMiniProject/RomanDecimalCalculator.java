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
		String str1 = new String(" ");
		for(int i=0;i<str.length();i++)
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
		}
		String arr[] = str1.split(" ");//convert String to String array.
		int size = arr.length;
		int newarr[] = new int[size];
		//System.out.println("Second");
		for(int j=1; j<size;j++) 
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
		return sum;		
	}
	
	void decimalToRoman(int num)
	{
		int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};  
		String[] romanLetters = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};  
		StringBuilder roman = new StringBuilder();  
		for(int i=0;i<values.length;i++)   
		{  
			while(num >= values[i])   
			{  
				num = num - values[i];  
				roman.append(romanLetters[i]);  
			}  
		}  
		System.out.println("In Roman: "+roman.toString());
	}
	
	int Add() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Numbers: ");
		String str = br.readLine();
		
		String arrOfStr[] = str.split(",");
		int add=0,num=0;
		
		for(int i=0;i<arrOfStr.length;i++)
		{
			num = convertValues(arrOfStr[i]);
			add = add+num;
		}
		return add;
	}
	
	int Sub() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Numbers: ");
		String str = br.readLine();
		
		String arrOfStr[] = str.split(",");
		int sub=convertValues(arrOfStr[0]),num=0;
		
		for(int i=1;i<arrOfStr.length;i++)
		{
			if(sub>0 )
			{
				num = convertValues(arrOfStr[i]);
				sub = sub-num;
			}
			else
				break;
		}
		return sub;
	}
	
	int Mul() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Numbers: ");
		String str = br.readLine();
		
		String arrOfStr[] = str.split(",");
		int mul=1,num=0;
	
		for(int i=0;i<arrOfStr.length;i++)
		{
			num = convertValues(arrOfStr[i]);
			mul = mul*num;
		}
		return mul;
	}	
	
	float Div() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Numbers: ");
		String str = br.readLine();
		
		String arrOfStr[] = str.split(",");
		float div=convertValues(arrOfStr[0]),num=0;
		
		for(int i=1;i<arrOfStr.length;i++)
		{
			num = convertValues(arrOfStr[i]);
			div = div/num;
		}
		return div;
	}
}

class RomanDecimalCalculator
{
	public static void main(String[] args)throws IOException 
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Work obj = new Work();
		
		System.out.println("\n======Roman to Decimal Calculator======\n\n");
		System.out.println("1.Convert to decimal number\n2.Add\n3.Subtract\n4.Multiply\n5.Divide\n");
		
		int ch;
		do
		{
			System.out.print("\nEnter the option: ");
			ch = Integer.parseInt(br.readLine());
			
			switch(ch)
			{
				case 1: 
					System.out.print("Enter numbers: ");
					String str = br.readLine();
					String arrOfStr[] = str.split(",");
					System.out.print("\n");
					for(int i=0;i<arrOfStr.length;i++)
					{
						if(i==arrOfStr.length-1)
							System.out.print(obj.convertValues(arrOfStr[i]));
						else
							System.out.print(obj.convertValues(arrOfStr[i])+",");
					}
					System.out.print("\n");
					break;
				case 2: 
					int add = obj.Add();
					System.out.println("\n"+add);
					obj.decimalToRoman(add);
					break;
				case 3: 
					int sub = obj.Sub();
					if(sub>0)
					{
						System.out.println("\n"+sub);
						obj.decimalToRoman(sub);
					}
					else if(sub<=0)
					{
						System.out.println("\n"+sub);
						System.out.println("In Roman: Invalid");
					}
					break;
				case 4: 
					int mul = obj.Mul();
					System.out.println("\n"+mul);
					obj.decimalToRoman(mul);
					break;
				case 5:

					float div = obj.Div();
					float temp = div;
					
					int firstPart = (int)div;
					temp = temp - firstPart;
					
					System.out.print("\n");
					if(temp == 0)
					{
						System.out.println((int)div);
						obj.decimalToRoman((int)div);
					}
					else
					{
						System.out.println(div);
						System.out.println("In Roman: Invalid");
					}
					break;
				default:break;
			}			
		}while(ch>0 && ch<6);
	}
}
					
		
