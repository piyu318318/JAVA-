interface Piyush
{
	int n=10;
	String name="piyush";
	void display();
}


interface Madhav 
{
	int n=20;
	String name = "madhav";
	void show();
}


//one interface can extends one or more intefaces

interface welcome extends Piyush,Madhav
{
	void welcome(); 
} 

class Demo implements welcome
{
	public void welcome()
	{
		System.out.println("Welcome "+Piyush.name+" and "+Madhav.name);
	}
	public void display()
	{
		System.out.println("name is :"+Piyush.name);
		System.out.println("value of a is :"+Piyush.n);

	}
	public void show()
	{
		System.out.println("name is :"+Madhav.name);
		System.out.println("value of a is :"+Madhav.n);
	}
}


class InterFaceInJava1
{
	public static void main(String[] args) 
	{
		Demo obj = new Demo();
		obj.welcome();
		obj.display();
		obj.show();
	}
}
