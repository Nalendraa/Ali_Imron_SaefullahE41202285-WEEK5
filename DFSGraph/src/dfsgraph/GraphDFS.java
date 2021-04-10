package dfsgraph;

/**
 *
 * @author Nalendraa
 */
public class GraphDFS {

    public static void main(String[] args) {
        Graph theGraph = new Graph();
        theGraph.addVertex('P');          // 0
        theGraph.addVertex('Q');         // 1
        theGraph.addVertex('R');         // 2
        theGraph.addVertex('S');         // 3
        theGraph.addVertex('T');        // 4

        theGraph.addEdge(0, 1);         // PQ
        theGraph.addEdge(1, 2);         // QR
        theGraph.addEdge(2, 3);         // RS
        theGraph.addEdge(3, 4);         // ST

        theGraph.dfs();
        // theGraph.display();
    }
}
