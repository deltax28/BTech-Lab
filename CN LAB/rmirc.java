import java.rmi.*;
import java.rmi.server.*;
import java.io.*;
import java.lang.*;

public class rmirc
{	public static void main(String arg[]) throws Exception
	{	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		rmirevs s=(rmirevs) Naming.lookup("rmi_revs");
		System.out.println("Enter String:");
		String str=br.readLine();
		String rev=s.reverse(str);
		System.out.println(rev);
	}
}