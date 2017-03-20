#include<iostream.h>
#include<conio.h>
class book
{
	public:
	int code;
	char title[20],author[20],pub[20];
	float pri;
	void read()
	{
		cout<<"Enter Book Details:";
		cout<<"\nEnter Code,Title,Author,Publisher,Price";
		cin>>code>>title>>author>>pub>>pri;
	}
};
class engbuk:public book
{     public:
	int nopg,stock;
	void read2()
	{
		cout<<"Enter No of Pages & Stock:";
		cin>>nopg>>stock;
	}
	void display()
	{
		cout<<"ENGG\t"<<code<<"\t"<<title<<"\t"<<author<<"\t"
		<<pub<<"\t\t"<<pri<<"\t"<<nopg<<"\t"<<stock<<endl;
	}
};
class novel:public book
{     public:
	int nopg,stock;
	void read2()
	{
		cout<<"Enter No of Pages & Stock:";
		cin>>nopg>>stock;
	}
	void display()
	{	cout<<"NOVEL\t"<<code<<"\t"<<title<<"\t"<<author<<"\t"
		<<pub<<"\t\t"<< pri<<"\t"<<nopg<<"\t"<<stock<<endl;
	}
};
void main()
{
	clrscr();
	engbuk e;
	novel n;
	e.read();
	e.read2();
	n.read();
	n.read2();
	cout<<"\n\nTYPE\tCODE\tTITLE\tAUTHOR\tPUBLISHER\tPRICE\tNOPG\tSTOCK\n";
	e.display();
	n.display();
	getch();
}


