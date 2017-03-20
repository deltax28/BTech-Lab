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
		cout<<"Enter Book Details";
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
	{	cout<<"CODE\tTITLE\tAUTHOR\tPRICE\n";
		cout<<code<<"\t"<<title<<"\t"<<author<<"\t"<< pri;
	}
};
void main()
{
	clrscr();
	book3 b;
	b.accept1();
	b.accept2();
	b.display();
	getch();
}


