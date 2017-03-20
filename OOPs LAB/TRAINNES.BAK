//TRAIN NEST
#include<iostream.h>
#include<conio.h>

class a
{     public:
	char nm[25];
	int no;
	void read1()
	{
		cout<<"\nTrain No:";
		cin>>no;
		cout<<"Name:" ;
		cin>>nm;
	}
	void disp1()
	{	cout<<no<<"\t\t"<<nm;}
};
class b
{       public:
	a x;
	char src[25],dst[25];
	int yr;
	void read2()
	{    	x.read1();
		cout<<"Source:";
		cin>>src;
		cout<<"Destination:";
		cin>>dst;
	}
	void disp2()
	{       x.disp1();
		cout<<"\t"<<src<<"\t"<<dst<<endl;
	}
};
class train
{	public:
	b y;
	void read()
	{	y.read2();}
	void disp()
	{	y.disp2();}

};

void main()
{       clrscr();
	int n;
	train c[10];
	cout<<"Enter no of trains:";
	cin>>n;
	cout<<"Enter Train Details:";
	for(int i=0;i<n;++i)
		c[i].read();

	cout<<"\t\t\t.....Train Details.....\n";
	cout<<"TRAIN NO\tNAME\tSOURCE\tDESTINATION\n\n";
	for(i=0;i<n;++i)
	  c[i].disp();

	getch();
}