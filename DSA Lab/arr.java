import java.io.*;
class arr
{
	int a[]=new int[100],n,i,out,in;
	public void setsort()throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
		System.out.print("Enter the limit:");
		n=Integer.parseInt(br.readLine());
		System.out.println("Enter Array Elements:");
		for(i=0;i<n;i++)
		a[i]=Integer.parseInt(br.readLine());
		for(out=n-1;out>0;out--)
			for(in=0;in<out;in++)
				if(a[in]>a[in+1])
				{
				int temp;
				temp=a[in];
				a[in]=a[in+1];
				a[in+1]=temp;
				}
		System.out.println("Sorted Array:");
		for(i=0;i<n;i++)
		System.out.println(a[i]);
	}
	public static void main(String arg[])throws IOException
	{
		arr ar=new arr();
		ar.setsort();
	}
}

