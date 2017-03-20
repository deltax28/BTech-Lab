import java.rmi.*;

public interface rmiadd extends Remote
{
	public double add(double a,double b) throws RemoteException;
}