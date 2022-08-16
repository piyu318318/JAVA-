/*
Map is  an interface.
The map interface is present in java.util package represents a mapping between a key and a value. The Map interface is not a subtype of the Collection interface. Therefore it behaves a bit differently from the rest of the collection types. A map contains unique keys.
*/
//hashmaps are unordered
import java.util.*;
class HashMap1
{
	public static void main(String[] args) 
	{
		Map<String,String> mp = new HashMap<String,String>();

		mp.put("one","anvesh");	
		mp.put("two","yash");	
		mp.put("three","naralpani");	
		mp.put("four","dicky");	
		mp.put("five","ramesh");
		mp.put("one","anna");//anna will replace at piyush.we can have.
		mp.put("seven","ramesh");//seven ant siz both have same ramesh name.

		for (Map.Entry<String,String> e  : mp.entrySet() ) 
		{
			System.out.println("key is :"+e.getKey()+" value is:"+e.getValue());
		}
		//will print all key vallue pairs in th hashmap
		System.out.println();
		System.out.println(mp);

		for (String i : mp.keySet()) 
		{
  		System.out.println("key: " + i + " value: " + mp.get(i));
		}

		//
  		System.out.println("\nValues in the hashmap");
		for (String i : mp.values()) 
		{
 				 System.out.println(i);
		}	

  		System.out.println("\nkeys in the hashmap");
		for (String i : mp.keySet()) 	
		{
  				System.out.println(i);
		}
	}
}
