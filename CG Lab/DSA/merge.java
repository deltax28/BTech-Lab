import java.io.*;
 class merge
{
public static void main(String args[])throws IOException
{
int n,i;
int [] a=new int[50];
merge m=new merge();
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
System.out.println("Enter the limit");
String s=br.readLine();
n=Integer.parseInt(s);
System.out.println("Enter the elements");
for(i=0;i<n;i++)
{
String s1=br.readLine();
a[i]=Integer.parseInt(s1);
}
m.sort(a,0,n-1);
System.out.println("Sorted array");
for(i=0;i<n;i++)
{
System.out.println(+a[i]);
}
}
public static void sort(int a[],int lo,int li)throws IOException
{
int low=lo;
int high=li;
if(low>=high)
{
return;
}
int mid=(low+high)/2;
sort(a,low,mid);
sort(a,mid+1,high);
int e=mid;
int s=mid+1;
while((lo<=e)&&(s<=high))
{
if(a[low]<a[s])
{
low++;
}
else
{
int temp=a[s];
for(int k=s-1;k>=low;k--)
{
a[k+1]=a[k];
}
a[low]=temp;
low++;
e++;
s++;
}
}
}
}

