//CUBE-FN OVERLOADING
#include<iostream.h>
#include<conio.h>
class no
{
      public:
	int cube(int);
	float cube(float);
	double cube(double);
}s;

int no::cube(int p)
{	return (p*p*p);
}
float no::cube(float p)
{	return (p*p*p);
}
double no::cube(double p)
{	return (p*p*p);
}
void main()
{
	clrscr();
	int x,ch;
	float y;
	double z;
	cout<<"1.INT\n2.FLOAT\n3.DOUBLE\nEnter your choice:";
	cin>>ch;
	switch(ch)
	{
		case 1: cout<<"Enter no:"; cin>>x;
			cout<<s.cube(x);
			break;
		case 2: cout<<"Enter a no:";
			cin>>y;
			cout<<s.cube(y);
			break;
		case 3: cout<<"Enter a no:";
			cin>>z;
			cout<<s.cube(z);
			break;
		default:cout<<"Invalid Operation";
			break;
	}
	getch();
}

