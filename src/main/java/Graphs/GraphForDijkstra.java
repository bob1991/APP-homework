package Graphs;

import java.util.*;

/**
 * Created by bobkuipers on 09/03/2018.
 */
public class GraphForDijkstra {
    private Map<String,Node> nodeMap = new HashMap<String, Node>();

    private final double NOVALUEFORVERTEX = 0.0;
    private final int COSTOFCROSSINGPATH = 1;
    private final int STARTINGCOSTVALUE = 0;

    private Node getNode(String name){
        Node node = nodeMap.get(name);
        if(node == null){
            node = new Node(name);
            nodeMap.put(name,node);
        }
        return node;
    }

    public void addPath(String sourceNodeName, String destinationNodeName, double costOfCrossingEdge){
        Node sourceNode = getNode(sourceNodeName);
        Node destinationNode = getNode(destinationNodeName);
        sourceNode.paths.add(new Path(destinationNode,costOfCrossingEdge));
    }

    public void printPath(String nodeName){
        Node startingNode = nodeMap.get(nodeName);

        if(startingNode == null){
            throw new NoSuchElementException();
        }
        if(startingNode.nodeCost < NOVALUEFORVERTEX){
            System.out.println(startingNode.name + " is unreachable");
        }
        else {
            System.out.print("Cost is " + startingNode.nodeCost + " ");
            printPath(startingNode);
            System.out.println();
        }


    }

    private void printPath(Node node){
        if(node.previousNode != null){
            printPath(node.previousNode);
            System.out.print(" to ");
        }
        System.out.print(node.name);
    }

    public void dijkstra(String startingNodeName){
        Node startingNode = nodeMap.get(startingNodeName);

        if(startingNode == null){
            throw new NoSuchElementException("element not found");
        }

        PriorityQueue<Node> priorityQueue = new PriorityQueue<Node>();

        startingNode.nodeCost = 0;

        priorityQueue.add(startingNode);

        while(!priorityQueue.isEmpty()){
            Node sourceNode = priorityQueue.remove();

            if(sourceNode.nodeVisitied)
                continue;

            sourceNode.nodeVisitied = true;

            for(Path e : sourceNode.paths){
                Node destinationNode = e.destinationNode;
                if(destinationNode.nodeCost > sourceNode.nodeCost + e.costToCrossPath || !destinationNode.nodeVisitied) {
                    destinationNode.nodeCost = sourceNode.nodeCost + e.costToCrossPath;
                }

                priorityQueue.add(destinationNode);
            }
        }
    }

    public void unweighted(String name){
        Node start = nodeMap.get(name);

        if(start == null){
            throw new NoSuchElementException("element not found");
        }

        Queue<Node> queue = new LinkedList<Node>();

        queue.add(start);

        start.nodeCost = STARTINGCOSTVALUE;

        while (!queue.isEmpty()){
            Node sourceNode = queue.remove();

            for(Path path: sourceNode.paths){
                Node destinationNode = path.destinationNode;

                if (destinationNode.nodeCost < NOVALUEFORVERTEX){
                    destinationNode.nodeCost = sourceNode.nodeCost + COSTOFCROSSINGPATH;
                    destinationNode.previousNode = sourceNode;
                    queue.add(destinationNode);
                }
            }
        }
    }
}
