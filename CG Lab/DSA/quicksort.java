import java.io.*;
class quick
{ 
public void sort(int a[],int low,int n)throws IOException
{
int l=low,h=n,i;
if(l>=n)
return;
int mid=a[(l+h)/2];
while(l<h)
{
while((l<h)&&(a[l]<mid))
l++;
while((l<h)&&(a[h]>mid))
h--;
if(l<h)
{
int t=a[l];
a[l]=a[h];
a[h]=t;
}
}
if(h<l)
{
int t=h;
h=l;
l=t;
}
sort(a,low,l);
sort(a,l==low?l+1:l,n);
}
}
class quicksort
{
public static void main(String args[])throws IOException
{
quick ar=new quick();
int n,i;
int [] a=new int[50];
InputStreamReader isr= new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
System.out.println("Enter the limit");
String s1=br.readLine();
n=Integer.parseInt(s1);
System.out.println("Enter the nos");
for(i=0;i<n;i++)
{
String s=br.readLine();
a[i]=Integer.parseInt(s);
}
ar.sort(a,0,n-1);
System.out.println("sorted array");
for(i=0;i<n;i++)
System.out.println(+a[i]);
}
}