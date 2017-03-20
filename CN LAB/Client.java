/*
*	PROGRAM 1 : SOCKET PROGRAMMING
*		Client Program
*/
import java.io.*;
import java.net.*;

public class Client
{
	public static void main(String arg[]) throws IOException
	{
		try
		{
			Socket s=new Socket("localhost",3000);
			BufferedReader br= new BufferedReader(new InputStreamReader(s.getInputStream()));
			String str=br.readLine();
			System.out.println(str);
		}
		catch(IOException e)
		{	}
	}
}
		