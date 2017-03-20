%{
#include<stdlib.h>
#include<stdio.h>
%}

%token	DIGIT
%%
L:E'\n'	{ printf("Result = %d\n",$1); exit(0); } 
 ;
E:E'+'E 	{$$ = $1+$3;}
 |E'-'E 	{$$ = $1-$3;}
 |E'*'E 	{$$ = $1*$3;}
 |E'/'E 	{$$ = $1/$3;}
 |'('E')'	{$$ = $2;}
 |DIGIT
 ;
%%

main() {
	printf("Enter input :");
	yyparse();
}
yylex() {
	int c;
	c = getchar();
	if(isdigit(c)) {
		yylval = c-'0';
		return DIGIT;
	}
	return c;
}

yyerror() {
	printf("Error\n");
}
