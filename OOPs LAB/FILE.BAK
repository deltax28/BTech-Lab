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
    //	txt="Default";
	ifstream in("Test.txt");
	in>>txt;
	cout<<"File content:"<<txt;
	in.close();
	getch();
}
