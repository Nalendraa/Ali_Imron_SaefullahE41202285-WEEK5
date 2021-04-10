package dfsgraph;

/**
 *
 * @author Nalendraa
 */
public class Graph {

    private final int MAX_VERTS = 20;
    private final Vertex vertexList[];
    private final int adjMat[][];
    private int nVerts;

    // dfs
    public void dfs() {
        System.out.println("This Is DFS Algorithm: ");
        vertexList[0].wasVisited = true;
        displayVertex(0);
        theStack.push(0);

        while (!theStack.isEmpty()) {
            int v = getAdjUnvisitedVertex(theStack.peek());
            if (v == -1) {
                theStack.pop();
            } else {
                vertexList[v].wasVisited = true;
                displayVertex(v);
                theStack.push(v);
            }
        }

        ///Perulangan untuk stack yang kosong
        for (int j = 0; j < nVerts; j++) {
            vertexList[j].wasVisited = false;
        }
        System.out.println("");
        resetFlags();
    }

    private Stack theStack;

    public Graph() {
        vertexList = new Vertex[MAX_VERTS];
        adjMat = new int[MAX_VERTS][MAX_VERTS];
        nVerts = 0;
        for (int i = 0; i < MAX_VERTS; i++) {
            for (int j = 0; j < MAX_VERTS; j++) {
                adjMat[i][j] = 0;
            }
        }
        theStack = new Stack(MAX_VERTS);
    }

    public void addVertex(char label) {
        vertexList[nVerts++] = new Vertex(label);
    }

    public void addEdge(int start, int end) {
        adjMat[start][end] = 1;
        adjMat[end][start] = 1;
    }

    public void display() {
        System.out.println("Adjecency : ");
        for (int row = 0; row < nVerts; row++) {
            for (int col = 0; col < row; col++) {
                if (adjMat[row][col] == 1) {
                    System.out.println(vertexList[row].label + "--" + vertexList[col].label);
                }
            }
        }
        System.out.println("");
    }

    public void displayVertex(int v) {
        System.out.print(vertexList[v].label + " ");
    }

    public int getAdjUnvisitedVertex(int v) {
        for (int i = 0; i < nVerts; i++) {
            if (adjMat[v][i] == 1 && vertexList[i].wasVisited == false) {
                return i;
            }
        }
        return -1;
    }

    private void resetFlags() {
        for (int i = 0; i < nVerts; i++) {
            vertexList[i].wasVisited = false;
        }
    }
}
