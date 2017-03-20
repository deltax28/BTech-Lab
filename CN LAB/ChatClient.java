/*
*	PROGRAM 4 : CHAT SOCKET
*	Client Program
*/
import java.io.*;
import java.net.*;

public class ChatClient
{
	public static void main(String arg[]) throws IOException
	{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in)); //Console Input
		String recmsg,smsg;
		try
		{
			Socket s=new Socket("localhost",3000);
			System.out.println("Server Connected");
			BufferedReader rec= new BufferedReader(new InputStreamReader(s.getInputStream()));
			OutputStream os=s.getOutputStream();
			PrintWriter pw=new PrintWriter(os,true);
			while(true) {
				smsg=br.readLine();
				pw.println(smsg);
				if((recmsg=rec.readLine())!=null)
					System.out.println("Server:"+recmsg);
				
				if(recmsg.equalsIgnoreCase("END"))
					System.exit(0);
			}
		}
		catch(IOException e) {
			
		}
	}
}	