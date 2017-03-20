import java.rmi.*;

public interface rmihello extends Remote
{
	public String display() throws RemoteException;
}