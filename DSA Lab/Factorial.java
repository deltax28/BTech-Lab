import java.io.*;
class Factorial{
	public static void main(String arg[]) throws IOException
	{
		int n;
		InputStreamReader i=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(i);
		System.out.println("Enter a no:");
		n=Integer.parseInt(br.readLine());
		int result=1;
		while(n>0){
			result=result*n;
			n--;
		}
		System.out.println("Factorial of given no is "+result);
	}
}