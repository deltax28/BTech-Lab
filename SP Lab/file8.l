%{
%}
D       [0-9]
OP      [-+*/]
R1      [<>]=?|!=|==
E       [a-zA-Z]
L       [&|]{2}
EXP     {E}+{OP}{E}+|{D}+{OP}{D}+|{E}|{D}
EXP1    {D}+{R1}{D}+|{E}+{R1}{E}+|{E}|{D}
EXP2    {E}+{L}{E}+|{D}+{L}{D}+|{E}|{D}

%%
{EXP}{OP}{EXP}    {printf(yytext); printf("Arithmetic Expression\n");}
{EXP1}{R1}{EXP1}  {printf(yytext); printf("Relational Expression\n");}
{EXP2}{L}{EXP2}   {printf(yytext); printf("Logical Expression\n");}
{E}|{D}           {printf(yytext); printf("Simple Expression");}
.+                {printf(yytext); printf("Error");}
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


