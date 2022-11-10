package xyz.relia.stream.util.datatype;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Edge {
    private int from;
    private int to;

    public Edge(Node a, Node b) {
        new Edge(a, b, false);
    }

    public Edge(Node a, Node b, boolean isSymmetric) {
        from = a.getId();
        to = b.getId();
        a.getOutNodes().add(b.getId());
        b.getInNodes().add(a.getId());
        if (isSymmetric) {
            a.getInNodes().add(b.getId());
            b.getOutNodes().add(a.getId());
        }
    }

    public String toString() {
        return "Edge{" + from + ", " + to + "}";
    }
}
