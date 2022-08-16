
//vectors are the dyanamic array.
//we can add elements dyancamically
//arraylist are better than vectors in memory utilizations.
/*
Vector implements a dynamic array which means it can grow or shrink as required. Like an array, it contains components that can be accessed using an integer index.
They are very similar to ArrayList, but Vector is synchronized and has some legacy methods that the collection framework does not contain.
It also maintains an insertion order like an ArrayList. Still, it is rarely used in a non-thread environment as it is synchronized, and due to this, it gives a poor performance in adding, searching, deleting, and updating its elements.
The Iterators returned by the Vector class are fail-fast. In the case of concurrent modification, it fails and throws the ConcurrentModificationException.
*/

import java.util.*;
class Vectors1
{
	public static void main(String[] args) 
	{
		Vector <Integer> v = new Vector<Integer>();
		v.add(12);
		v.add(43);
		v.add(20);
		v.add(54);
		v.add(34);
		v.add(16);
		v.add(24);
		v.add(27);
		v.add(74);
		v.add(12);
		v.add(43);
		v.add(43);
		v.add(54);
		v.add(34);
		v.add(16);
		v.add(24);
		v.add(27);
		v.add(74);

		v.remove(1);//first index number will get removed
		System.out.println(v.capacity());//20  will return capacity function

		//prints the all elemnts in the vectors
		for (int no : v) 
		{
			System.out.print(no+" ");
	 	}



	 	//	elementAt(int index):	Returns the component at the specified index.

	 	v.elementAt(5);

	 	//
		System.out.println("\n"+v.size());


	}	
}
