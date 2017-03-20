import java.rmi.*;

public interface rmirevs extends Remote
{
	public String reverse(String str) throws RemoteException;
}