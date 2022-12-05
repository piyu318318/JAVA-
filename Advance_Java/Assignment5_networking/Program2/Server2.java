
import java.io.*;
import java.net.*;

class Server2
{
	public static void main(String[] args)throws IOException,UnknownHostException 
	{
		ServerSocket serversocket = new ServerSocket(50710);

		System.out.println("waiting client to get connect !");

		Socket socket = serversocket.accept();

		InputStream is = socket.getInputStream();
		DataInputStream dis = new DataInputStream(is);
		OutputStream os = socket.getOutputStream();
		DataOutputStream dos = new DataOutputStream(os);

		String str = dis.readUTF();

		StringBuffer buffer = new StringBuffer();

		for (int i=str.length()-1;i>=0 ;i-- ) 
		{
			buffer.append(str.charAt(i));
		}

		String strstr = buffer.toString();

		strstr.trim();

		

		dos.writeUTF(strstr);

		dos.close();
		dis.close();


	}
}

/*



		*/
