#include<iostream.h>
#include<conio.h>
#include<string.h>

class str
{	float no;
	public:
	str()
	{}
	void getdata()
	{cout<<"enter ano:";
	cin>>no;
	}
	void putdata()
	{	cout<<"ans is"<<no;
	}
	str operator +(str);
	str operator *(str);
	str operator -(str);
	str operator /(str);

};
str str ::operator +(str a)
{
 str temp;
 temp.no=no+a.no;
 return temp;
}
str str ::operator *(str a)
{
 str temp;
 temp.no=no*a.no;
 return temp;
}
str str ::operator -(str a)
{
 str temp;
 temp.no=no-a.no;
 return temp;
}
str str ::operator /(str a)
{
 str temp;
 temp.no=no/a.no;
 return temp;
}

void main()
{
	clrscr();
	str a,b,c;
	int ch;
	a.getdata();
	b.getdata();
	cout<<"1.Addn\n2.mulb\n3.sub\n4.div\nEnter ur choice:";
	cin>>ch;
	switch (ch)
	{
		case 1: c=a+b;
		cout<<"addn of 2 nos";
		c.putdata();
		break;
		case 2: c=a*b;
		cout<<"mul of 2 nos";
		c.putdata();
		break;
		case 3: c=a-b;
		cout<<"subn of 2 nos";
		c.putdata();
		break;
		case 4: c=a/b;
		cout<<"divn of 2 nos";
		c.putdata();
		break;
	}
	getch();
}