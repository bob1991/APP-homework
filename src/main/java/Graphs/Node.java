package Graphs;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by bobkuipers on 09/03/2018.
 */
public class Node implements Comparable<Node> {
    String name;
    List<Path> paths = new LinkedList<Path>();
    double nodeCost = - 1;
    Node previousNode;
    public boolean nodeVisitied;

    public Node(String name){
        this.name = name;
    }

    public int compareTo(Node o) {
        return nodeCost < o.nodeCost ? -1 : nodeCost > o.nodeCost ? 1 : 0;
    }
}
