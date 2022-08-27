
class India
{
	void display()
	{
		System.out.println("india");
	}
	class Spain
	{
		void show()
		{
		System.out.println("spain");
		}
	}
}


class InnerClass1
{
	public static void main(String[] args) 
	{
		India outer = new India();
		India.Spain inner = outer.new Spain();

		outer.display();
		inner.show();
	}
}
