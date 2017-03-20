import java.rmi.*;
import java.rmi.server.*;

public class rmiserver extends  UnicastRemoteObject implements rmihello
{
	public rmiserver() throws RemoteException
	{
	}
	public String display() throws RemoteException
	{
		return ("Hello 4m the server");
	}
	public static void main(String arg[]) throws Exception
	{
		rmiserver s=new rmiserver();
		Naming.rebind("rmi_hello",s);
		System.out.println("Server is ready");
	}
}