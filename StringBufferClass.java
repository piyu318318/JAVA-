//Stringbuffer class in java is immutable.
//means you can change the string. 

class StringBufferClass
{
	public static void main(String[] args) 
	{
		StringBuffer s1= new StringBuffer("piyush");
		//appends to the existing string
		s1.append("dixit");
		System.out.println(s1);

		//The insert() method inserts the given String with this string at the given position.

		s1.insert(1,"india");
		System.out.println(s1);//at existing string index 1 india will get added.

		//The delete() method of the StringBuffer class deletes the String from 
		//the specified beginIndex to endIndex.
		s1.delete(1,7);
		System.out.println(s1);//india will get delete

		//insert
		s1.insert(1,'i');
		s1.insert(2,'r');

		//reverse() will get reverse existing bufferString
		s1.reverse();
		System.out.println(s1);

		//capapcity will return capacity of string is 16
		System.out.println(s1.capacity()); 

		StringBuffer s2 = new StringBuffer("india is great country al indians are");
		System.out.println(s2);
		System.out.println(s2.capacity()); 

		//charA
		System.out.println(s2.charAt(10));//will return r


		// indexof will return stating index of substring
		System.out.println(s2.indexOf("is")); 

		//substring
		System.out.println(s2.substring(7));//will return substring starting from 7th index up to end 

		//substring 
		System.out.println(s2.substring(10,15));//will return substring starting from 12th index ip to 15th index 

		//
		try 
		{
            // get substring starts from index -7
            // using substring() and print
            s1.substring(-7);
        }
  
        catch (Exception e) 
        {
            System.out.println("Exception is : " + e);
        }

        //
        System.out.println("Before trim s1 capacity of s1 is :"+s1.capacity());
        s1.trimToSize();
        System.out.println("After trim s1 capacity of s1 is:"+s1.capacity());


        //toString will represents String into objects
        System.out.println("String is :"+s1.toString());

        //

	}
}