import java.io.*;
import java.net.*;
public class udpc
{
	public static void main(String arg[]) throws IOException
	{
		DatagramSocket ds=new DatagramSocket();
		String str = "Welcome To Java";
		InetAddress ip = InetAddress.getByName("127.0.0.1");
		DatagramPacket dp = new DatagramPacket(str.getBytes(),str.length(),ip,3000);
		ds.send(dp);
		ds.close();
	}
}
