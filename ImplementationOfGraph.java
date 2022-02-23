package Graph;

public class ImplementationOfGraph {
	
	private int vertices;
	private int edge;
	int[][] adjmatrix;
	public ImplementationOfGraph(int node) {
		this.vertices = node;
		this.edge = 0;
		this.adjmatrix = new int[node][node];
	}
	public void addEdge(int u ,int v) {
		this.adjmatrix[u][v] = 1;
		this.adjmatrix[v][u] = 1;
		edge ++;
	}
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(vertices + " vertice, " + edge + " edge " + "\n");
		for(int i =0 ;i<vertices;i++) {
			sb.append(i + ":");
			for(int w : adjmatrix[i]) {
				sb.append(w + " ");
			}
			sb.append("\n");
		}
		return sb.toString();
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImplementationOfGraph graph = new ImplementationOfGraph(5);
		graph.addEdge(0, 1);
		graph.addEdge(1, 2);
		graph.addEdge(2, 3);
		graph.addEdge(3, 0);
		graph.addEdge(3, 4);
		System.out.print(graph);
	}

}
