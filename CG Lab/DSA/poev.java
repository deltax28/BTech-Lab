import java.io.*;
class poev
 {
 public static void main(String[] args) throws IOException
   {
   post p=new post();
   p.read();
   p.evaluate();
   }
 }

class post
 {
  public int i,l,n1,n2,ans,top=0;
  public String input;
  public char ch;
  public int[] a=new int[100];
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  public void read()throws IOException
   {
   System.out.print("enter the postfix: ");
   input=br.readLine();
   l=input.length();
   }
 public int pop() throws IOException
   {
   return(a[top--]);
   }
 public void evaluate() throws IOException
   {
   for(i=0;i<l;i++)
    {
    if(input=="") {System.out.println("no input..");break;}
    else
      {
       ch=input.charAt(i);
       if(ch>='0'&&ch<='9')
        {
        switch(ch)
           {
             case '0':a[++top]=0;break;
             case '1':a[++top]=1;break;
             case '2':a[++top]=2;break;
             case '3':a[++top]=3;break;
             case '4':a[++top]=4;break;
             case '5':a[++top]=5;break;
             case '6':a[++top]=6;break;
             case '7':a[++top]=7;break;
             case '8':a[++top]=8;break;
             case '9':a[++top]=9;break;
           }
        }
      else
        {
         n2=pop();
           n1=pop();
        switch(ch)
           {
           case '+':ans=n1+n2;break;
           case '-':ans=n1-n2;break;
           case '*':ans=n1*n2;break;
           case '/':ans=n1/n2;break;
           default:ans=0;
           }
        a[++top]=ans;
        }
      }
    
    }
   ans=pop();
    System.out.println("the answer is  "+ans);
   }
 }



