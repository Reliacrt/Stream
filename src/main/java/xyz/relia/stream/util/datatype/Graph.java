package xyz.relia.stream.util.datatype;

import java.util.Set;

import lombok.Data;

@Data
public class Graph {
    private Set<Edge> edges;
    private Set<Node> nodes;

    public boolean addNode(Node node) {
        return nodes.add(node);
    }
}
