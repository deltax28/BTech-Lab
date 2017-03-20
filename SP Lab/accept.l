%{
%}
%%
2*(01|10)2*(01|10)2*|2*(11|00)2*(00|11)2*|2*11002* {printf("String accepted");}
.+ {printf(" string rejected"); exit(0);}

%%
main()
{
printf("Enter string");
yylex();
}
yywrap()
{
return 1;
}
