import java.io.*;
class Stackx
{
	private int maxsize;
	private int[] Stackarray;
	private int top;
	public Stackx(int size)
	{
		maxsize=size;
		Stackarray=new int[maxsize];
		top=-1;
	}
	public void push(int j)
	{
		Stackarray[++top]=j;
	}
	public int pop()
	{
		return Stackarray[top--];
	}
	public boolean Isempty()
	{
		return(top==-1);
	}
}
class parsepost
{
	private Stackx thestack;
	private String input;
	public parsepost(String s)
	{
		input=s;
	}
	public int doparse()
	{
		thestack=new Stackx(20);
		char ch;
		int j,num1,num2,interans;
		for(j=0;j<input.length();j++)
		{
			ch=input.charAt(j);
			if(ch>='0'&&ch<='9')
				thestack.push((int)(ch-'0'));
			else 
			{
				num2=thestack.pop();
				num1=thestack.pop();
				switch(ch)
				{
					case '+':
							interans=num1+num2;
							break;
					case '-':
							interans=num1-num2;
							break;
					case '*':
							interans=num1*num2;
							break;
					case'/':
							interans=num1/num2;
							break;
					default:
							interans=0;
				}
				thestack.push(interans);
			}
		}
		interans=thestack.pop();
		return interans;
	}
}
class postfixApp
{
	public static void main(String arg[])throws IOException
	{
		String input;
		int output;
		System.out.println("Enter postfix:");
		System.out.flush();
		InputStreamReader z=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(z);
		String s=br.readLine();
		parsepost aparser=new parsepost(s);
		output=aparser.doparse();
		System.out.println("Evaluates to"+output);
	}
}