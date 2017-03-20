//CAR DETAILS NESTED CLASS
#include<iostream.h>
#include<conio.h>

class a
{     public:
	char name[25],model[25];
	void read1()
	{
		cout<<"\nName:";
		cin>>name;
		cout<<"Model:" ;
		cin>>model;
	}
	void disp1()
	{	cout<<name<<"\t"<<model;}
};
class b
{       public:
	a x;
	char regno[25];
	int yr;
	void read2()
	{    	x.read1();
		cout<<"Regn no:";
		cin>>regno;
		cout<<"Mfg Yr";
		cin>>yr;
	}
	void disp2()
	{       x.disp1();
		cout<<"\t"<<regno<<"\t"<<yr<<endl;
	}
};
class car
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
	car c[10];
	cout<<"Enter no of cars:";
	cin>>n;
	cout<<"Enter Car Details:";
	for(int i=0;i<n;++i)
		c[i].read();

	cout<<"\t\t\t.....Car Details.....\n";
	cout<<"NAME\tMODEL\tREGN NO\tMFG YR\n\n";
	for(i=0;i<n;++i)
	  c[i].disp();

	getch();
}