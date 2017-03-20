import java.rmi.*;
import java.rmi.server.*;


public class rmiclient
{
	public static void main(String arg[]) throws Exception
	{	
		rmihello s=(rmihello) Naming.lookup("rmi_hello");
		String str=s.display();
		System.out.println(str);
	}
}
