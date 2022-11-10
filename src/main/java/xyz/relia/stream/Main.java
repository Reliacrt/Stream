package xyz.relia.stream;

import xyz.relia.stream.grammar.Node;
import xyz.relia.stream.grammar.ParserBuilder;
import xyz.relia.stream.grammar.visitor.StreamVisitorImpl;
import xyz.relia.stream.lexer.Token;
import xyz.relia.stream.util.function.StrOp;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        var s = """
                        [x] [int, float]
                        [tt] [int -> int]
                        [ttt] [int, {[int, float]} -> int]
                        
                        [_ byte -> file -> _ byte] {
                                               
                            [a int, b int, c int -> three_plus -> d int]{
                            	a, b -> + -> e
                            	c, e -> + -> d
                            }
                           
                            [c x -> pl -> d float]{
                            	c -> x -> a, b
                            	a -> float -> e
                            	e, b -> + -> d
                            }
                           
                            [x int -> pl1 -> func tt]{
                            	[a int -> f -> c int]{
                            		a, x -> + -> c
                            	}
                            	f -> FromValue -> func
                            }
                            
                            [f1 tt, f2 tt -> func -> f3 tt] {
                                [x int -> func -> y int] {
                                    x -> f1 -> t
                                    t -> f2 -> y
                                }
                                func -> FromValue -> f3
                            }
                           
                            "Helloworld" -> FromValue -> byteflow
                            1 -> FromValue -> n1
                            2 -> FromValue -> n2
                            3 -> FromValue -> n3
                            n1, n2, n3 -> three_plus -> n4
                            byteflow, n4 -> ToConsole -> _
                        }
                """;
        System.out.println(s);
        var list = Token.toTokenList(StrOp.stringToCharArray(s));
        System.out.println(list);
        var tree = Node.buildGrammarTree(list);
        System.out.println(tree);


        var d = new HashMap<char[], String>();
        d.put(new char[]{'A'}, "A");
        d.put(new char[]{'B'}, "B");
        d.put(new char[]{'B'}, "C");
        System.out.println(d);

        var antlrStream = """
                [x] [int, float]
                [tt] [int -> int]
                [ttt] [int, {[int, float]} -> int]
        
                [_ byte -> file -> _ byte] {
        
                    [a int, b int, c int -> three_plus -> d int]{
                    	a, b -> plus -> e
                    	c, e -> plus -> d
                    }
        
                    [c x -> pl -> d float]{
                    	c -> x -> a, b
                    	a -> float -> e
                    	e, b -> plus -> d
                    }
        
                    [x int -> pl1 -> func tt]{
                    	[a int -> f -> c int]{
                    		a, x -> plus -> c
                    	}
                    	f -> wrap -> func
                    }
        
                    [f1 tt, f2 tt -> func -> f3 tt] {
                        [x int -> func -> y int] {
                            x -> f1 -> t
                            t -> f2 -> y
                        }
                        func -> wrap -> f3
                    }
        
                    "Helloworld" -> byteflow
                    1 -> n1
                    2 -> n2
                    3 -> n3
                    n1, n2, n3 -> three_plus -> n4
                    byteflow, n4 -> ToConsole -> _
                }
                """;
        var parser = ParserBuilder.from(antlrStream);
        new StreamVisitorImpl().visitStream(parser.stream());

        var testProgram = """
                
                [stdin byte -> file -> stdout byte] {
                    1 -> forever -> one
                    10 -> forever -> ten
                    [a int, b int -> print_formula -> str string] {
                        a, b -> multiply -> c
                        a, b, c -> string -> as, bs, cs
                        as, "*", bs, "=", cs -> concat -> str
                    }
                    [from int, to int, step int, f int_func -> range -> out int] {
                        from -> once -> start
                        start, index -> merge -> i
                        i -> f -> index
                        step -> forever -> d
                        to -> forever -> t
                        i, d -> plus -> next
                        next, t -> less -> b
                        next, b -> branch -> index, out
                    }
                }
                
                """;
    }
}
