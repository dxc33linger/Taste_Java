package graph;

public class Graph {

	private Vertex[] vertex;
	private int currentSize;
	public int[][] adjMat;
	private MyStack stack = new MyStack();
	private int currentIndex ;
	
	public Graph(int size) {
		vertex = new Vertex[size];
		adjMat = new int[size][size];
	}
	public void addVertex(Vertex v) {
		vertex[currentSize++] = v;
		System.out.println(v);
	}
	
	public void addEdge(String v1, String v2) {
		//fine index of two vertexes.
		int index1=0;
		for(int i=0; i<vertex.length; i++) {
			if(vertex[i].getValue().equals(v1)) {
				index1 = i;
				break;
		}
	}
		int index2=0;
		for(int i=0; i<vertex.length; i++) {
			if(vertex[i].getValue().equals(v2)) {
				index2 = i;
				break;
		}
	}
	adjMat[index1][index2] = 1;
	adjMat[index2][index1] = 1;
		
	}
	
	public void dfs() {
		vertex[0].visited = true;
		stack.push(0); 
		System.out.println(vertex[0].getValue());
		out:while(!stack.isEmpty()){
			for(int i = currentIndex+1; i <vertex.length; i++) {
				if(adjMat[currentIndex][i]==1&&vertex[i].visited==false) {
					stack.push(i);
					vertex[i].visited=true;
					System.out.println(vertex[i].getValue());
					continue out;
				}
			}
			stack.pop();
			if(!stack.isEmpty()) {
				currentIndex = stack.peak();
				
		}
	}
}
}