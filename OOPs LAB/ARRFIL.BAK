#include<fstream.h>
#include<conio.h>

void main()
{
	clrscr();
	ofstream out;
	out.open("test.dat",ios::out);
	int a[10],b[10],n;
	cout<<"Enter no of elements:";
	cin>>n;
	for(int i=0;i<n;++i)
	{	cin>>a[i];
	       out.write((char *)&a[i],sizeof(a[i]));
	}
	out.close();

	ifstream in;
	cout<<"\nFile Content:";
	in.open("test.dat",ios::in);
	for(i=0;i<n;++i)
	{      	in.read((char *)&b[i],sizeof(b[i]));
		cout<<b[i]<<" ";
	}
	in.close();
	getch();
}
