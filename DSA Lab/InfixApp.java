import java.io.*;
class StackX
{
private int maxSize;
private char[] stackArray;
private int top;
public StackX(int s) // constructor
{
maxSize = s;
stackArray = new char[maxSize];
top = -1;
}
public void push(char j) // put item on top of stack
{ stackArray[++top] = j; }
public char pop() // take item from top of stack
{ return stackArray[top--]; }
public char peek() // peek at top of stack
{ return stackArray[top]; }
public boolean isEmpty() // true if stack is empty
{ return (top == -1); }
public int size() // return size
{ return top+1; }
public char peekN(int n) // return item at index n
{ return stackArray[n]; }
public void displayStack(String s)
{
System.out.print(s);
System.out.print("Stack (bottom-->top): ");
for(int j=0; j<size(); j++)
{
System.out.print( peekN(j) );
System.out.print(' ');
}
System.out.println("");
}

}
class InToPost
{
private StackX theStack;
private String input;
private String output = "";

public InToPost(String in)
{
input = in;
int stackSize = input.length();
theStack = new StackX(stackSize);
}


public String doTrans()
{
for(int j=0; j<input.length(); j++)
{
char ch = input.charAt(j);
theStack.displayStack("For "+ch+" ");
switch(ch)
{
case '+':
case '-':
gotOper(ch, 1);
break;
case '*':
case '/':
gotOper(ch, 2);
break;
case '(':
theStack.push(ch);
break;
case ')':
gotParen(ch);
break;
default:
output = output + ch;
break;
}
}
while( !theStack.isEmpty() )
{
theStack.displayStack("While ");
output = output + theStack.pop();
}
theStack.displayStack("End ");
return output;
}

public void gotOper(char opThis, int prec1)
{
while( !theStack.isEmpty() )
{
char opTop = theStack.pop();

if( opTop == '(' )
{
theStack.push(opTop);
break;
}
else
{
int prec2;
if(opTop=='+'|| opTop=='-')
prec2 = 1;
else
prec2 = 2;
if(prec2 < prec1)
{
theStack.push(opTop);
break;
}
else
output = output + opTop;
}
}
theStack.push(opThis);
}

public void gotParen(char ch)
{
while( !theStack.isEmpty() )
{
char chx = theStack.pop();
if( chx == '(' )
break;
else
output = output + chx;
}
}

}

class InfixApp
{

public static void main(String[] args) throws IOException
{
String input, output;
System.out.print("Enter infix: ");
System.out.flush();
input = getString();
InToPost theTrans = new InToPost(input);
output = theTrans.doTrans();
System.out.println("Postfix is " + output + '\n');

}

public static String getString() throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String s = br.readLine();
return s;
}
}
