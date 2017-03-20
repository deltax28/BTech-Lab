import java.io.*;
class link
{
	public double ddata;
	public link next;
	public link(double dd)
	{
		ddata=dd;
	}
	public void displaylink()
	{
		System.out.println(ddata+" ");
	}
}	
class linklist
{
	private link first;
	public linklist()
	{
		first=null;
	}
	public boolean isempty()
	{
		return(first==null);
	}
	public void insertfirst(double dd)
	{
		link newlink=new link(dd);
		newlink.next=first;
		first=newlink;
	}
	public double deletefirst()
	{
		link temp=first;
		first=first.next;
		return temp.ddata;
	}
	public void displaylist()
	{
		link current=first;
		while(current!=null)
		{
			current.displaylink();
			current=current.next;
		}
		System.out.println(" ");
	}
}
class linkstack
{
	private linklist thelist;
	public linkstack()
	{
		thelist=new linklist();
	}
	public void push(double j)
	{
		thelist.insertfirst(j);
	}
	public double pop()
	{
		return thelist.deletefirst();
	}
	public boolean isempty()
	{
		return (thelist.isempty());
	}
	public void displaystack()
	{
		System.out.println("stack(top->bottom):");
		thelist.displaylist();
	}
}
class linkstackapp
{
	public static void main(String arg[ ]) throws IOException
	{
		linkstack thestack=new linkstack();
		int a,n,x;
		do
		{
			System.out.println("1.insertion 2.deletion 3.display\nEnter your option");
			InputStreamReader z=new InputStreamReader(System.in);
			BufferedReader br=new BufferedReader(z);
			n=Integer.parseInt(br.readLine());
			switch(n)
			{
			case 1:
				System.out.println("enter key");
				a=Integer.parseInt(br.readLine());
				thestack.push(a);
				break;
			case 2:
					double v=thestack.pop();
					System.out.println("Deleted"+v);
				break;
				
			case 3: thestack.displaystack();
				break;
			}
			System.out.println("enter 1 for continuing");
			x=Integer.parseInt(br.readLine());
		}while(x==1);
	}
}