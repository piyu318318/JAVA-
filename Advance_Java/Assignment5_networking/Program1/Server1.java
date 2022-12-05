
import java.io.*;
import java.net.*;

class Server1
{
	public static void main(String[] args)throws IOException,UnknownHostException 
	{
		ServerSocket serversocket = new ServerSocket(50710);

		System.out.println("waiting client to connect !");

		Socket socket = serversocket.accept();

		InputStream is = socket.getInputStream();
		DataInputStream dis = new DataInputStream(is);


		String str;

		while(!(str = dis.readUTF()).equals("end"))
		{
			System.out.println("\n"+str);
		}
	}
}
