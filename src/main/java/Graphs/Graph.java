package Graphs;

import java.util.*;

/**
 * Created by bobkuipers on 08/03/2018.
 */
public class Graph {
    private Map<String,Vertex> vertexMap = new HashMap<String, Vertex>();

    private final double NOVALUEFORVERTEX = 0.0;
    private final int COSTOFCROSSINGPATH = 1;
    private final int STARTINGCOSTVALUE = 0;


    private Vertex getVertex(String name){
        Vertex vertex = vertexMap.get(name);
        if(vertex == null){
            vertex = new Vertex(name);
            vertexMap.put(name,vertex);
        }
        return vertex;
    }

    public void addEdge(String sourceVertexName, String destinationVertexName, double costOfCrossingEdge){
        Vertex sourceVertex = getVertex(sourceVertexName);
        Vertex destinationVertex = getVertex(destinationVertexName);
        sourceVertex.edges.add(new Edge(destinationVertex,costOfCrossingEdge));
    }

    public void printPath(String vertexName){
        Vertex startingVertex = vertexMap.get(vertexName);

        if(startingVertex == null){
            throw new NoSuchElementException();
        }
        if(startingVertex.vertexCost < NOVALUEFORVERTEX){
            System.out.println(startingVertex.name + " is unreachable");
        }
        else {
            System.out.print("Cost is " + startingVertex.vertexCost + " ");
            printPath(startingVertex);
            System.out.println();
        }


    }

    private void printPath(Vertex vertex){
        if(vertex.previousVertex != null){
            printPath(vertex.previousVertex);
            System.out.print(" to ");
        }
        System.out.print(vertex.name);
    }


    public void unweighted(String name){
        Vertex start = vertexMap.get(name);

        if(start == null){
            throw new NoSuchElementException("element not found");
        }

        Queue<Vertex> queue = new LinkedList<Vertex>();

        queue.add(start);

        start.vertexCost = STARTINGCOSTVALUE;

        while (!queue.isEmpty()){
            Vertex sourceVertex = queue.remove();

            for(Edge edge: sourceVertex.edges){
                Vertex destinationVertex = edge.destination;

                if (destinationVertex.vertexCost < NOVALUEFORVERTEX){
                    destinationVertex.vertexCost = sourceVertex.vertexCost + COSTOFCROSSINGPATH;
                    destinationVertex.previousVertex = sourceVertex;
                    queue.add(destinationVertex);
                }
            }
        }
    }


//    public void dijkstra(String startingVertexName){
//        Vertex startingVertex = vertexMap.get(startingVertexName);
//
//        PriorityQueue<Path> queue = new PriorityQueue<Path>();
//
//        if(startingVertex == null){
//            throw new NoSuchElementException("element not found");
//        }
//
//        queue.add(new Path(startingVertex, 0));
//        startingVertex.vertexCost = 0;
//
//        int nodeSeen = 0;
//
//        while (!queue.isEmpty() && nodeSeen < vertexMap.size()){
//            Path vrec = queue.remove();
//
//            Vertex v = vrec.destinationNode;
//
//            if(v.vertexVisited)
//                continue;
//
//            v.vertexVisited = true;
//            nodeSeen++;
//
//            for( Edge e : v.edges){
//                Vertex w = e.destination;
//                double cvw = e.costToCross;
//
//                if(cvw < 0){
//                    throw new NoSuchElementException();
//                }
//
//                if(w.vertexCost < v.vertexCost + e.costToCross){
//                    w.vertexCost = v.vertexCost + e.costToCross;
//                    w.previousVertex = v;
//                    queue.add(new Path(w, w.vertexCost));
//                }
//            }
//        }
//    }



}
