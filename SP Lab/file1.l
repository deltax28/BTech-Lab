%{
 int c=0,v=0,op=0;
%}
%%
[a|e|i|o|u|A|E|I|O|U] {++v;}
[b-d|f-h|j-n|p-t|v-z|B-D|F-H|J-N|P-T|V-Z] {++c;}
[+|*|/] {++op;}
[-] {++op;}
%%
void main(int argc,char* argv[])
{
yyin=fopen(argv[1],"r");
yylex();
printf("\nNo of vowels= %d",v);
printf("\nNo of consonants= %d",c);
printf("\nNo of operators= %d",op);
}
yywrap()
{
return 1;
}

