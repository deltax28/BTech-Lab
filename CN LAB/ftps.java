import java.io.*;
import java.net.*;

public class ftps
{
	public static void main (String args[]) throws IOException
	{ 
		try{
			ServerSocket ss=new ServerSocket(3000);
			Socket s=ss.accept();
			System.out.println("Client Connected");
			PrintWriter out=new PrintWriter(s.getOutputStream(),true);
			BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
			BufferedReader in= new BufferedReader(new InputStreamReader(s.getInputStream()));
			String filename=in.readLine();
			FileInputStream ff=new FileInputStream(filename);
			BufferedInputStream bfr = new BufferedInputStream(ff);
			byte[] a=new byte[ff.available()];
			bfr.read(a,0,a.length);
			String data =new String(a);
			System.out.println("Older File Data is:"+data);
			out.println(data);
			ss.close();
		}
		catch(IOException e)
		{	}
	}
}