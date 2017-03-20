#include<iostream.h>
#include<conio.h>

class no
{     protected:
	int a[10],av,n,s,l;

};
class no2:protected no
{
	public:
	void read();
	void avg();
	void small();
	void large();

};
void no2::read()
{
	cout<<"Enter limit:";
	cin>>n;
	cout<<"Enter nos:";
	for(int i=0;i<n;++i)
	cin>>a[i];
}
void no2::avg()
{       av=0;
	for(int i=0;i<n;++i)
	av+=a[i];
	cout<<"\nAvg="<<av/n;
}
void no2::small()
{
	s=a[0];
	for(int i=0;i<n;++i)
	{	if(a[i]<s)
		  s=a[i];
	}
	cout<<"\nSmallest="<<s;
	}
void no2::large()
{
	l=a[0];
	for(int i=0;i<n;++i)
	{	if(a[i]>l)
		  l=a[i];
	}
	cout<<"\nLargest="<<l;
}

void main()
{
	clrscr();
	no2 x;
	x.read();
	x.avg();
	x.small();
	x.large();
	getch();
}