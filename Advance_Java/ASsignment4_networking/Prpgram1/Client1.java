import java.io.*;
import java.net.*;

class Client1 
{

	public static void main(String[] args) throws UnknownHostException, IOException {

		Socket socket = new Socket("localhost", 50710);

		System.out.println("Inet address is " + socket.getInetAddress());

		System.out.println("Local Port is " + socket.getLocalPort());

		System.out.println("Port number is " + socket.getPort());

		socket.close();

	}

}
