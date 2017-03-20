import java.io.*;
import java.net.*;

public class RevstrS
{
	public static void main(String arg[]) throws IOException
	{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String rmsg,smsg,rev;
		try
		{	ServerSocket ss=new ServerSocket(3000);
			Socket s=ss.accept();
			System.out.println("Client Connected");
			BufferedReader in= new BufferedReader(new InputStreamReader(s.getInputStream()));
			PrintWriter out=new PrintWriter(s.getOutputStream(),true);
			while(true) {
				rev="";
				if((rmsg=in.readLine())!=null)
					System.out.println("Client:"+rmsg);
				if(rmsg.equalsIgnoreCase("END"))
					System.exit(0);
				for(int i=rmsg.length()-1;i>=0;i--)	
					rev=rev+rmsg.charAt(i);
				
				System.out.println(rev);
				out.println(rev);
			}
			
		}
		catch(IOException e)
		{	}
	}
}