//can we use this and super keyword together.
// you cannot use this and super keyword together 
//error will raise as  : call to this must be first statement in constructor  this();

class Base
{
	Base()
	{
		System.out.println("india");
	}	
}

class UseSuperAndThisKeywordTogether extends Base
{
	UseSuperAndThisKeywordTogether()
	{
		super();//super is used to superclass constructor. 
		this(); /// bocoz this used to call current class constructor and 
		System.out.println("object is created : ");
	}
	public static void main(String[] args) 
	{
		UseSuperAndThisKeywordTogether obj = new UseSuperAndThisKeywordTogether();	
	}
}
