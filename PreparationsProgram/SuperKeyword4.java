//super keyword also use to refer the super class instance variables
class FirstYear
{
	int rollno=10;
//	void display()
//	{
//		System.out.println("roll number of madhav in sy is :"+fy);
//	}

}

class SecondYear extends FirstYear
{
	int rollno=20;
	void display()
	{
		System.out.println("roll number of piyush in fy was :"+super.rollno);//this will refer the super class rollno variable
		System.out.println("roll number of piyush in sy is :"+rollno);
	}
}

class SuperKeyword4
{
	public static void main(String[] args) 
	{
		SecondYear obj1 = new SecondYear();
		obj1.display();
	}
}
