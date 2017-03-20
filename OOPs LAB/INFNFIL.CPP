#include<fstream.h>
#include<conio.h>

void main()
{       char *txt;
	clrscr();
	ofstream out;
	out.open("test.txt",ios::out);
	cout<<"Enter any string:";
	cin>>txt;
	out<<txt;
	txt="Default";
	out.close();
	ifstream in;
	in.open("test.txt",ios::in);
	in>>txt;
	cout<<"File content:"<<txt;
	in.close();
	getch();

}