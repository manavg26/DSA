package Graphs;

import java.util.*;
import java.io.*;

class gr{
	private int v;
	private LinkedList adj[];
	gr(int V){
		v=V;
		adj=new LinkedList[v];
		for(int i=0;i<v;i++) {
			adj[i]=new LinkedList();
		}
	}

	public void addEdge(int w,int u) {
		adj[w].add(u);
	}
	public void dfsutil(int s,boolean[] visited) {
		visited[s]=true;
		System.out.print(s+"->");
		for(Object i:adj[s]) {
			int n=(int) i;
			if(!visited[n])
				dfsutil(n,visited);
		}
		
	}
	public void dfs(int s) {
		boolean[] visited=new boolean[v];
		dfsutil(s,visited);
	}
}

public class DFS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		gr g = new gr(4);
		 
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
        g.dfs(2);

	}

}
