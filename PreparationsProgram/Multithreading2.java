//Thread is a class in java through wi=hich we can achieve multithreading
// we can also achieve multithreading using Runnable interface

class MyThread extends Thread
{
	public void run()
	{
		System.out.println("Thread is running.");
	}

}

class Multithreading2
{
	public static void main(String[] args) 
	{
		MyThread obj = new MyThread();

		obj.start();
	}	
}
