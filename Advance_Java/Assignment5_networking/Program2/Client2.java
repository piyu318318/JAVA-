
import java.io.*;
import java.net.*;

class Client2
{
	public static void main(String[] args)throws IOException,UnknownHostException 
	{
		Socket socket = new Socket("localhost",50710);

		String str;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		InputStream is = socket.getInputStream();
		DataInputStream dis = new DataInputStream(is);
		OutputStream os = socket.getOutputStream();
		DataOutputStream dos = new DataOutputStream(os);

		System.out.println("Enter string :");
		str = br.readLine();

		dos.writeUTF(str);

		System.out.println(" "+dis.readUTF());

	}
} 
