import java.io.*;
class ins
{
	int a[]=new int[100],n,i,in,out;
	public void inssort()throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
		System.out.print("Enter the limit");
		n=Integer.parseInt(br.readLine());
		System.out.println("Enter Array Elements");
		for(i=0;i<n;i++)
		a[i]=Integer.parseInt(br.readLine());
		for(out=1;out<n;out++)
		{
			int temp;
			temp=a[out];
			in=out;
			while(in>0&&a[in-1]>=temp)
			{
				a[in]=a[in-1];
				--in;
			}
			a[in]=temp;
		}
		System.out.println("Sorted array");
		for(i=0;i<n;i++)
		System.out.println(a[i]);
	}
	public static void main(String arg[])throws IOException
	{
	ins a=new ins();
	a.inssort();
	}
}

