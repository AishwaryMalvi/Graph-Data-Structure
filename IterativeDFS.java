package Graph;

import java.util.LinkedList;
import java.util.Stack;

public class IterativeDFS {
	
	private int vertices;
	private int edge;
	private LinkedList<Integer>[]adj;
	public IterativeDFS(int node) {
		this.vertices = node;
		this.edge = 0;
		this.adj = new LinkedList[node];
		for(int i = 0;i < node;i++) {
			this.adj[i] = new LinkedList<>();
			}
	}
	public void addEdge(int u ,int v) {
		this.adj[u].add(v);
		this.adj[v].add(u);
		edge ++;
	}
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(vertices + " vertice, " + edge + " edge " + "\n");
		for(int i =0 ;i<vertices;i++) {
			sb.append(i + ":");
			for(int w : adj[i]) {
				sb.append(w + " ");
			}
			sb.append("\n");
		}
		return sb.toString();
		}
	public void dfs(int s) {
		boolean[] visited = new boolean[vertices];
		Stack<Integer>Stack = new Stack<>();
		Stack.push(s);
		while(!Stack.isEmpty()) {
			int u =Stack.pop();
			if(!visited[u]) {
				visited[u] = true;
				System.out.println(u + " ");
				for(int v :adj[u]) {
					if(!visited[v]) {
						Stack.push(v);
					}
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IterativeDFS idfs = new IterativeDFS(5);
		idfs.addEdge(0, 1);
		idfs.addEdge(1, 2);
		idfs.addEdge(2, 3);
		idfs.addEdge(1, 4);
		idfs.addEdge(2, 4);
		idfs.dfs(1);
		
		
	}

}
