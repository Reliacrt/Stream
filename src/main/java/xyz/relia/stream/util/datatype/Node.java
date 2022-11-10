package xyz.relia.stream.util.datatype;

import java.util.HashSet;
import java.util.Set;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Node {
    @EqualsAndHashCode.Include
    private int id;
    
    private Set<Integer> inNodes = new HashSet<>();
    private Set<Integer> outNodes = new HashSet<>();

    public Node(int id) {
        this.id = id;
    }

    public static Node of(int id) {
        return new Node(id);
    }

    public String toString() {
        return "Node{" + id + "}";
    }
}
