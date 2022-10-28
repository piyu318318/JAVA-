/*
1)what is two pointer technique ?
two pointer technique normaly use d for searching and it uses two pointers in one loop in given data structure.
2)why do you must know it?
in order to use two pointers most of the time data structure needs to be ordered in some way which helps us to reduce the time complexity from O(n^2) , O(n^3) or O(n)
of just with one loop with two pointers and search each item just one time.so depending upon whether the input string / array is sorted or not two pointer method can take 
O(n log n) time complexity or even better which is O(n)
3)variants of two pointers
opposite directional -one pointer starats from beginning and other pointers starts from end.
equi directional - both pointers starts from beggining.
*/

class Two_Pointer_algorithm
{
  	public static void main(String[] args) 
  	{
  		int nums[] = {-3,2,3,3,6,8,15};	
  		Two_Pointer_algorithm.twosum(nums,6);
  	}

  	static void twosum(int nums[], int target)
  	{
  		int start=0;
  		int end = nums.length -1;
  		int result[] = new int[2];

  		while(start<end)
  		{
  			int sum  = nums[start] + nums[end];
  			if(sum == target)
  			{
  				System.out.println("start is :"+(start + 1)+"end is :"+(end +1));
  				break;
  			}
  			else if(sum < target)
  			{
  				start++;
  			}
  			else
  			{
  				end--;
  			}
  		}

  	}
  		
}
