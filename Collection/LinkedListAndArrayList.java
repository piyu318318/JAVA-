//linkedlist and arraylist add and remove all methods using switch cases 

import java.io.*;
import java.util.*;

class LinkedListAndArrayList
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		ArrayList<Integer> a1 = new ArrayList<Integer>();
		ArrayList<Integer> a2 = new ArrayList<Integer>();

		LinkedList<Integer> l1 = new LinkedList<Integer>();
		LinkedList<Integer> l2 = new LinkedList<Integer>();

		int ch,ch2,ch3;

		do
		{
			
			System.out.println("Enter your choice :");
			System.out.println("1.ArrayList 2.LinkedList 3.Exit :");
	      	ch =Integer.parseInt(br.readLine());
			int element ,index,n;
			
			switch(ch)
			{ 
				case 1:
						do
						{
							System.out.println("Enter your choice :");
							System.out.println("1).add(Object o) \n2).addAll(Collection C) \n3).addAll(int index, Collection C) \n4).Display ArrayList \n5).remove?(int index) \n6).remove?(Object o) \n7).removeAll?(Collection c)\n8).Exit?");
							ch2 = Integer.parseInt(br.readLine());	
							switch(ch2)
							{
								case 1:
									System.out.println("Enter the element :");
									element = Integer.parseInt(br.readLine());
									a1.add(element);
									break;
								case 2:
									System.out.println("How many element you want to add :");
									n = Integer.parseInt(br.readLine());
									for (int i=0;i<n;i++ ) 
									{
										System.out.println("Enter a number :");
										int temp = Integer.parseInt(br.readLine());
										a2.add(temp);
									}
									a1.addAll(a2);
									a2.clear();
									break;
								case 3:
									System.out.println("Enter how many element you want to add :");
									n = Integer.parseInt(br.readLine());
									System.out.println("Enter the index element :");
									index = Integer.parseInt(br.readLine());
									
									for(int i=0;i<n ;i++ ) 
									{
										System.out.println("Enter a number :");
										int temp = Integer.parseInt(br.readLine());
										a2.add(temp);
									}

									a1.addAll(index,a2);
									a2.clear();

									break;
								case 4:
									System.out.println(a1);
									break;
								case 5:
									System.out.println("Enter the elemet you want to remove frm an arraylist :");
									int removeelemnt = Integer.parseInt(br.readLine());
									a1.remove(Integer.valueOf(removeelemnt));
									//a1.remove(remove);
									break;
								case 6:
									System.out.println("Enter the index you want to remove the element from an array :");
									index = Integer.parseInt(br.readLine());
									a1.remove(index);
									break;

								case 7:
									System.out.println("how many element you want to delete :");
									n = Integer.parseInt(br.readLine());

									for (int i=0;i<n ;i++ ) 
									{	
										System.out.println("Enter the element for deletion.");
										int temp =Integer.parseInt(br.readLine());
										a2.add(temp);	
									}

									a1.removeAll(a2);
									a2.clear();
									break;

								case 8:
									break;

							}//end of switch
						}while(ch2!=8); //end of do

				case 2:

					do
					{
						System.out.println("Enter your choice :");
						System.out.println("1.add(int index, E element) 2.add(E e) 3.addAll(int index, Collection<E> c) \n4.addAll(Collection<E> c) 5.addFirst(E e) 6.addLast(E e) \n7.remove() 8.remove(int index) \n9.remove(Object o) 10.removeFirst() 11.removeLast()  \n12.removeLastOccurrence(Object o) 13.Display LinkedList 14.exit");
						ch3 = Integer.parseInt(br.readLine());

						switch(ch3)
						{
							case 1:
								System.out.println("Enter element :");
								element = Integer.parseInt(br.readLine());
								System.out.println("Enter index :");
								index = Integer.parseInt(br.readLine());
								l1.add(index,element);

								break;
							case 2:
								System.out.println("Enter element :");
								element = Integer.parseInt(br.readLine());
								l1.add(element);
								break;
							case 3:
								System.out.println("Enter how many elements you want to add :");
								 n =Integer.parseInt(br.readLine());
								System.out.println("Enter the index you want to add list :");
								index = Integer.parseInt(br.readLine());

								for (int i=0;i<n ;i++ ) 
								{
									System.out.println("Enter element :");
									int temp = Integer.parseInt(br.readLine());
									l2.add(temp); 	
								}
								l1.addAll(index,l2);
								l2.clear();

								break;
							case 4:
								System.out.println("Enter how many elements you want to add :");
								 n = Integer.parseInt(br.readLine());
								for (int i=0;i<n ;i++ ) 
								{
									System.out.println("Enter elemen :");
									int temp = Integer.parseInt(br.readLine());
									l2.add(temp);
								}

								l1.addAll(a2);
								l2.clear();
								break;

							case 5:
									System.out.println("Enter the element add at first :");
									element = Integer.parseInt(br.readLine());
									l1.addFirst(element);

								break;
							
							case 6:
								System.out.println("Enter the element add at last :");
								element = Integer.parseInt(br.readLine());
								l1.addLast(element);

								break;
//7.remove() 8.remove(int index) 9.remove(Object o) 10.removeFirst()  12.removeLast() 13.removeLastOccurrence(Object o) 14.Display LinkedList 15.exit								
							
							case 7:
								l1.remove();
								break;
							case 8:
								System.out.println("Enter index to delete element . ");
								index= Integer.parseInt(br.readLine());
								l1.remove(index);
								break;
							case 10:
								l1.removeFirst();
								break;
							case 11:
								l1.removeLast();
								break;
							case 12:
								System.out.println("Enter index to delete element . ");
								element= Integer.parseInt(br.readLine());
								l1.removeLastOccurrence(element); 
								break;
							case 13:
								System.out.println(l1);
								break;
							case 14:
								break;
						}
					}while(ch3 != 14);

					break;
				case 3:
					break;
			}

		}while(ch!=3);


	}	
}
