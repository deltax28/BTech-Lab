import java.rmi.*;
import java.rmi.server.*;
import java.io.*;
import java.lang.*;

public class rmiac
{	public static void main(String arg[]) throws Exception
	{	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		rmiadd s=(rmiadd) Naming.lookup("rmi_add");
		System.out.println("Enter 1st no:");
		double a=Double.valueOf(br.readLine()).doubleValue();
		System.out.println("Enter 2nd no:");
		double b=Double.valueOf(br.readLine()).doubleValue();
		double sum=s.add(a,b);
		System.out.println(sum);
	}
}
