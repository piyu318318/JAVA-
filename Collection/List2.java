import java.util.*;

class List2
{
	public static void main(String[] args) 
	{
		ArrayList <String> list1 =new <String>ArrayList ();

		list1.add("india");
		list1.add("pakistan");
		list1.add("nepal");
		list1.add("bhutan");
		list1.add("shri lanka");

		Collections.sort(list1);

		System.out.println(list1.get(0));
	}
}
