//Student Details
#include<iostream.h>
#include<conio.h>

struct stud
{
	char nm[50];
	int rno;
	char colg[50];
	char brn[20];
	int sem;
	int poyr;
}s[10];
void main()
{
	clrscr();
	int n,i;
	cout<<"Enter no of students:";
	cin>>n;
	cout<<"Enter Student details:\n";
	for(i=0;i<n;++i)
	{
		cout<<"\nName:";
		cin>>s[i].nm;
		cout<<"Roll No:";
		cin>>s[i].rno;
		cout<<"College:";
		cin>>s[i].colg;
		cout<<"Branch:";
		cin>>s[i].brn;
		cout<<"Semester:";
		cin>>s[i].sem;
		cout<<"Pass out Year:";
		cin>>s[i].poyr;
	}
	cout<<"\n\n\t\t\t.......STUDENT DETAILS........\n\n\n";
	cout<<"NAME\tROLL NO\tCOLLEGE\tBRANCH\tSEM\tPASS YR\n";
	for(i=0;i<n;++i)
	  cout<<s[i].nm<<"\t"<<s[i].rno<<"\t"<<s[i].colg<<"\t"<<s[i].brn
	      <<"\t"<<s[i].sem<<"\t"<<s[i].poyr<<"\n";
	getch();
}


