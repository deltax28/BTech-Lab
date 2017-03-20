#include<fstream.h>
#include<conio.h>

void main()
{
	clrscr();
	char *txt;
	ifstream in("Test.txt");
	in>>txt;
	cout<<"File content:"<<txt;
	in.close();
	getch();
}