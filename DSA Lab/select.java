import java.io.*;
class select
{
	int a[]=new int[100],n,i,min,in,out;
	public void selectsort()throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
		System.out.print("Enter the limit:");
		n=Integer.parseInt(br.readLine());
		System.out.println("Enter Array Elements");
		for(i=0;i<n;i++)
		a[i]=Integer.parseInt(br.readLine());
		for(out=0;out<n-1;out++)
		{
			min=out;
			for(in=out+1;in<n;in++)
				if(a[min]>a[in])
				min=in;
			int temp;
			temp=a[out];
			a[out]=a[min];
			a[min]=temp;
		}
		System.out.println("sorted array");
		for(i=0;i<n;i++)
			System.out.println(a[i]);
	}
	public static void main(String arg[])throws IOException
	{
		select sl=new select();
		sl.selectsort();
	}
}
