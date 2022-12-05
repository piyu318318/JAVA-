//create sinlgy linkedlist of integer data .perform following operations
/*
1.display both linkedlist in reverse order 
2.display intersecion of two list 
3.add element at first position list1
4.remove last element of list2 
*/
import java.util.*;
import java.io.*;

class Program3
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

		LinkedList<Integer> l1  = new LinkedList<>();
		LinkedList<Integer> l2  = new LinkedList<>();
		LinkedList<Integer> l3  = new LinkedList<>();

		HashSet<Integer> intersection = new HashSet<>();

		int element,n;
		

		while(true)
		{
			System.out.println("\n\nEnter your choice \n1.add in linkedlist1 \n2.add in linkedlist2 :");
			System.out.println("3.display in reverse order");
			System.out.println("4.display intersection of two list");
			System.out.println("5.add element at first position in list1");
			System.out.println("6.remove the last element from list2");
			System.out.println("7.exit");
			int ch =Integer.parseInt(br.readLine());

			switch(ch)
			{
				case 1:
					System.out.println("Enter how many elements you want to add :");
					n = Integer.parseInt(br.readLine());
					for (int i=0;i<n ;i++ ) 
					{
						System.out.println("Enter element in list1 :");
						element = Integer.parseInt(br.readLine());
						l1.add(element);
					}
					
					System.out.println("All elements added successfully !!!");
					break;
				case 2:
					System.out.println("Enter how many elements you want to add :");
					n = Integer.parseInt(br.readLine());
					for (int i=0;i<n ;i++ ) 
					{
						System.out.println("Enter element in list1 :");
						element = Integer.parseInt(br.readLine());
						l2.add(element);
					}
					
					System.out.println("All elements added successfully !!!");
					break;
				case 3:
					Collections.reverse(l1);
					Collections.reverse(l2);

					System.out.println("list1 in reverse order :"+l1);
					System.out.println("list2 in reverse order :"+l2);
					break;
				case 4:
					int len = l1.size();
					for (int i=0;i<len ;i++ )
					{
						int temp = l1.get(i);
						if(l2.contains(temp))
							intersection.add(temp);
					}
					l3.addAll(intersection);
					System.out.println("Intersection of two list :");
					System.out.println(l3);

					l3.clear();
					intersection.clear();

					break;
				case 5:
					System.out.println("Enter element to add first in list1 :");
					element = Integer.parseInt(br.readLine());
					l1.addFirst(element);
					break;
				case 6:
					System.out.println("last element removed successfully :"+l2.removeLast());
					break;
				case 7:
					System.exit(0);
					break;
			}
		}
		
	}
}