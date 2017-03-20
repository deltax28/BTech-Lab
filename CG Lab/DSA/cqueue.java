import java.io.*;
import java.lang.*;
class cqueue
{
int max,f,r,nt;
public int [] a;
public cqueue(int n)
{
max=n;
a= new int [max];
f=0;
r=-1;
nt=(r+1%max);
}
public void insert(int x)throws IOException
{
if(nt==max)
System.out.println("Queue is full");
else
{
if(r==max-1)
{
r=-1;
} 
a[++r]=x;
nt++;
}
}
public void remove()throws IOException
{
if(f==0)
f=0;
System.out.println("Deleted element"+a[f++]);
nt--;
}
public int empty()throws IOException
{
if(nt==0)
return 1;
else
return 0;
}
public void display()throws IOException
{
int i;
if(nt==0)
System.out.println("Queue is empty");
else
{
System.out.println("Queue is");
if(f>r)
{
for(i=f;i<=max-1;i++)
System.out.println(+a[i]);
for(i=f;i<=r;i++)
System.out.println(+a[i]);
}
else
{
for(i=f;i<=r;i++)
System.out.println(+a[i]);
}
}
}
public static void main(String args[])throws IOException
{
InputStreamReader isr= new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
int ch,i,x,d,g,n;
System.out.println("Enter the limit");
 n=Integer.parseInt(br.readLine());
cqueue c=new cqueue(n);
do
{
System.out.println("1.insert\t2.delete\t3.display\t4.exit");
System.out.println("Enter the choice");
String s=br.readLine();
ch=Integer.parseInt(s);
switch(ch)
{
case 1:System.out.println("Enter the element");
x=Integer.parseInt(br.readLine());
c.insert(x);
break;

case 2:
g=c.empty();
if(g==1)
System.out.println("Queue is empty");
else
c.remove();
break;
case 3:
c.display();
break;
case 4:
break;
default:System.out.println("Invalid choice");
}
}
while(ch!=4);
}
}

