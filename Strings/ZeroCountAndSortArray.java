//add all zeros in an array
//and non zero elememnts shouls be sorted
import java.util.*;

class ZeroCountAndSortArray
{
	public static void main(String[] args) 
	{
		int arr1[] ={2,3,23,0,5,34,3,1,0,0,6,5,7};
		int arr2[] = new int[arr1.length];

		ArrayList<Integer> a1 = new ArrayList<Integer>();

		int notzero;
		int countzero=0 ;

		for (int i=0;i<arr1.length ;i++ ) 
		{
			if(arr1[i] == 0)
			{
				countzero++;
			}
			else
			{
				a1.add(arr1[i]);
			}
		}
		Collections.sort(a1);

		for (int i=0;i<countzero ;i++ ) 
		{
			a1.add(0);
		}


		System.out.println(a1);s
	}	
} 
