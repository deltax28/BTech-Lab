/*
*	PROGRAM 2 : SOCKET PROGRAMMING
*		Server Program
*/
import java.io.*;
import java.net.*;

public class TServer
{
	public static void main(String arg[]) throws IOException
	{
		try
		{
			ServerSocket ss=new ServerSocket(3000);
			Socket s=ss.accept();
			BufferedReader br= new BufferedReader(new InputStreamReader(s.getInputStream()));
			String str=br.readLine();
			System.out.println(str);
		}
		catch(IOException e)
		{	}
	}
}