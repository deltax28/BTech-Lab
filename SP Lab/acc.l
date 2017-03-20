%{
%}

%%
(1)*(01+)* {printf("String accepted"); exit(0);}
.+ {printf(" string rejected"); exit(0);}
%%
main()
{
printf("enter string:");
yylex();
}
yywrap()
{
return 1;
}

