//Complex No addition
#include<iostream.h>
#include<conio.h>
#include<math.h>
class complex
{
	int real,image;
      public:
	complex();
	complex(int,int);
	complex operator+(complex c2);
	void display();
};
complex::complex()
{
	real=0;
	image=0;
}
complex::complex(int x,int y)
{
	real=x;
	image=y;
}
complex complex::operator+(complex c2)
{
	complex temp(0,0);
	temp.real=real+c2.real;
	temp.image=image+c2.image;
	return(temp);
}
void complex::display()
{
	cout<<real<<"+i"<<image;
}
void main()
{
	clrscr();
	complex c3;
	int x,y,a,b;
	cout<<"Enter (Re)c1:";
	cin>>a;
	cout<<"Enter (Im)c1:";
	cin>>b;
	cout<<"Enter (Re)c2:";
	cin>>x;
	cout<<"Enter (Im)c2:";
	cin>>y;
	complex c1(a,b),c2(x,y);
	c3=c1.operator+(c2);

	cout<<"\nc1=";
	c1.display();
	cout<<"\nc2=";
	c2.display();
	cout<<"\nResult:";
	cout<<"c3=";
	c3.display();
	getch();
}
