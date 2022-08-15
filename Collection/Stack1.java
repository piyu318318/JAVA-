import java.util.*;

class Stack1
{
	public static void main(String[] args) 
	{
		//Stack s1 = new Stack();	
		Stack <Integer> s1 = new Stack<Integer>();
		try
		{
			s1.push(10);
			s1.push(20);
			s1.push(30);
			s1.push(40);
			s1.push(50);
			s1.push(60);

			System.out.println(s1);

			System.out.println("Popped Element is :"+s1.pop());
			System.out.println("Popped Element is :"+s1.pop());
			System.out.println("Popped Element is :"+s1.pop());
			System.out.println("Popped Element is :"+s1.pop());
			System.out.println("Popped Element is :"+s1.pop());
			

			
			System.out.println("After popping elements, a stack looks like :");
			System.out.println(s1);

			s1.push(90);
			s1.push(100);
			s1.push(110);
			s1.push(120);
			System.out.println();
			System.out.print(s1+" ");

			boolean ans= s1.empty();

			System.out.println();
			System.out.println("stack is empty or not empty :" +ans );
			//System.out.println("Is the stack empty? " + s1.empty());

			System.out.println("top element of stack is : "+s1.peek());

			Stack <Integer> s2 = new Stack<Integer>();
			s2.push(10);
			s2.push(12);
			s2.push(16);

			System.out.println("12 element is at index "+ s2.search(12));
			System.out.println("12 element is at index "+ s2.search(234));//will return -1 if not given element not found in stack

		}
		
		catch(EmptyStackException e){}


	}
}