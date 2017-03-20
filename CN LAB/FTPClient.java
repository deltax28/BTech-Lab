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
public class FTPClient {
    public static void main (String args[]) throws IOException
	{ 
		try{
			Socket s=new Socket("localhost",3000);
			System.out.println("Server Connected");
			PrintWriter out=new PrintWriter(s.getOutputStream(),true);
			BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
			BufferedReader in= new BufferedReader(new InputStreamReader(s.getInputStream()));
			String sms,rec;
			System.out.println("Enter file name:");
			String source=null;
			String msg;
			String destn=null;
			source=br.readLine();
			out.println(source);
			msg=in.readLine();
			System.out.println("Enter destin file name:");
			destn=br.readLine();
			File f= new File("C:\\Users\\Deepak\\Documents\\NetBeansProjects\\CNLab\\src"+destn);
			FileOutputStream fos=new FileOutputStream(f);
			System.out.println(msg);
			if(f.exists()) {
				fos.write(msg.getBytes());
				fos.flush();
				System.out.println("Data written to file:"+destn);
				s.close();
			}
			else {
				System.out.println("File not exist");
			}
		}
		catch(IOException e)
		{	}
	}
}
