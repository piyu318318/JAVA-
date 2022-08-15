//Treeeset  class provides an implementation of the set interface that
// uses a tree for storage. objects are stored in sorted ascendong order.
//access and retrival time are quite fast which makes treeset an excellent choice.
//when sorting large amounts of sorted information that must br found quickly.

import java.util.*;
class TreeSets1
{
	public static void main(String[] args) 
	{

		//methods on treesets
		//add() , clone(), conatains() = to search element , first() returns lowest elements
		//last()=returns last element ,size()
		Set<Integer> t1 = new TreeSet<Integer>();

		t1.add(12);		
		t1.add(3);		
		t1.add(32);		
		t1.add(13);		
		t1.add(13);	//duplicate not allowed in sets broda



		System.out.println(t1);


	}
}
