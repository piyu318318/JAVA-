import java.io.*;

class Stack
{
	static final int max=5;
	public static void main(String[] args)throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//System.out.println("Enetr length for stack :");
		//int n = Integer.parseInt(br.readLine());
		int arr[] = new int[max];

		

		while(true)
		{
			System.out.println("Enetryour choice 1.push 2.pop 3.display 4.exit :");
			int ch = Integer.parseInt(br.readLine());
			switch(ch)
			{
				case 1:
						Stack.push(arr);
						break;
				case 2:
						Stack.pop(arr);
						break;
				case 3:
						Stack.display(arr);
						break;
				case 4:System.exit(0);			
			}
		}
	}


static int top=-1;
	static void push(int arr[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//int top = arr.length-1;
		
		int max = arr.length;
		/*
		if(Stack.top == Stack.max)
		{
			System.out.println("stack is already full bro ");
		}
		*/

		try{
			Stack.top =Stack.top+1;
			System.out.println("Enter number to be pushed :");
			int no = Integer.parseInt(br.readLine());
			arr[Stack.top] = no;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Stack is full bro !");
		}
	}

	static void pop(int arr[])
	{
	//	int top = arr.length-1;

		if(Stack.top == -1)
		{
			System.out.println("Stack is empty bruh");
		}
		else
		{
			Stack.top = Stack.top-1;
			System.out.println("Element is popped :"+ arr[Stack.top]);
		}	  
	}

	static void display(int arr[])
	{
	//	int top = arr.length-1;
		int max = arr.length;
		/*
		if(Stack.top == -1)
		{
			System.out.println("Stack is already full bro ");
		}*/

		try
		{
			for(int i=arr.length-1;i>=0;i--)
			{
				System.out.println(arr[i]);
			}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
				System.out.println("Stack is full bro !");
		}
		
	}
}

