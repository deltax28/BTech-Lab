#include<fstream.h>
#include<conio.h>

class emp
{       public:
	char name[20],desig[20],dept[20];
	long int empid;
	float sal;
	void getdata()
	{	cout<<"\nEnter Name:";
		cin>>name;
		cout<<"Employee ID:";
		cin>>empid;
		cout<<"Designation:";
		cin>>desig;
		cout<<"Enter dept:";
		cin>>dept;
		cout<<"Enter Salary:";
		cin>>sal;
       }
       void display()
       {        cout<<endl<<name<<"\t"<<empid<<"\t"<<desig
		<<"\t"<<dept<<"\t"<<sal;
       }
};
void main()
{
	clrscr();
	ofstream out;
	out.open("emp.dat",ios::out);
	emp e[10],ee[10];
	int n;
	cout<<"Enter no of emp:";
	cin>>n;
	for(int i=0;i<n;++i)
		e[i].getdata();
	for(i=0;i<n;++i)
	       out.write((char *)&e[i],sizeof(e[i]));
	out.close();

	ifstream in;
	in.open("emp.dat",ios::in);
	for(i=0;i<n;++i)
		in.read((char *)&ee[i],sizeof(ee[i]));
	cout<<"\n\t\t\t.....Employee Details.....";
	cout<<"\n\nNAME\tEMP-ID\tDESIGN.\tDEPT.\tSALARY";
	for(i=0;i<n;++i)
		ee[i].display();
	in.close();
	getch();
}
