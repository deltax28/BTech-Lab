import java.io.*;
class Fibonacci{
	public static void main(String arg[]) throws IOException
	{
		int n;
		InputStreamReader i=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(i);
		System.out.println("Enter a no:");
		n=Integer.parseInt(br.readLine());
		System.out.println("Fibonacci Series is:");
		int f1=0,f2=1,f3;
		System.out.println(f1);
		System.out.println(f2);
		for (int x=3;x<=n;++x){
			f3=f1+f2;
			System.out.println(f3);
			f1=f2;
			f2=f3;
		}
	}
}