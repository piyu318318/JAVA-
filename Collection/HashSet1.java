//All the elements in hashset are unique
///It doesnt conatin duplicate values.
/*mostly hashset and hashmaps are used when you want to reduce the time complexity 
in the program*/


import java.util.*;
class HashSet1
{
	public static void main(String[] args) 
	{
		//creating hashsets 

		HashSet<Integer> set = new HashSet<Integer>();

		//insert
		set.add(12);
		set.add(32);
		set.add(21);
		set.add(54);
		set.add(45);

		//bloolean contains() : searches the element  returns true if found else false

		System.out.println((set.contains(10)));
		System.out.println((set.contains(21)));

		//remove:removes the element 
		System.out.println(set.remove(54)+" Element has been removed ");
		System.out.println(set);

		//size : returns size of hashsets 
		System.out.println("size of hashsets is :"+set.size());

		//Iterator 
		Iterator it = set.iterator();
		
		while(it.hasNext())
		{
			System.out.print(it.next()+" ");
		}
	}
}
