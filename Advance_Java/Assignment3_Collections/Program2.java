import java.util.*;
import java.io.*;

 class Program2
{
	public static void main(String[] args) throws IOException
	{
		TreeSet <String> s1 = new TreeSet <>();
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		String color ;
		int flag =0;
		while(true)
		{
			System.out.println("Enter your choice :");
			System.out.println("1.for add color 2.for display all colors 3.Exit");
			int ch = Integer.parseInt(br.readLine());
			
			switch(ch)
			{
				case 1:
					try
					{
						System.out.println("Enter a color :");
						color = br.readLine();
						if(s1.contains(color))
							System.out.println("color aleady exist");
						else
							s1.add(color);
					}
					catch(NumberFormatException e)
					{
						System.out.println("not a string");
						System.out.println("not added ");
					}

					break;
				case 2:
					//Collection.sort(s1);
					Iterator value = s1.iterator();
					while (value.hasNext()) 
					{
            			System.out.println(value.next());
        			}
					break;
				case 3:
					System.exit(0);
					break;
			}
		}
	}
}
