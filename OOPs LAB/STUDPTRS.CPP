//Student Details Pointers

#include<iostream.h>
#include<conio.h>
#include<stdio.h>

struct stud
{
	char name[50];
	int rno;
	char colg[50];
	char brn[20];
	int sem;
	int poyr;
}s[10],*p;
void main()
{
	clrscr();
	int n,i;
	cout<<"Enter no of students:";
	cin>>n;
	cout<<"Enter Student details:\n";
	for(p=s;p<(s+n);++p)
	{
		cout<<"\nName:";
		gets(p->name);
	     //	cout<<p->nm;
		cout<<"Roll No:";
		cin>>p->rno;
		cout<<"College:";
		cin>>p->colg;
		cout<<"Branch:";
		cin>>p->brn;
		cout<<"Semester:";
		cin>>p->sem;
		cout<<"Pass out Year:";
		cin>>p->poyr;
	}
	cout<<"\n\n\t\t\t.......STUDENT DETAILS........\n\n\n";
	cout<<"NAME\tROLL NO\tCOLLEGE\tBRANCH\tSEM\tPASS YR\n";
	for(p=s;p<(s+n);++p)
	  cout<<p->name<<"\t"<<p->rno<<"\t"<<p->colg<<"\t"<<p->brn
	      <<"\t"<<p->sem<<"\t"<<p->poyr<<"\n";
	getch();
}


