//Area fn overloading

#include<iostream.h>
#include<conio.h>

class shape
{
	int rl,rb,ra;
	float sa,ss;
	double ta,tb,th;
      public:
	void area(float);
	void area(int,int);
	void area(double,double);
	void disp();
};

void shape::area(float z)
{	ss=z;
	sa=ss*ss;
}
void shape::area(int x,int y)
{
	rl=x;
	rb=y;
	ra=rl*rb;
}
void shape::area(double d,double e)
{
	tb=d;
	th=e;
	ta=0.5*tb*th;
}
void shape::disp()
{
	cout<<"\nArea of a square="<<sa;
	cout<<"\nArea of rectangle="<<ra;
	cout<<"\nArea of triangle="<<ta;
}

void main()
{
	clrscr();
	float n;
	int m,o;
	double p,l;
	shape sh;
	cout<<"Enter the side of square:";
	cin>>n;
	cout<<"Enter sides of rectangle:";
	cin>>m>>o;
	cout<<"Enter base and height of triangle";
	cin>>p>>l;
	sh.area(n);
	sh.area(m,o);
	sh.area(p,l);
	sh.disp();
	getch();
}
