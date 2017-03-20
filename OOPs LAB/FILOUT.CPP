#include<fstream.h>
#include<conio.h>

void main()
{
	clrscr();
	char *txt;
	ofstream out("Test.txt");
	cout<<"Enter anything:";
	cin>>txt;
	out<<txt;
	out.close();
	getch();
}