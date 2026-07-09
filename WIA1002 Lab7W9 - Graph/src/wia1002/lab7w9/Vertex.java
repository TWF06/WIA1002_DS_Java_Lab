package wia1002.lab7w9;

public class Vertex<T> {
    public T vertexInfo;
    public int inDeg;
    public int outDeg;
    public Vertex<T> nextVertex; // For linking vertices together in the graph
    public Edge<T> firstEdge;    // Head of the adjacency list for this vertex

    public Vertex(T vertexInfo, Vertex<T> nextVertex) {
        this.vertexInfo = vertexInfo;
        this.inDeg = 0;
        this.outDeg = 0;
        this.nextVertex = nextVertex;
        this.firstEdge = null;
    }
}
