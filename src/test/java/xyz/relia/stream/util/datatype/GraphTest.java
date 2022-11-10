package xyz.relia.stream.util.datatype;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class GraphTest {
    
    @Test
    public void testProgram() {
        System.out.println("ssss");

        Set<Node> nodes = new HashSet<Node>();
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(2);
        System.out.println(n1.equals(n2));
        nodes.add(n1);
        nodes.add(n2);
        System.out.println(nodes);
        nodes.add(n3);
        System.out.println(nodes);
    }
}
