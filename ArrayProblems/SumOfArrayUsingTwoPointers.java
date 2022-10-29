/sum of array elements using two pointers

class SumOfArrayUsingTwoPointers
{
	public static void main(String[] args) 
	{
		int arr[] = {1,2,3,4};
		int first = 0;
		int last = arr.length-1;
		int sum =0;


		while(first<last)
		{
			sum = sum + arr[first] +arr[last];
			first++;
			last--;
		}

		System.out.println(sum);
	}
}
