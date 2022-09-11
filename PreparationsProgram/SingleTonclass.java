//a class which we can create obly 1 object is called as singleton class

class SingleTonclass
{
	private SingleTonclass()
	{
		System.out.println("piyush");
	}
	
	private static SingleTonclass instance;//create instance variable

	public static SingleTonclass getinstance()//will return the instance 
	{
		if(instance == null)
			instance = new SingleTonclass();

		return instance;
	}
}

class Main
{
	public static void main(String[] args) 
	{
		SingleTonclass obj1 = SingleTonclass.getinstance();
		SingleTonclass obj2 = SingleTonclass.getinstance();//will not get created

	}
}
