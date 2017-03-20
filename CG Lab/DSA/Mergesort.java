import java.io.*;
class merge
{
public static void main(String args[])throws IOException
{
int lim,i;
int array[]=new int [100];
System.out.println("Enter the limit");
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
lim=Integer.parseInt(br.readLine());
System.out.println("Enter the elements");
for(i=0;i<lim;i++)
{
array[i]=Integer.parseInt(br.readLine());
}
mergesort(array,0,lim-1);
System.out.print("AFTER SORTING");
for(i=0;i<lim;i++ )
{
System.out.print(array[i]+"\n");
System.out.print();
}
}
public static void mergesort(int array[],int lo,int n) throws IOException
{
int low=lo;
int high=n;
if(low>=high)
{
return
}
int middle=(low+middle)/2;
mergesort(array,low,middle);
mergesort(array,middle+1;high);
int endlow=middle;
int starthigh=middle+1;
while((lo<=endlow)&&(starthigh<=high))
{
if(array[low]<array[straight])
{
low++;
]
else
{
int Temp=array(starthigh);
for(int k=starthigh-1;k>=low;k--)
{
array[k+1]=array[k];
}
array[low]=Temp;
low++;
endlow++;
starthigh++;
}}}}