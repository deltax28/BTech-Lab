#include<iostream.h>
#include<conio.h>

class A
{
      private:
	int a;
      public:
	int reta()
	{	return a;}
	void geta(int x)
	{ a=x;}
};
class B: public A
{
	int b;
      public:
       /*	int retb()
	{ return b;}   */
	void getb(int y)
	{b=y;}
	void sum(void);
};
void B ::sum(void)
{
	cout<<"Sum is:"<<reta()+b;
}

void main()
{       clrscr();
	B obj;
	int p,q;
	cout<<"Enter :";
	cin>>p>>q;
	obj.geta(p);
	obj.getb(q);
	obj.sum();
	getch();
}