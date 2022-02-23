package Graph;

import java.util.LinkedList;
import java.util.Queue;

public class BreathSearchFirst {

	private int vertices;
	private int edge;
	private LinkedList<Integer>[]adjmatrix;
	public BreathSearchFirst(int node) {
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
	public void breathsearchfirst(int s) {
		boolean [] visited = new boolean[vertices];
		Queue <Integer> q = new LinkedList<>();
		visited[s] = true;
		q.offer(s);
		while(!q.isEmpty()) {
			int u = q.poll();
			System.out.print(u+" ");
			for(int v:adjmatrix[u]) {
				if(!visited[v]) {
					visited[v] = true;
					q.offer(v);
					
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BreathSearchFirst graph = new BreathSearchFirst(5);
		graph.addEdge(0, 1);
		graph.addEdge(1, 2);
		graph.addEdge(2, 3);
		graph.addEdge(1, 4);
		graph.addEdge(2, 4);
		
		graph.breathsearchfirst(0);
	}

}
