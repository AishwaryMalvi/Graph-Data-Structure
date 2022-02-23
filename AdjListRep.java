package Graph;

import java.util.LinkedList;

public class AdjListRep {
	
	private LinkedList<Integer>[] adjmatrix;
	private int vertices;
	private int edge;
	
	public AdjListRep (int node) {
		this.vertices = node;
		this.edge = 0;
		this.adjmatrix = new LinkedList[node];
		for(int i = 0;i < node;i++) {
			this.adjmatrix[i] = new LinkedList<>();
			}
	}
	public void addEdge(int u ,int v) {
		this.adjmatrix[u].add(v);
		this.adjmatrix[v].add(u);
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
		AdjListRep alr = new AdjListRep(5);
		alr.addEdge(0, 1);
		alr.addEdge(1, 2);
		alr.addEdge(2, 3);
		alr.addEdge(3, 4);
		alr.addEdge(4, 0);
		System.out.print(alr);

	}

}
