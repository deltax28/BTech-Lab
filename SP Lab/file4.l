%{
%}
%%
[012](0{2}|1{2}|2{2}) {printf(yytext); printf("  String accepted");}
.+ {printf(yytext); printf("  rejected");}
%%
void main(int argc,char* argv[])
{
yyin=fopen(argv[1],"r");
yylex();
}
yywrap()
{
return 1;
}
