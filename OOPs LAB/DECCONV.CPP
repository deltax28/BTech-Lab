#include<iostream.h>
#include<conio.h>


void main()
{	clrscr();
	int n,ch,a[25],k,i=0;
	char hex='A';
	cout<<"Enter a no:";
	cin>>n;
	cout<<"1.Binary\n2.Ocatl\n3.Hexadecimal\nEnter Your Choice:";
	cin>>ch;
	switch(ch)
	{
		case 1:while(n>0)
			{
				a[i]=n%2;
				n/=2;
				i++;
			}

			cout<<"Binary Equivalent=";
			for(i=i-1;i>=0;i--)
				cout<<a[i];
			break;
		case 2:while(n>0)
			{
				a[i]=n%8;
				n/=8;
				i++;
			}

			cout<<"Octal Equivalent=";
			for(i=i-1;i>=0;i--)
				cout<<a[i];
			break;
		case 3:while(n>0)
			{
				a[i]=n%16;
				n/=16;
				i++;
			}

			cout<<"Hexadecimal Equivalent:";
			for(i=i-1;i>=0;i--)
			{
				if(a[i]>=10)
				{	hex+=(a[i]-10);
					cout<<hex;
				}
				else
				cout<<a[i];
			}
			break;
		default:cout<<"Invalid Option";
			break;
	}
	getch();
}