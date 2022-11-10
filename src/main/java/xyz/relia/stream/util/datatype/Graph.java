package xyz.relia.stream.util.datatype;

import java.util.Arrays;
import java.util.Set;

import lombok.Data;

@Data
public class Graph {
    private Set<Edge> edges;
    private Set<Node> nodes;

    public void addNodes(Node... nodes) {
        Arrays.stream(nodes).forEach(this::addNode);
    }

    public boolean addNode(Node node) {
        return nodes.add(node);
    }

    public boolean linkNode(Node a, Node b) {
        return linkNode(a, b, false);
    }

    public boolean linkNode(Node a, Node b, boolean isSymmetric) {
        nodes.add(a);
        nodes.add(b);
        Edge edge = new Edge(a, b, isSymmetric);
        return edges.add(edge);
    }
}
