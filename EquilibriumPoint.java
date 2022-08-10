//Given an array A of n positive numbers. The task is to find the first Equilibium Point in the array. 
//Equilibrium Point in an array is a position such that the sum of elements before it is equal to the
//sum of elements after it.
/*
Input: 
n = 5 
A[] = {1,3,5,2,2} 
Output: 3 
Explanation: For second test case 
equilibrium point is at position 3 
as elements before it (1+3) = 
elements after it (2+2)
*/
class EquilibriumPoint
{
	public static void main(String[] args) 
	{
		int sum1=0;
		int check1,check2=0;
//		int arr[] = {10,30,51,20,10,10}; equ point is 51 as 10+30=40 and 20+10+10=40
		int arr[] = {1,3,5,2,2};
		int temp=0 ;
		for(int i=0;i<arr.length;i++) 
		{
			int j=i+1;
			if(arr[i]>arr[j])
			{
				temp = arr[i];
				check2 = i+1;
				break;
			}
			j++;
			sum1= sum1 +arr[i];
		}
		System.out.println("Addition of first part of an array is :"+sum1);

		int sum2=0;
		for(int i=check2;i<arr.length;i++)
		{
			sum2 = sum2 + arr[i];
		}
		System.out.println("Addition of second part of an array is :"+sum2);

		if(sum1 == sum2)
			System.out.println("Equilibrium Point is :"+temp+" of an array ");
				
	}
}
