%{
%}
%%
2*(01|10)2*(01|10)2*|2*(11|00)2*(00|11)2*|2*11002* {printf(yytext); printf("  accepted");}
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

