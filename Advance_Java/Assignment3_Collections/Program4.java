//create hshtable containing studet name and student percentage
//display the details of hashtable Also search for specific student .
//display the message student record not found if student does not exist in a hashtale

import java.util.*;
import java.io.*;

class Program4
{
	public static void main(String[] args) throws IOException
	{
		Hashtable <String ,Integer> h1 = new Hashtable<>();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("");
		String name;
		int per;

		while(true)
		{
			System.out.println("Enter your choice :1.add student details 2.search student 3.Display all students 4.exit");
			int ch  =Integer.parseInt(br.readLine());

			switch(ch)
			{
				case 1:
					System.out.println("Enter name of student :");
					name = br.readLine();
					System.out.println("Enter percentage for student :");
					per = Integer.parseInt(br.readLine());

					if(!h1.containsKey(name))
						h1.put(name,per);
					else
						System.out.println("already "+name+ " exists");
					break;
				case 2:
					System.out.println("Enter name of student you want to search :");
					String search = br.readLine();

					if(h1.containsKey(search))
						System.out.println("student found :" +"\nname is :"+search+"\npercentage are "+ h1.get(search));
					else
						System.out.println("student record not found");

					break;
				
				case 3:
					System.out.println("All Student details :");
					System.out.println(h1);
					break;

				case 4:
					System.exit(0);
					break;
			}
		}

	}
}
