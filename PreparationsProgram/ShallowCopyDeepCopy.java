
class ABC
{
	int i,j;
}

class ShallowCopyDeepCopy
{
	public static void main(String[] args) 
	{
		//shaloow copy
		ABC obj1 = new ABC();
		
		obj1.i=5;
		obj1.j=10;

		ABC obj2 = obj1;//shaloow copy

		//deep copy
		ABC obj3 = new ABC();
		obj3.i=100;
		obj3.j=200;

		ABC obj4 = new ABC();
		obj3.i=obj4.i;
		obj3.j=obj4.j;

	}	
}
