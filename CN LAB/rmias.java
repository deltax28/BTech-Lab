import java.rmi.*;
import java.rmi.server.*;
import java.io.*;
import java.lang.*;

public class rmias extends  UnicastRemoteObject implements rmiadd
{	public rmias() throws RemoteException
	{
	}
	public double add(double a, double b) throws RemoteException
	{
		return a+b;
	}
	public static void main(String arg[]) throws Exception
	{
		rmias s=new rmias();
		Naming.rebind("rmi_add",s);
		System.out.println("Server is ready");
	}
}