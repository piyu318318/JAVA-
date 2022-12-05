
import java.io.*;
import java.net.*;

class Client2
{
	public static void main(String[] args)throws IOException,UnknownHostException 
	{
		Socket socket = new Socket("localhost",50710);

		InputStream is = socket.getInputStream();
		DataInputStream dis = new DataInputStream(is);

		System.out.println("server date is :"+dis.readUTF());
		
		System.out.println("client close :");

		dis.close();
		socket.close();
	}	
}
