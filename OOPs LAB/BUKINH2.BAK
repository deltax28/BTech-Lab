#include<iostream.h>
#include<conio.h>
class book
{
	public:
	int code;
	char title[20];
	char author[20];
	void accept1()
	{
	     //	cout<<"Enter Book Details";
		cout<<"\n Enter Code,Title,Author";
		cin>>code>>title>>author;
	}
};
class book2
{
	public:
	float pri;
	void accept2()
	{cout<<"Enter Price";
	cin>>pri;
	}
};
class  book3: public book,public book2
{
	public:
	void display()
	{
		cout<<endl<<code<<"\t"<<title<<"\t"<<author<<"\t"<< pri;
	}
};
void main()
{
	clrscr();
	book3 b[10];
	int n;
	cout<<"Enter no of books:";
	cin>>n;
	for(int i=0;i<n;++i)
	{
		b[i].accept1();
		b[i].accept2();
	}
	cout<<"CODE\tTITLE\tAUTHOR\tPRICE\n";
	for(i=0;i<n;++i)
		b[i].display();
	getch();
}


