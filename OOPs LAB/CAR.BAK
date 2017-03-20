#include<iostream.h>
#include<conio.h>

class a
{     protected:
	char name[25],model[25],regno[25];
	int yr;
};
class b:public a
{
	public:
		void read()
		{
			cout<<"\nName:";
			cin>>name;
			cout<<"Model:" ;
			cin>>model;
			cout<<"Regno:";
			cin>>regno;
			cout<<"Mfg Yr";
			cin>>yr;
		}
};
class car:public b
{
	public:
		void disp()
		{
			cout<<name<<"\t"<<model<<"\t"<<regno<<"\t"<<yr<<endl;
		}
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
	cout<<"NAME\tMODEL\tREGISTER NO\tMFG YR\n\n";
	for(i=0;i<n;++i)
	  c[i].disp();

	getch();
}