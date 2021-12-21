package yuown.p2021.ctci.tree;

public class GraphTest {
	
	public static void main(String[] args) {
		GraphNode n0 = new GraphNode("0");
		GraphNode n1 = new GraphNode("1");
		GraphNode n2 = new GraphNode("2");
		GraphNode n3 = new GraphNode("3");
		GraphNode n4 = new GraphNode("4");
		GraphNode n5 = new GraphNode("5");
		
		n0.add(n1);
		n0.add(n4);
		n0.add(n5);
		
		n1.add(n3);
		n1.add(n4);
		
		n3.add(n2);
		n3.add(n4);
		
		n2.add(n1);
		
		n0.dfs();
		
		n0.bfs();
		
		System.out.println("To String " + n0.toString());
		
		boolean exists = n0.search(n0, n1);
		
		System.out.println("Path exists = " + exists);
	}

}
