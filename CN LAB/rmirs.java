import java.rmi.*;
import java.rmi.server.*;
import java.io.*;
import java.lang.*;

public class rmirs extends  UnicastRemoteObject implements rmirevs
{	public rmirs() throws RemoteException
	{
	}
	public String reverse(String str) throws RemoteException
	{	String rev="";
		for(int i=str.length()-1;i>=0;i--)	
			rev=rev+str.charAt(i);
		return rev;
	}
	public static void main(String arg[]) throws Exception
	{
		rmirs s=new rmirs();
		Naming.rebind("rmi_revs",s);
		System.out.println("Server is ready");
	}
}