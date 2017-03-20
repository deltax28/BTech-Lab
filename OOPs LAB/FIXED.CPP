//Fixed
#include<iostream.h>
#include<conio.h>

class fixed
{
	long int pamnt;
	int yrs;
	float rate;
	float returnvalue;
      public:
	fixed(){}
	fixed(long int p,int y,float r=0.12);
	fixed(long int p,int y,int r);
	void display();
};
fixed::fixed(long int p,int y,float r)
{
	pamnt=p;
	yrs=y;
	rate=r;
	returnvalue=pamnt;
	for(int i=1;i<=y;i++)
	returnvalue*=(1+r);
}
fixed::fixed(long int p,int y,int r)
{
	pamnt=p;
	yrs=y;
	rate=r;
	returnvalue=pamnt;
	for(int i=1;i<=y;i++)
	returnvalue*=(1+(float(r)/100));
}
void fixed::display()
{
	cout<<"\nPrincipal amnt="<<pamnt<<" Return value="<<returnvalue;
}
void main()
{
	clrscr();
	fixed f1,f2,f3;
	long int p;
	int y,R;
	float r;
	cout<<"\nEnter Amnt,period and rate:";
	cin>>p>>y>>R;
	f1=fixed(p,y,R);
	cout<<"Enter Amnt period rate in percentage:";
	cin>>p>>y>>r;
	f2=fixed(p,y,r);
	cout<<"Enter amnt and period:";
	cin>>p>>y;
	f3=fixed(p,y);
	cout<<"\nDeposit 1:";
	f1.display();
	cout<<"\nDeposit 2:";
	f2.display();
	cout<<"\nDeposit 3:";
	f3.display();
	getch();
}
