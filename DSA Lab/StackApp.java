import java.io.*;
class StackX
{
	private int maxSize; 
	private long[] stackArray;
	private int top; 
	public StackX(int s) 
	{
		maxSize = s; 
		stackArray = new long[maxSize]; 
		top = -1; 
	}
	public void push(long j) 
	{	stackArray[++top] = j;	}
	public long pop() 
	{	return stackArray[top--];}
	public long peek() 	
	{	return stackArray[top];}
	public boolean isEmpty() 
	{	return (top == -1);}

	public boolean isFull() 
	{	return (top == maxSize-1);}
	public void display()
	{	System.out.println("Elements left are:");
		for(int i=0;i<=top;i++)
			System.out.println(stackArray[i]);
	}

}

class StackApp
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
		int ch,n,i,item,size;
		System.out.println("Enter Max size of Stack:");
		size=Integer.parseInt(br.readLine());
		StackX theStack = new StackX(size);
		do
		{	System.out.println("\n1.Push\n2.Pop\n3.Show Value\n4.Exit\n");
			System.out.println("Enter your choice:");
			ch=Integer.parseInt(br.readLine());
			switch(ch)
			{
			case 1:	if(!theStack.isFull()){
				System.out.println("Enter the no of elements to be inserted:");
				n=Integer.parseInt(br.readLine());
				System.out.println("Enter elements :");
				for(i=0;i<n;i++){
					if(!theStack.isFull()){
						item=Integer.parseInt(br.readLine());
						theStack.push(item);}
					else	break;
				}}
				if(theStack.isFull())
					System.out.println("Overflow");
				break;
			case 2: 	if(!theStack.isEmpty()){
				System.out.println("Enter the no of elements to be deleted:");
				n=Integer.parseInt(br.readLine());
				for(i=0;i<n;i++){
					if(!theStack.isEmpty()) {
						long value=theStack.pop();
						System.out.print(value+"   " ); }
					else break;
				} }
				if(theStack.isEmpty())
					System.out.println("underflow");
				break;
			case 3:theStack.display();
				break;
			case 4: break;
			default:System.out.println("Invalid Choice ");
			}
		}while( ch!=4) ;
		
	} 
}
	