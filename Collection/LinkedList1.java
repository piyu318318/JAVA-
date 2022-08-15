//variable size 
//non contiguous memory
//insert time O(1)
//insert time O(n)


import java.util.*;
class LinkedList1
{
	public static void main(String[] args) 
	{
		
		LinkedList<String> l1 = new LinkedList<String> ();

		l1.add("piyush");
		l1.add("dabya");
		l1.add("pachya");
		l1.add("sk");
		l1.add("ramos");

		System.out.println(l1);	


		//changing elelments 
		System.out.println();	
		l1.set(1,"bindra");
		System.out.println(l1);	

		//remove removes the element in linkedlist 
		//1.remove(obj) 
		System.out.println();	
		l1.remove(3);//will remove the element at index 3
		System.out.println(l1);	

		//2.remove(int index)
		l1.remove("ramos");
		System.out.println(l1);	


		//size
		System.out.println();	
		System.out.println("Here we used size mmethod to iterate over LinkedList :");	
		for (int i=0;i<l1.size();i++) 
		{
			System.out.println(l1.get(i));	
		}

		//for each loop
		System.out.println();	
		System.out.println("Here we used for each method iterate over LinkedList :");	
		for (String str: l1) 
		{
			System.out.println(str);
		} 	

		//addfirst() adds element first index
		System.out.println();	
		l1.addFirst("bhai bhai");
		System.out.println(l1);

		//addLast() adds element last index
		System.out.println();
		l1.addLast("bharat");
		System.out.println(l1);

		//sorts
		System.out.println("\nAfter sorting :");
		Collections.sort(l1);
		System.out.println(l1);
		

		//clone()= This method returns a shallow copy of this LinkedList.
		System.out.println();
		System.out.println("Used clone() to create same linkedlist shallow copy :");
		LinkedList<String> l2= new LinkedList<String>();
		l2 =(LinkedList) l1.clone();
		System.out.println(l2);

		// offerFirst() This method Inserts the specified element at the end of this list.
		System.out.println();
		l1.offer("euuu");
		System.out.println(l1);

		//offer adds element at tail
		System.out.println();
		l1.offerFirst("first");
		System.out.println(l1);

		//offerLast adds element at last and if we used offerlast it will be last element of the linkedlist
		System.out.println();
		l1.offerLast("last");
	}
}
