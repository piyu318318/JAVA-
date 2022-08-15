//queue is abstract cannot be instantiate.
import java.util.*;
class Queue1
{
	public static void main(String[] args) 
	{
		//Queue<String> pq= new Queue<String>();
		Queue<Integer> q = new LinkedList<>();
		q.add(20);
		q.add(11);
		q.add(13);
		q.add(5);
		q.add(90);


		System.out.println(q);

		//poll :removes the element at the head of queue and returns null if queue is empty

		System.out.println("Queues head is : "+q.poll());
		System.out.println("After removing head queue is :");
		System.out.println(q);

		//remove removes elemnt at head of queue and and throws NoSuchElementException if queue is empty  
		System.out.println();
		System.out.println("After removing head , queue is :");
		System.out.println("removed element is :"+q.remove());
		System.out.println(q);

		
		//peek returns head of queue without removing it
		System.out.println("head of queue is :"+q.peek());

		//size = returns size of queue
		System.out.println("Size of queuue is : "+q.size());
		




	}
}