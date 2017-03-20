%{
%}
%%
(1)*(01+)* {printf(yytext); printf(" String accepted");}
.+ {printf(yytext); printf(" string rejected");}

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
