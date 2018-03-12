package Graphs;

/**
 * Created by bobkuipers on 08/03/2018.
 */
public class Edge implements Comparable<Edge> {
    Vertex destination;
    double costToCross;

    public Edge(Vertex destination, double costToCross){
        this.destination = destination;
        this.costToCross = costToCross;
    }

    public int compareTo(Edge o) {
        double otherCost = o.costToCross;
        return costToCross < otherCost ? -1 : costToCross > otherCost ? 1 : 0;
    }
}
