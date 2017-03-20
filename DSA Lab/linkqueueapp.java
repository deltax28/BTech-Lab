import java.io.*;
class link
{
	public double ddata;
	public link next;
	public link (double d)
	{
		ddata=d;
	}
	public void displaylink()
	{
		System.out.println(ddata+" ");
	}
}	
class firstlastlist
{
	private link first;
	private link last;
	public firstlastlist()
	{
		first=null;
		last=null;
	}
	public boolean isempty()
	{
		return (first==null);
	}
	public void insertlast(double dd)
	{
		link newlink=new link(dd);
		if(isempty())
			first=newlink;
		else
			last.next=newlink;
		last=newlink;
	}
	public double deletefirst()
	{
		double temp=first.ddata;
		if(first.next==null)
		last=null;
		first=first.next;
		return temp;
	}
	public void displaylist()
	{
		link current=first;
		while(current!=null)
		{
			current.displaylink();
			current=current.next;
		}
	}
}	
class linkqueue
{
	private firstlastlist thelist;
	public linkqueue()
	{
		thelist=new firstlastlist();
	}
	public boolean isempty()
	{
		return thelist.isempty();
	}
	public void insert(double j)
	{
		thelist.insertlast(j);
	}
	public double delete()
	{
		return thelist.deletefirst();
	}
	public void displayqueue()
	{
		System.out.println("queue(front->rear)");
		thelist.displaylist();
	}
}	
class linkqueueapp
{
	public static void main(String arg[ ])throws IOException
	{
		linkqueue thequeue=new linkqueue();
		InputStreamReader z=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(z);
		int a;
		int x;
		do
		{
			System.out.println("1.Insertion 2.Delete 3.Display\nEnter your option");
			a=Integer.parseInt(br.readLine());
			switch(a)
			{
			case 1:
				System.out.println("enter the key");
				int b=Integer.parseInt(br.readLine());
				thequeue.insert(b);
				break;
			case 2:double v=thequeue.delete();
					System.out.println("Deleted"+v);
				break;
			case 3:
				thequeue.displayqueue();
				break;
			}
			System.out.println("enter 1 for continue");
			x=Integer.parseInt(br.readLine());
		}
		while(x==1);
	}
}