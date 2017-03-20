
import java.io.*;
import java.net.*;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Deepak
 */
public class FTPServer {
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
			FileInputStream ff=new FileInputStream("C:\\Users\\Deepak\\Documents\\NetBeansProjects\\CNLab\\src"+filename);
			BufferedInputStream bfr = new BufferedInputStream(ff);
			byte[] a=new byte[1024];
			bfr.read(a,0,a.length);
			String data =new String(a);
			System.out.print("Older File Data is:"+data);
			out.println(a);
			ss.close();                    
		}
		catch(IOException e)
		{	}
	}
}
