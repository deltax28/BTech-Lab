//large-FN OVERLOADING
#include<iostream.h>
#include<conio.h>
class no
{    /* int a,b;
	float c,d;
	double e,f;*/
      public:
	int large(int,int);
	float large(float,float);
	double large(double,double);
	void getdata(void);
}a;

int no::large(int a,int b)
{       if(a>b)
	  return a;
	else return b;
}
float no::large(float a,float b)
{       if(a>b)
	  return a;
	else return b;
}
double no::large(double a,double b)
{       if(a>b)
	  return a;
	else return b;
}
void no::getdata(void)
{	int p,q;
	float r,s;
	double t,u;
	cout<<"Enter two int no:";
	cin>>p>>q;
	cout<<"Enter two float no:";
	cin>>r>>s;
	cout<<"Enter two double no:";
	cin>>t>>u;
	cout<<"\nLarge of "<<p<<"&"<<q<<" is "<<large(p,q);
	cout<<"\nLarge of "<<r<<"&"<<s<<" is "<<large(r,s);
	cout<<"\nLarge of "<<t<<"&"<<u<<" is "<<large(t,u);

}
void main()
{
	clrscr();
	a.getdata();
	getch();
}

