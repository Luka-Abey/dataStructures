package com.LA.Graph;

import java.util.List;

public abstract class Graph {
	private int numVertices;
	private int numEdges;
	
	public Graph() {
		numVertices = 0;
		numEdges = 0;
	}
	
	public void addVertex() {
		implementAddVertex();
		numVertices ++;
	}
	
	public abstract void implementAddVertex() {
		
	}
	
	public abstract List<Integer> getNeighbours(int v); 
	
	
	
	
	
	public int getNumVertices() {
		return numVertices;
	}
	
	public int getNumEdges() {
		return numEdges;
	}	
}
