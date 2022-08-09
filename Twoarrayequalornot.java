//Given two arrays A and B of equal size N, the task is to find if given arrays are equal or 
//not. Two arrays are said to be equal if both of them contain same set of elements 
//arrangements (or permutation) of elements may be different though.

class Twoarrayequalornot
{
	public static void main(String[] args) 
	{
		int arr1[] = {1,2,5,4,0};
		int arr2[] = {2,4,5,0,1};
		int n1=arr1.length;
		int n2= arr2.length;

		if( n1== n2 )
		{
			for(int i=0;i<arr1.length;i++) 
			{
				int j=0;
				while(j<arr1.length)
				{
					if(arr1[i] == arr2[j])
					{
						arr2[j] = 9999;
						break;
					}
					j++;
				}	
			}

			int flag=0;
			for(int i=0;i<arr2.length;i++)
			{
				if(arr2[i] != 9999)
				{
					System.out.println(arr2[i]);

					flag=1;
				}
			}

			if (flag ==0 ) 
				System.out.println("two arrays are equal as well as elements are same.");
			else
				System.out.println("two arrays are not equal as elements arent same. but length is same of both array.");	
		}

		else
			System.out.println("two arrays are not equal as their length isnt equal bro");	
						
	}
}
