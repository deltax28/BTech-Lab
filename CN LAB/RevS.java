import java.io.*;
import java.net.*;

public class RevS
{
	public static void main(String arg[]) throws IOException
	{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String rmsg,smsg;
		try
		{	ServerSocket ss=new ServerSocket(3000);
			Socket s=ss.accept();
			System.out.println("Client Connected");
			BufferedReader in= new BufferedReader(new InputStreamReader(s.getInputStream()));
			PrintWriter out=new PrintWriter(s.getOutputStream(),true);
			int rev,r,n;
			while(true) {
				if((rmsg=in.readLine())!=null)
					System.out.println("Client:"+rmsg);
				n=Integer.parseInt(rmsg);
				//Code To Reverse 
				rev=0;
				while(n>0)
				{
					r=n%10;
					n=n/10;
					rev=rev*10+r;
				}
				System.out.println(rev);
				//Code End
				out.println("Reverse="+rev);
				if(rmsg.equalsIgnoreCase("END"))
					System.exit(0);
			}
			
		}
		catch(IOException e)
		{	}
	}
}