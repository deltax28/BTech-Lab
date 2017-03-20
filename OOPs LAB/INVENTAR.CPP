//Inventory Mgmt Sys
#include<iostream.h>
#include<conio.h>
class shop
{
	char name[15][20];
	float price[15],stock[20],bal[20],sale[20],totpr[20],s;
      public:
	void getdata(void);
	void display(void);
};
void shop::getdata(void)
{
	cout<<"How many entry u want to make:";
	cin>>s;
	for(int i=0;i<s;i++)
	{
	cout<<"\n\n Enter the product name:";
	cin>>name[i];
	cout<<"Enter price:";
	cin>>price[i];
	cout<<"Enter stock";
	cin>>stock[i];
	cout<<"Enter sale:";
	cin>>sale[i];
	}
}
void shop::display(void)
{
	clrscr();
	cout<<"\t\t\tSTOCK DATABASE\n\n\n";
	cout<<"Product\tPrice(Rs)\tStock\tSale\tBalance no\tTotal price(Rs)\n";
	for(int i=0;i<s;i++)
	{
	bal[i]=stock[i]-sale[i];
	totpr[i]=price[i]*sale[i];
	cout<<name[i]<<"\t"<<price[i]<<"\t\t"<<stock[i]<<"\t"<<sale[i]
	<<"\t"<<bal[i]<<"\t\t"<<totpr[i]<<"\n";
	}
}
void main()
{
	clrscr();
	shop sh;
	sh.getdata();
	sh.display();
	getch();
}