/*
*	PROGRAM 4 : TCP CHAT
*	Server Program
*/
import java.io.*;
import java.net.*;

public class ChatServer
{
	public static void main(String arg[]) throws IOException
	{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));	//Console Input
		String recmsg,smsg;
		try
		{
			ServerSocket ss=new ServerSocket(3000);
			Socket s=ss.accept();
			System.out.println("Client Connected");
			BufferedReader rec= new BufferedReader(new InputStreamReader(s.getInputStream()));
			OutputStream os=s.getOutputStream();
			PrintWriter pw=new PrintWriter(os,true);
						
			while(true) {
				if((recmsg=rec.readLine())!=null)
					System.out.println("Client:"+recmsg);
				smsg=br.readLine();
				pw.println(smsg);
				if(recmsg.equalsIgnoreCase("END"))
					System.exit(0);
			}
		}
		catch(IOException e) {	
	
		}
	}
}