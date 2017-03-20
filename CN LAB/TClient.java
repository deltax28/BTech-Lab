/*
*	PROGRAM 2 : SOCKET PROGRAMMING
*		Client Program
*/
import java.io.*;
import java.net.*;

public class TClient
{
	public static void main(String arg[]) throws IOException
	{
		try
		{
			Socket s=new Socket("localhost",3000);			
			System.out.println("Server Connected");
			DataOutputStream d = new DataOutputStream(s.getOutputStream());
			d.writeChars("Hello");
			s.close();
		}
		catch(IOException e)
		{	}
	}
}
		