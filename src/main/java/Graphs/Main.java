package Graphs;

/**
 * Created by bobkuipers on 08/03/2018.
 */
public class Main {

    public static void main(String[] args){
        GraphForDijkstra graph = new GraphForDijkstra();

        graph.addPath("A","B",8);
        graph.addPath("A","D",2);

        graph.addPath("B","C",5);

        graph.addPath("C","E",4);

        graph.addPath("D","E",11);
        graph.addPath("D","C",1);
        graph.addPath("D","B",1);

        graph.addPath("E","A",1);

        graph.unweighted("A");
//        graph.dijkstra("A");

        graph.printPath("C");

    }
}
