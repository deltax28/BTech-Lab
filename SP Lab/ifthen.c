#include<stdio.h>
#include<string.h>
void main()
{
int cur,j,flag=0,i,in,n,nf,f[3],ni,tran[50][50];
char ip[10],str[20];
tran[50][50]=-1;
in=0;
n=11;
ni=8;

f[0]=2;
f[1]=6;
f[2]=10;

ip[0]='i';
ip[1]='f';
ip[2]='t';
ip[3]='h';
ip[4]='e';
ip[5]='n';
ip[6]='l';
ip[7]='s';

tran[0][0]=1;
tran[0][2]=3;
tran[0][4]=7;
tran[1][1]=2;
tran[3][3]=4;
tran[4][4]=5;
tran[5][5]=6;
tran[7][6]=8;
tran[8][7]=9;
tran[9][4]=10;

printf("\nEnter string");
gets(str);
cur=in;
for(i=0;i<strlen(str);i++)
{
switch(str[i])
{
case 'i': 	n=0;
          	break;
case 'f': 	n=1;
		break;
case 't':	n=2;
		break;
case 'h':	n=3;
		break;
case 'e':	n=4;
		break;
case 'n':	n=5;
		break;
case 'l':	n=6;
		break;
case 's':	n=7;
		break;
}

cur=tran[cur][n];
}
for(j=0;j<3;j++)
{
if(cur==f[j])
{
flag=1;
}
}
if(flag==1)
printf("\n String accepted");
else printf("\n String rejected");
}
