%{
%}
%%
(ab)(a|b)* {printf(yytext); printf("  accepted"); }
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
