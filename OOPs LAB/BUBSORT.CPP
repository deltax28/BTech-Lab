//Bubble Sort
#include<iostream.h>
#include<conio.h>

void main()
{
	clrscr();
	int a[50],n,i,j,t;
	cout<<"Enter no of elements:";
	cin>>n;
	cout<<"Enter elements";
	for(i=0;i<n;++i)
		cin>>a[i];
	for(i=0;i<n;++i)
	{	for(j=0;j<n-i;j++)
		{
			if(a[j]>a[j+1])
			{ 	t=a[j];
				a[j]=a[j+1];
				a[j+1]=t;
			}
		}
	}
	cout<<"Sorted array is:";
	for(i=0;i<n;++i)
		cout<<a[i]<<" ";
	getch();
}