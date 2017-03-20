#include<iostream.h>
#include<conio.h>
class volume1
{
      public:
	float l,b,h,r,c1,c2,c3;
};
class volume2 : private volume1
{
      public:
	void accept();
	void calc();
	void display();
};
void volume2 :: accept()
{
	cout<<"Enter length,breadth,height and radius";
	cin>>l>>b>>h>>r;
}
void volume2:: calc()
{
	c1=(l*l*l);
	c2=(l*b*h);
	c3=(6.28*r*h);
}
void volume2:: display()
{
	cout<<"VOLUME OF CUBE="<<c1;
	cout<<"\nVOLUME OF CUBOID="<<c2;
	cout<<"\nVOLUME OF CYLINDER="<<c3;
}
void main()
{
clrscr();
cout<<"VOLUME OF CUBE,CUBOID AND CYLINDER\n";
volume2 v;
v.accept();
v.calc();
v.display();
getch();
}