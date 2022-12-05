
import java.io.*;
import java.net.*;
import java.util.*;

class Server2
{
	public static void main(String[] args) throws IOException,UnknownHostException
	{
		ServerSocket serversocket = new ServerSocket(50710);

		System.out.println("waiting client to conenct ");

		Socket socket = serversocket.accept();

		OutputStream os = socket.getOutputStream();
		DataOutputStream dos = new DataOutputStream(os);

		Date d = new Date();

		dos.writeUTF(d.toString());

		dos.close();
		socket.close();

	}
} 
