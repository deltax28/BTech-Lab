import java.net.*;
import java.io.*;

public class getIP {
public static void main(String args[]) throws Exception {
	try{
		InetAddress address = InetAddress.getByName(new URL(urlString).getHost());
		String ip = address.getHostAddress();
		System.out.println("ip:"+ip);
	}
	catch(Exception e){
	}

}	
}