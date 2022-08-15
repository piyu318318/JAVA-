//set is interface
//set is a collections that cannot contain duplicate elements .

import java.util.*;
class Set1
{
	public static void main(String[] args) 
	{
		Set<Integer> s1=new HashSet<Integer>();

		s1.add(12); 		
		s1.add(32); 		
		s1.add(2); 		
		s1.add(324); 		
		s1.add(54); 		
		s1.add(54);//this wont get print bcoz sets dont allow duplicates


		System.out.print(s1);

		//print set using foreach loop
		System.out.println();

		for(int no: s1)
		{
			System.out.print(no+" ");
		}

		Set<Integer> s2=new HashSet<Integer>();
		//if we try to add duplicates it returns false
		System.out.println();
		System.out.println(s2.add(12));
		System.out.println(s2.add(32));
		System.out.println(s2.add(53));
		System.out.println(s2.add(12));//false
		System.out.println(s2.add(34));
		System.out.println(s2.add(53));//false

	}
}
