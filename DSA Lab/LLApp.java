import java.io.*;
class link
{
	public int idata;
	public link next;
	public link(int id)
	{
		idata=id;
	}
	public void displaylink()
	{
		System.out.println(+idata);
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
	public void insertfirst(int id)
	{
		link newlink=new link(id);
		newlink.next=first;
		first=newlink;
	}
	public link deletefirst()
	{
		link temp=first;
		first=first.next;
		return temp;
	}
	public void displaylist()
	{
		System.out.println("list(first->last)");
		link current=first;
		while(current!=null)
		{
			current.displaylink();
			current=current.next;
		}
	}
}
class LLApp
{
	public static void main(String arg[ ]) throws IOException
	{
		linklist thelist=new linklist();
		int a,n,x;
		do
		{
			System.out.print("1.Insertion 2.Deletion 3.Display\nEnter your option ");
			InputStreamReader z=new InputStreamReader(System.in);
			BufferedReader br=new BufferedReader(z);
			n=Integer.parseInt(br.readLine());
			switch(n)
			{
				case 1:
						System.out.println("enter key");
						a=Integer.parseInt(br.readLine());
						thelist.insertfirst(a);
						break;
				case 2:
						link alink=thelist.deletefirst();
						System.out.println("deleted");
						alink.displaylink();
						System.out.println(" ");
						
						break;
						
				case 3:thelist .displaylist();
						break;
			}
			System.out.println("enter 1 for continuing");
			x=Integer.parseInt(br.readLine());
		}
		while(x==1);
	}
}