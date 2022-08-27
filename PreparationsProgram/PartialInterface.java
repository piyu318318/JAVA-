//all the methods defined in the interface Countries should be overrid in which Countries are implemented
/*void india() , void spain()  must be ovveride in  Demo if you override only then 
defined that class as a abstract class  this is called as partial interface 
then after you have to override spain() method in another class just like i did in class Der2  */   


interface Countries
{
	void india();
	void spain();
}

abstract class Der1 implements Countries 
{
	public void india()
	{
		System.out.println("we are indians !!");
	}

}

class Der2 extends Der1
{
	void spain()
	{
		System.out.println("we are spanish !!");
	}

	public void display()
	{
		System.out.println("in the Demo class");
	}
}

class PartialInterface
{
	public static void main(String[] args) 
	{
		Der2 obj  = new Der2();

		obj.spain();
		obj.india();		
		obj.display();			
	}
	

}
