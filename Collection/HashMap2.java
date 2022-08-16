
import java.util.*;
class HashMap2
{
	public static void main(String[] args) 
	{
		///key =country value=population
		HashMap<String,Integer> map = new HashMap<String,Integer> ();

		map.put("India",123); 	
		map.put("US",2); 	
		map.put("Spain",234); 	
		map.put("italy",432); 	
		map.put("china",3543543);

		System.out.println(map);

		//search using containskey
		if(map.containsKey("china"))
			System.out.println("\nkey is present.");
		else
			System.out.println("Key is not present.");


		if(map.containsValue(324))
			System.out.println("\nkey is present.");
		else
			System.out.println("Key is not present.");

		//search : get 
		System.out.println();
		System.out.println(map.get("china"));//will print value assigned to key china
		System.out.println(map.get("bharat"));//key doent exist so will print null

		//traverse on hashmaps
	
		for (Map.Entry<String,Integer> element : map.entrySet() ) 
		{
			System.out.println(element.getKey()+" "+element.getValue());							
		}

		 
    

	}
}