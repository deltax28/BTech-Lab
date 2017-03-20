#include<iostream.h>
#include<conio.h>
#include<stdlib.h>

void main()
{       clrscr();
	int a[20][20],b[20][20],c[20][20],r1,c1,r2,c2,i,j,k;
	cout<<"Enter order of A:";
	cin>>r1>>c1;
	cout<<"Enter order of B:";
	cin>>r2>>c2;
	if(r2!=c1)
	{ cout<<"Not Possible";
	 exit(0);}
	cout<<"Enter elements of A:\n";
	for(i=0;i<r1;++i)
		for(j=0;j<c1;++j)
			cin>>a[i][j];
	cout<<"Enter elements of B:\n";
	for(i=0;i<r2;++i)
		for(j=0;j<c2;++j)
			cin>>b[i][j];
	for(i=0;i<r1;++i)
	{       for(j=0;j<c2;++j)
		{       c[i][j]=0;
			for(int k=0;k<c1;k++)
				c[i][j]+=(a[i][k]*b[k][j]);
		}

	}
	cout<<"Product is:\n";
	for(i=0;i<r1;++i)
	{	for(j=0;j<c2;++j)
			cout<<c[i][j]<<" ";
		cout<<endl;
	}
	getch();
}