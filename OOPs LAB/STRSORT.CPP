#include<iostream.h>
#include<conio.h>
#include<string.h>

void main()
{
	char str[10][20],temp[20];
	int i,j;
	clrscr();
	cout<<"Enter the strings:\n";
	for(i=0;i<10;++i)
		cin>>str[i];
     //	clrscr();
     /*	cout<<"The strings are:";
	for(i=0;i<10;++i)
		cout<<str[i]<<endl;
	//#########Sorting###########//*/
	for(i=0;i<10;i++)
	{
		for(j=0;j<(10-1)-i;++j)
		{
			if(strcmp(str[j],str[j+1])>0)
			{    	strcpy(temp,str[j]);
				strcpy(str[j],str[j+1]);
				strcpy(str[j+1],temp);
			}
		}
	}
	cout<<"\nSorted strings are:\n";
	for(i=0;i<10;++i)
		cout<<str[i]<<endl;
	getch();
}
