import java.io.*;
class search{
	public void search() throws IOException
	{
		int m,n,j,k;
		InputStreamReader i=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(i);
		int a[]=new int [15];
		System.out.println("Enter a no of elements:");
		n=Integer.parseInt(br.readLine());
		System.out.println("Enter elements:");
		for(j=0;j<n;++j)
			a[j]=Integer.parseInt(br.readLine());
		System.out.println("Enter Search Key");
		k=Integer.parseInt(br.readLine());
		for(j=0;j<n;++j)
			if(a[j]==k)
				break;
		if(j==n)
			System.out.println("Not Found");
		else
			System.out.println("Found at position"+(j+1));
	}
}
class Linear{
	public static void main(String arg[]) throws IOException 
	{	search s=new search();
		s.search();
	}
}