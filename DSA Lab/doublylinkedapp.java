import java.io.*; 
class link
{public double data;
public link next;
public link previous;
public link (double d)
{data=d;}
public void displaylink()
{System.out.println(data+"  ");}
}
class doublylinkedlist
{private link first;
private link last;
public link current;
public doublylinkedlist()
{
first=null;
last=null;}
public boolean isempty()
{return(first==null);}
public void insertfirst(int dd)
{link newlink=new link(dd);
if (isempty())
last=newlink;
else 
first.previous=newlink;
newlink.next=first;
first=newlink;
}
public void insertlast(int dd)
{link newlink=new link(dd);
if (isempty())
first=newlink;
else
{last.next=newlink;
newlink.previous=last;}
last=newlink;
}
public link deletefirst()
{link temp=first;
if(first.next==null)
last=null;
else
first.next.previous=null;
first=first.next;
return temp;
}
public link deletelast()
{
link temp=last;
if(first.next==null)
last=null;
else
last.previous.next=null;
last=last.previous;
return temp;}
public boolean insertAfter(long key, long dd)
	{ 
		link current = first;
		while(current.data != key)
		{
			current = current.next;
			if(current == null)
			return false; 
		}
		link newlink = new link(dd);
		if(current==last)
		{
			newlink.next = null;
			last = newlink; 
		}
		else 
		{
			newlink.next = current.next;
			current.next.previous = newlink;
		}
		newlink.previous = current;
		current.next = newlink; 
		return true;
	}
public link deletekey(int key)
{ current=first;
while(current.data!=key)
{current=current.next;
if(current==null)
return null;
}
if(current==first)
first=current.next;
else
current.previous.next=current.next;
if(current==last)
last=last.previous;
else
current.next.previous=current.previous;
return current;}
public void displayforward()
{
System.out.println("dubly linked list from (first--->last)");
current=first;
while(current!=null)
{current.displaylink();
current=current.next;
}
}
public void displaybackward()
{System.out.println("doubly linked list from last ---> first");
current=last;
while(current!=null)
{current.displaylink();
current=current.previous;
}
}}
class doublylinkedapp
{
public static void main(String args[ ]) throws IOException 
{doublylinkedlist thelist=new doublylinkedlist();
int x;
InputStreamReader i=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(i);
do
{
System.out.print("\n1.insert first\n2.insert last\n3.delete first\n4.deletelast\n5.delete  a key\n6.Insert After\n7. display forward\n8.display backward\nEnter your option:");
int n=Integer.parseInt(br.readLine());
  switch(n)
{
  case 1:System.out.println("enter the key");
int c=Integer.parseInt(br.readLine());
thelist.insertfirst(c);
break;
case 2:
System.out.println("enter the key");
int b=Integer.parseInt(br.readLine());
thelist.insertlast(b);
break;
case 3:thelist.deletefirst();
break;
case 4:thelist.deletelast();
break;
case 5:System.out.println("enter the key you want to delete");
int a=Integer.parseInt(br.readLine());
thelist.deletekey(a);
break;
case 6:System.out.println("enter the key");
int k=Integer.parseInt(br.readLine());
System.out.println("enter the data");
int dd=Integer.parseInt(br.readLine());
thelist.insertAfter(k,dd);
break;
case 7:thelist.displayforward();
break;
case 8:thelist.displaybackward();
break;
}
System.out.println("enter 1 for continue");
x=Integer.parseInt(br.readLine());
}while(x==1);
}}