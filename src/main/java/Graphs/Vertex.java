package Graphs;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by bobkuipers on 08/03/2018.
 */
public class Vertex {
    String name;
    List<Edge> edges = new LinkedList<Edge>();
    double vertexCost = - 1;
    Vertex previousVertex;
    public boolean vertexVisited;


    public Vertex(String name) {
        this.name = name;
    }
}
