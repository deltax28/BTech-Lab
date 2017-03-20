//Student Details Class
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
	void read();
	void disp();
}s[10];

void stud::read()
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

void stud::disp()
{	cout<<nm<<"\t"<<rno<<"\t"<<colg<<"\t"<<brn
	    <<"\t"<<sem<<"\t"<<poyr<<"\n";
}
void main()
{
	clrscr();
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


