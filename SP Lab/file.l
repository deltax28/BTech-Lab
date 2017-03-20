%{
int l=0,c=0;
%}
%%
[\n] {l++; c++;}
. {c++;}
%%
void main(int argc,char* argv[])
{
yyin=fopen(argv[1],"r");
yylex();
printf("\nNo of lines= %d",l);
printf("\nNo of characters= %d",c);
}
yywrap()
{
return 1;
}
