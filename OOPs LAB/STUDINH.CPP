#include<iostream.h>
#include<conio.h>

class stud
{ public:
	char nm[50];
	int rno;
	char colg[50];
	char brn[20];
	int sem;
	int poyr;

};

class stud2 : public stud
{
	public:
	void read()
	{
	cout<<"\nName:";
	cin>>nm;
	cout<<"Roll No:";
	cin>>rno;
	cout<<"College:";
	cin>>colg;
	cout<<"Branch:";
	cin>>brn;
	cout<<"Semester:";
	cin>>sem;
	cout<<"Pass out Year:";
	cin>>poyr;
	}
};
class stud3:public stud2
{     public:
	void disp()
	{	cout<<nm<<"\t"<<rno<<"\t"<<colg<<"\t"<<brn
	    <<"\t"<<sem<<"\t"<<poyr<<"\n";
	}
};

void main()
{
	clrscr();
	stud3 s[10];
	int n,i;
	cout<<"Enter no of students:";
	cin>>n;
	cout<<"Enter Student details:\n";
	for(i=0;i<n;++i)
		s[i].read();
	cout<<"\n\n\t\t\t.......STUDENT DETAILS........\n\n\n";
	cout<<"NAME\tROLL NO\tCOLLEGE\tBRANCH\tSEM\tPASS YR\n";
	for(i=0;i<n;++i)
		s[i].disp();
	getch();
}


