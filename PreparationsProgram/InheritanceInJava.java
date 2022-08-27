

interface Piyush
{
	int n=19;//in interface variables are default public static final
	public void display();//in interface methods are default abstract
}	

interface Madhav
{
  	int n=10;//public static final
	public void show();
}

class Demo implements Piyush,Madhav
{
	public void display()
	{
		System.out.println("value of n is :"+n);//public static final so to access this variable use InterfaceName.varname 
		System.out.println("piyush");
	}

	public void show()
	{
		System.out.println("value of n is :"+n);//public static final so to access this variable use InterfaceName.varname
   		System.out.println("madhav");
	}
}	

class InterFaceInJava 
{
	public static void main(String[] args) 
	{
		Demo obj = new Demo();
		obj.display();
		obj.show();
	}
}
