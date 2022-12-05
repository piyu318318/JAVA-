
import java.io.*;
import java.net.*;

class Client1
{
	public static void main(String[] args)throws IOException, UnknownHostException
	{
			
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Socket socket = new Socket("localhost",50710);

		OutputStream os = socket.getOutputStream();
		DataOutputStream dos = new DataOutputStream(os);

		
		String str="";

		while(!(str.equals("end")))
		{
			str = br.readLine();
			dos.writeUTF(str);
		}	
	}
} 
