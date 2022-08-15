//arraylist
//non continous memory in an array list
//size of arraylist is variable it decrease as well as increase
//we can store primitive datatypes in an array. but in an arraylist we can only store objects.
//arrraylist are stored in a heap memory.
//add = adds an element in an array.
//get 
//modify = adds element in between.
//remove = removes element from arraylist
//iterate = iterattes on elements in arraylist

import java.util.*;

class List1
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(0);
		list1.add(3);
		list1.add(6);

		System.out.println(list1);

		//get elements 
		System.out.println();
		int element = list1.get(1);//get(index) of ana arraylist
		System.out.println(element);

		//add ele in between
		System.out.println();
		list1.add(1,10);//at index 1 we have have modified or added 10 integer.
		System.out.println(list1);

		//sets the element in given index of an arraylist
		list1.set(0,20);//on 0th index we added 20 integer.
		System.out.println();
		System.out.println(list1);

		//removes the element from arraylist
		list1.remove(1);//removes element at index 1
		System.out.println();
		System.out.println(list1);

		//will return size of arraylist
		int size = list1.size();
		System.out.println();
		System.out.println(size);

		//loops on arraylist
		System.out.println();	
		for (int i=0;i<list1.size();i++) 
		{
			System.out.print(list1.get(i)+" ");//will print each element of an arraylist
		}

		//sorting 
		System.out.println("\n\nAfter sorting an arrayList  :");
		Collections.sort(list1);
		System.out.println(list1);

		//will return if arraylist is an emplty or not 
		System.out.println();		
		System.out.println(list1.isEmpty());

		//iterator in arraylist
		//iterating element in arraylist using is=terator functon in collections
		System.out.println("\nIterating all elements in arraylist ");
		Iterator<Integer> interator1 = list1.iterator(); 
		while(interator1.hasNext())
		{
			int i = interator1.next();
			System.out.print(i+" ");
		}
	} 
}
