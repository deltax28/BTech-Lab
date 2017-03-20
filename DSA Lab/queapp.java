import java.io.*;
class queue{
	private int maxsize;
	private int[]quearray;
	private int front;
	private int rear;
	private int nitems;
	public queue(int s){
		maxsize=s;
		quearray=new int [maxsize];
		front=0;
		rear=-1;
		nitems=0;
	}
	public void insert(int j)
	{ 	if (rear==maxsize-1)
			rear=-1;
		quearray[++rear]=j;
		nitems++;
	}
	public int remove()
	{	int temp=quearray[front++];
		if(front==maxsize)
			front=0;
		nitems--;
		return temp;
	}
	public int peekfront()
	{	return quearray[front];
	}
	public boolean isempty(){
		return(nitems==0);	}
	public boolean isfull(){
		return(nitems==maxsize);	}
	public int size()
	{return nitems;}
	public void display()
	{	System.out.println("Elements left are:");
		for(int i=front;i<=rear;i++)
			System.out.println(quearray[i]);
	}
}

class queapp
{	
	public static void main(String args[]) throws IOException
	{	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int ch,i,n,d,item,size;
		System.out.println("Enter Max size of Queue:");
		size=Integer.parseInt(br.readLine());
		queue thequeue = new queue(size);
		
		do{
			System.out.println("\n1.Insert\n2.Delete\n3.Display\n4.Exit");
			System.out.println("Enter Your Choice:");
			ch=Integer.parseInt(br.readLine());
			switch(ch)
			{case 1:	if(!thequeue.isfull()){
				System.out.println("Enter the no of elements to be inserted:");
				n=Integer.parseInt(br.readLine());
				System.out.println("Enter elements :");
				for(i=0;i<n;i++){
					if(!thequeue.isfull()){
						item=Integer.parseInt(br.readLine());
						thequeue.insert(item);}
					else	break;
					}}
				if(thequeue.isfull())
					System.out.println("Overflow");
				break;
			case 2: 	if(!thequeue.isempty()){
				System.out.println("Enter the no of elements to be deleted:");
				n=Integer.parseInt(br.readLine());
				for(i=0;i<n;i++){
					if(!thequeue.isempty()) {
						int value=thequeue.remove();
						System.out.print(value+"   " ); }
					else break;
				} }
				if(thequeue.isempty())
					System.out.println("underflow");
				break;
			case 3:thequeue.display();
				break;
			case 4: break;
			default:System.out.println("Invalid Choice ");
			
			}
		}while (ch!=4);
		
	}
}
