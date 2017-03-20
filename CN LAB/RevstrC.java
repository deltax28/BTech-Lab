import java.io.*;
import java.net.*;
import java.lang.*;

public class RevstrC
{
	public static void main(String arg[]) throws IOException
	{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String rmsg,smsg;
		try
		{
			Socket s=new Socket("localhost",3000);			
			System.out.println("Server Connected");
			BufferedReader in= new BufferedReader(new InputStreamReader(s.getInputStream()));
			PrintWriter out=new PrintWriter(s.getOutputStream(),true);
			while(true) {
				smsg=br.readLine();
				out.println(smsg);
				if((rmsg=in.readLine())!=null)
					System.out.println("Server:"+rmsg);
				
				if(rmsg.equalsIgnoreCase("END"))
					System.exit(0);
			}
		}
		catch(IOException e)
		{	}
	}
}
		