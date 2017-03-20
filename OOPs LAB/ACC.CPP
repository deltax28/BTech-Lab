#include<iostream.h>
#include<conio.h>

class acc
{     protected:
	char nm[25],*type,acno[25];
	float x;
      public:
	acc()
	{
		cout<<"\nEnter Account No,Name:";
		cin>>acno>>nm;
	}
};
class savac:public acc
{     protected:
	float bal,min;
      public:
	savac()
	{       cout<<"Enter Bal:";
		cin>>bal;
		type="Savings";
		min=500;
		cbal();
	}
	void deposit()
	{
		cout<<"Enter Amount";
		cin>>x;
		bal+=x;
		showbal();
	}
	void withdraw()
	{       cout<<"Enter Withdraw amount:";
		cin>>x;
		if((bal-x)<min)
		{	cout<<"Low Balance:";
		}
		bal-=x;
		showbal();
	}
	void interest()
	{ 	float intr;
		int t;
		cout<<"Enter time period(in years):";
		cin>>t;
		intr=(bal*12.0*t)/100;
		cout<<"Interest="<<intr<<"\nBalance="<<bal+intr<<endl;
	}
	void cbal()
	{	if(bal<min)
			cout<<"\nLow Balance";
	   //	else showbal();
	}
	void showbal()
	{	cout<<"\nBalance="<<bal;
	}
	void disp()
	{	cout<<acno<<"\t"<<type<<"\t\t"<<nm<<"\t"<<bal;
	}
};
class curac:public acc
{     protected:
	float bal,min;
      public:
	curac()
	{       cout<<"Enter Bal:";
		cin>>bal;
		type="Current";
		min=500;
		cbal();
	}
	void deposit()
	{
		cout<<"\nEnter Amount";
		cin>>x;
		bal+=x;
		showbal();
	}
	void withdraw()
	{       cout<<"Enter Withdraw amount:";
		cin>>x;
		if((bal-x)<min)
		{	cout<<"\nLow Balance:";
		}
		bal-=x;
		showbal();
	}
	void interest()
	{ 	float intr;
		int t;
		cout<<"Enter time period(in years):";
		cin>>t;
		intr=(bal*13.0*t)/100;
		cout<<"Interest="<<intr<<"\nBalance="<<bal+intr<<endl;
	}
	void cbal()
	{	if(bal<min)
			cout<<"\nLow Balance";
	   //	else	showbal();
	}
	void showbal()
	{	cout<<"\nBalance="<<bal;
	}
	void disp()
	{	cout<<acno<<"\t"<<type<<"\t\t"<<nm<<"\t"<<bal;
	}

};

void main()
{
	clrscr();
	int ch;
	cout<<"Enter Savings Account Details:";
	savac a;
	cout<<"\nEnter Current Account Details:";
	curac b;
	clrscr();
	do
	{       cout<<"\n1.DEPOSIT\n2.WITHDRAW\n3.INTEREST\n4.SHOW DETAILS\n5.EXIT\n";
		cout<<"Enter your choice:";
		cin>>ch;
		switch(ch)
		{	case 1:a.deposit(); 	b.deposit();	break;
			case 2:a.withdraw(); 	b.withdraw();	break;
			case 3:a.interest(); 	b.interest(); 	break;
			case 4:cout<<"Acc No\tType\t\tName\tBalance\n";
			a.disp();cout<<endl; 	b.disp(); 	break;
		}
	}while(ch!=5);
     /*	a.disp();
	b.disp(); */
	getch();
}


