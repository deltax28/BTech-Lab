import java.io.*;
class acc
{	
	int acno;
	String nm;
	int bal;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	public void acc() throws IOException
	{
		System.out.println("Enter Account No:");
		acno=Integer.parseInt(br.readLine());
		System.out.println("Enter Name");
		nm=new String(br.readLine());
		System.out.println("Enter  Balance:");
		bal=Integer.parseInt(br.readLine());
	}
	public void showbal() throws IOException
	{
		System.out.println("Balance:"+bal);	
	}
	public void withdraw() throws IOException
	{
		int x;
		System.out.println("Enter  Withdrawal amount:");
		x=Integer.parseInt(br.readLine());	
		if(bal<x)	
			System.out.println("Cannot Proceed");
		else {
			bal=bal-x;
			showbal();}
	}
	public void deposit() throws IOException
	{
		int x;
		System.out.println("Enter  Deposit amount:");
		x=Integer.parseInt(br.readLine());	
		bal=bal+x;
		showbal();
	}
	public void  show() throws IOException
	{	System.out.println("Account Details");
		System.out.println("Account No:"+acno);
		System.out.println("Name:"+nm);
		showbal();
	}
}
class BankApp{
	public static void main(String args[]) throws IOException 
	{
	int ch;
	acc a=new acc();
	a.acc();
	a.withdraw();
	a.deposit();
	a.show();
	}
}