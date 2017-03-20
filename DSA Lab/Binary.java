import java.io.*;
class find{
	public void find() throws IOException
	{
		InputStreamReader i=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(i);
		int a[]=new int [15];
		int n,j,sk,top,bot,flag=0,mid=0;
		System.out.println("Enter no of elements:");
		n=Integer.parseInt(br.readLine());
		System.out.println("Enter elements:");
		for(j=0;j<n;++j)
			a[j]=Integer.parseInt(br.readLine());
		System.out.println("Enter Search Key");
		sk=Integer.parseInt(br.readLine());
		top=0;
		bot=n-1;
		while(top<=bot){
			mid=(top+bot)/2;
			if(a[mid]==sk){
				flag=1;
				break;
			}
			if(sk>a[mid])
			top=mid+1;
			else
			bot=mid-1;
		}
		if(flag==1)
			System.out.println("Found at position:"+(mid+1));
			
		else
			System.out.println("Not Found");
			
	}
}
class Binary{
	public static void main(String arg[]) throws IOException 
	{	find s=new find();
		s.find();
	}
}