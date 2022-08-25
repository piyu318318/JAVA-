//setters and getters are used to use private data member
class Student
{
	private String name;
	public String getName()
	{
		return name;
	} 

	public void setName(String n)
	{
		name = n;
	}
}

class GettersAndSetters
{
	public static void main(String[] args) 
	{
		Student obj = new Student();
    	obj.setName("piyush");

    	System.out.println(obj.getName());		
	}
}
