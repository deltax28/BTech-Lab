#include<iostream.h>
#include<conio.h>

class emp1
{       public:
	char name[20],desig[20],dept[20];
	long int empid;
	float sal;
	void getdata()
	{	cout<<"\nEnter Name:";
		cin>>name;
		cout<<"Employee ID:";
		cin>>empid;
		cout<<"Designation:";
		cin>>desig;
		cout<<"Enter dept:";
		cin>>dept;
		cout<<"Enter Salary:";
		cin>>sal;
	}
};
class emp2: public emp1
{     public:
       void display()
       {        cout<<endl<<name<<"\t"<<empid<<"\t"<<desig
		<<"\t"<<dept<<"\t"<<sal;
       }
};

void main()
{       clrscr();
	emp2 e[10];
	int n,i;
	cout<<"Enter no of emp:";
	cin>>n;
	for(i=0;i<n;++i)
		e[i].getdata();
	cout<<"\n\t\t\tEmployee Details";
		cout<<"\n\nNAME\tEMP-ID\tDESIGN.\tDEPT.\tSALARY";
	for(i=0;i<n;++i)
		e[i].display();
	getch();
}
