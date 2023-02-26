package prj1;

/**
 * The implementation of Dijkstras shortest path algorithm by using a simple
 * linear search to find the unvisited node with the minimum distance estimate
 * 
 * @author Enter your names here
 * @version 1.1
 */
public class DijkstrasWithoutHeap {

   private int n;
   
    private static int[][] graph;
    /**
     * Constructor of the class
     * 
     * @param n:
     *            number of nodes of the graph
     * @param edges:
     *            the set of edges of the graph. Each row of 'edges' is in the
     *            form of [u, v, w], which means that there is an edge between u
     *            and v with weight w. So edges[i][0] and edges[i][1] are the
     *            end-points of the i-th edge and edges[i][2] is its weight
     */
    public DijkstrasWithoutHeap(int n, int[][] edges) {
  
   
graph = new int [n][n];
for (int i = 0; i < edges.length; i++) {

int u = edges[i][0];
int v = edges[i][1];
int w = edges[i][2];
}
int[] distance = new int[n];
boolean[] visted = new boolean[n];

    for (int i = 0; i< n; i++)
    {
       visted[i] = false; 
    distance[i] = Integer.MAX_VALUE;
    
    }


}

public void minDistance(int[] distance, boolean visted) 
{
    visted = true;
   distance[0] = 0;
    int infinity = Integer.MAX_VALUE;
    for (int v = 0 ; v < n; v++)
    if (!distance[u]
+ graph[u][v] > distance[v])
        
        {
        distance[n] = distance[u] + graph[u][n];
            }
            
}


    


    /**
     * This method computes and returns the distances of all nodes of the graph
     * from the source node
     * 
     * @param source
     * 
     * @return an array containing the distances of the nodes of the graph from
     *         source. Element i of the returned array represents the distance
     *         of node i from the source
     */
    public int[] run(int source) {
        // TODO Complete
        return null;
    }

}
