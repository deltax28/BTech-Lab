/*
*	PROGRAM 1 : SOCKET PROGRAMMING
*		Server Program
*/
import java.io.*;
import java.net.*;

public class Server
{
	public static void main(String arg[]) throws IOException
	{
		try
		{
			ServerSocket ss=new ServerSocket(3000);
			Socket s=ss.accept();
			System.out.println("Client Connected");
			DataOutputStream d = new DataOutputStream(s.getOutputStream());
			d.writeChars("Hello");
			s.close();
		}
		catch(IOException e)
		{	}
	}
}
		