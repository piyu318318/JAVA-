//thread is a unit of a process

class Hii
{
	void display()
	{
		for (int i=0;i<5;i++) 
		{
			System.out.println("Hello");
			try
			{
				Thread.sleep(500);//500 miliseconds
			}
			catch(Exception e) {}
		}
	}

}

class Hello
{
	void show()
	{
		for (int i=0;i<5;i++) 
		{
			System.out.println("HII");
			try
			{
				Thread.sleep(500);
			}
			catch(Exception e){}

		}
	}
}


class Multithreading1
{
	public static void main(String[] args) 
	{
		Hello obj2 = new Hello();
		obj2.show();
		Hii obj1 = new Hii();
		obj1.display();
	}
}
