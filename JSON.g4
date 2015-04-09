grammar JSON;

INT : [0-9]+;
NAME : [a-zA-Z]+;
OPBR : '{' ;
CLBR : '}' ; 
OPSQBR : '[' ; 
CLSQBR : ']' ;
COMMA : ',' ;
COLON : ':' ; 
QUOTATION : '"' ; 

NAMELIT : '"name"' ; 
GROUPLIT : '"group"' ; 
NODELIT : '"nodes"' ; 
LINKLIT : '"links"' ; 
SOURCELIT : '"source"' ; 
TARGETLIT : '"target"' ; 
VALUELIT : '"value"' ; 

WS: [ \t\n\r]+ -> skip ;

start : json EOF ;

json : OPBR NODELIT COLON OPSQBR nodelist CLSQBR COMMA LINKLIT COLON OPSQBR linklist CLSQBR CLBR ;

nodelist : node
		| node COMMA nodelist ;

linklist: link
		| link COMMA linklist;

node : OPBR NAMELIT COLON QUOTATION NAME QUOTATION COMMA GROUPLIT COLON INT CLBR ; 

link : OPBR SOURCELIT COLON INT COMMA TARGETLIT COLON INT COMMA VALUELIT COLON INT CLBR ;