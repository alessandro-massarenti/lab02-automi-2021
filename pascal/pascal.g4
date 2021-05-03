grammar pascal;

// Regole del Parser

// Program outer wrapper
start     : 'program' ID ';' 'var' decl_list main_code EOF ;


// Variable declaration list
decl_list : decl | decl decl_list ;
decl      : var ':' 'integer' ';';
var       : ID | var ',' ID;


// Main code wrapper
main_code : 'begin' st_list 'end' '.' ;
code_block: statement | st_list | 'begin' st_list 'end';
st_list   : statement ';' | statement ';' st_list;

// Le tipologie di statement disponibili
statement : assign | cicle_until | branch | out | in;

// Gli statements
assign    : ID ':=' expr | ID ':=' arith;
cicle_until    : 'repeat' code_block 'until' relation;
branch    : 'if' relation 'then' code_block | 
            'if' relation 'then' code_block 'else' code_block;
out       : 'writeln' '(' expr ')' | 'writeln' '(' STRING ')';
in        : 'readln' '(' ID ')';

// I blocchi principali
expr      : NUMBER | ID;
arith     : expr | arith arithmetic_operator arith;
arith_expr: arith | expr; // Un raggruppamento per renderli più managable

relation  : arith_expr arithmetic_operator arith_expr |
            relation logic_operator relation |
            arith_expr comparison_operator arith_expr ;

// Gli operatori
arithmetic_operator : PLUS | MINUS | PER | DIV | MOD;
logic_operator : AND | OR | NOT;
comparison_operator : LT | LEQ | EQ | GEQ | NEQ | GT;

// Regole del Lexer


PLUS      : '+'; 
MINUS     : '-';
PER       : '*';
DIV       : '/';
MOD       : '%';

AND       : 'and' ;
OR        : 'or' ;
NOT       : 'not' ;

EQ        : '=' ;
LT        : '<' ;
LEQ       : '<=' ;
GT        : '>' ;
GEQ       : '>=' ;
NEQ       : '<>' ;

ID        : [a-z]+ ;
STRING    : '\''.*?'\'';
NUMBER    : [0-9]+ ;
R_COMMENT : '(*' .*? '*)' -> skip ;     // .*? matches anything until the first *)
C_COMMENT : '{' .*? '}' -> skip ;       // .*? matches anything until the first }
LINE_COMMENT : '//' ~[\r\n]* -> skip ;  // ~[\r\n]* matches anything but \r and \n
WS        : [ \n\t\r]+ -> skip;
ErrorChar : . ;
