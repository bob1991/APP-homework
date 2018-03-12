package Graphs;

/**
 * Created by bobkuipers on 08/03/2018.
 */
public class Path implements Comparable<Path> {
    double costToCrossPath;
    Node destinationNode;

    public Path(Node destinationNode, double cost){
        this.costToCrossPath = cost;
        this.destinationNode = destinationNode;
    }

    public int compareTo(Path o) {
        double otherCost = o.costToCrossPath;
        return costToCrossPath < otherCost ? -1 : costToCrossPath > otherCost ? 1 : 0;
    }
}
