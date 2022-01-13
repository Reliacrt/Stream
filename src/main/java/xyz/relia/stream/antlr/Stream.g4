grammar Stream;

@header {
    package xyz.relia.stream.grammar.parser;
}

stream
    : streamDef * operateDef;

streamDef
    : '[' ID ']' type ;

operateDef
    : operateDec operateImp ;

operateDec
    : '[' typedNames '->' ID '->' typedNames ']' ;

operateImp
    : '{' statements '}' ;

statements
    : (dataStream | operateDef | valueStream | switchStream | unwrapStream) * ;

dataStream
    : names '->' ID '->' names;

valueStream
    : values '->' names;

switchStream
    : name '->' typedNames ;

unwrapStream
    : name '->' '[' typedNames ']' ;

typedNames
    : typedName (',' typedName) * ;

typedName
    : ID ID ;

names
    : name (',' name) * ;

name
    : ID;

values
    : value (',' value) * ;

value
    : STRING
    | NUMBER ;

types
    : type (',' type) * ;

type
    : originalType
    | streamType
    | structType
    | functionType;

originalType
    : ID;

streamType
    : '{' type '}';

structType
    : '[' types ']';

functionType
    : '[' types '->' types ']';

WS : [ \t\n\r] + -> skip ;

ID : (UNDERLINE | CHAR) (CHAR | DIGIT | UNDERLINE) * ;

STRING
   : '"' (ESC | SAFECODEPOINT)* '"' ;

fragment ESC
   : '\\' (["\\/bfnrt] | UNICODE) ;

fragment UNICODE
   : 'u' HEX HEX HEX HEX ;

fragment HEX
   : [0-9a-fA-F] ;

fragment SAFECODEPOINT
   : ~ ["\\\u0000-\u001F] ;

fragment CHAR
    : [a-zA-Z];

fragment UNDERLINE
    : [_] ;

NUMBER
   : '-'? INT ('.' DIGIT +) ? EXP ? ;

fragment INT
   : '0' | DIGIT_P DIGIT * ;

fragment EXP
   : [Ee] [+\-]? INT ;

fragment DIGIT
    : [0-9] ;

fragment DIGIT_P
    : [1-9] ;