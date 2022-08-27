//using interfaces we can achieve a multiple inheriance in java as multiple inheritance is not supported by the java
//example if i create class piyush, class madhav in which i have intitialize n=10 and n=20 both class extennded by the class demo when we use n in demo class
//the demo class will get confused which n to used. to overcome from this drawback java has interfaces 
//default variables in interfaces are public static final
//default variables in interfaces are public abstract
//inteface can have abstract methods but it cannot have its own method as abstract class has.

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
