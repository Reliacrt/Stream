package xyz.relia.stream.util.datatype;

import lombok.Data;

import java.util.List;

@Data
public class Node {
    
    private List<Edge> inEdges;
    private List<Edge> outEdges;
}
