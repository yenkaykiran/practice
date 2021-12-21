package yuown.p2021.ctci.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class GraphNode {

	private String data;

	private State state;

	private List<GraphNode> nodes;

	public GraphNode(String d) {
		data = d;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public List<GraphNode> getNodes() {
		return nodes;
	}

	public void setNodes(List<GraphNode> nodes) {
		this.nodes = nodes;
	}

	public void add(GraphNode n) {
		if (null == nodes) {
			nodes = new ArrayList<>();
		}
		nodes.add(n);
	}

	public void dfs() {
		System.out.print("DFS = ");
		dfs(this);
		System.out.println();
		resetState(this);
	}

	private void resetState(GraphNode n) {
		n.state = State.UNVISITED;

		if (null != n.nodes) {
			for (GraphNode n1 : n.nodes) {
				if (null != n1 && n1.state != State.UNVISITED) {
					resetState(n1);
				}
			}
		}
	}

	private void dfs(GraphNode n) {
		System.out.print(n.data + " ");
		n.state = State.VISITED;

		if (null != n.nodes) {
			for (GraphNode n1 : n.nodes) {
				if (null != n1 && n1.state != State.VISITED) {
					dfs(n1);
				}
			}
		}
	}

	public void bfs() {
		System.out.print("BFS = ");
		bfs(this);
		System.out.println();
		resetState(this);
	}

	private void bfs(GraphNode n) {
		Queue<GraphNode> q = new LinkedList<>();
		q.add(n);
		n.state = State.VISITED;

		while (!q.isEmpty()) {
			n = q.remove();
			System.out.print(n.data + " ");

			if (null != n.nodes) {
				for (GraphNode n1 : n.nodes) {
					if (n1.state != State.VISITED) {
						q.add(n1);
						n1.state = State.VISITED;
					}
				}
			}
		}
	}

	public boolean search(GraphNode s, GraphNode e) {
		return searchPath(this, s, e);
	}

	private boolean searchPath(GraphNode root, GraphNode s, GraphNode e) {
		if (s == e) {
			return true;
		}

		LinkedList<GraphNode> q = new LinkedList<>();

		for (GraphNode u : root.getNodes()) {
			u.state = State.UNVISITED;
		}
		s.state = State.VISITING;
		q.add(s);

		GraphNode u = null;

		while (!q.isEmpty()) {
			u = q.removeFirst();
			if (null != u && null != u.nodes) {
				for (GraphNode v : u.nodes) {
					if (v.state == State.UNVISITED) {
						return v == e;
					} else {
						v.state = State.VISITING;
						q.add(v);
					}
				}
				u.state = State.VISITED;
			}
		}
		return false;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(data + " ");
		this.state = State.VISITED;
		toString(this, sb);
		resetState(this);
		return sb.toString();
	}

	private void toString(GraphNode n, StringBuilder sb) {
		for(GraphNode n1 : n.nodes) {
			if(null != n1 && n1.state != State.VISITED) {
				sb.append(n1.data + " ");
				n1.state = State.VISITED;
				if(null != n1.nodes) {
					toString(n1, sb);
				}
			}
		}
	}
}

enum State {
	UNVISITED, VISITED, VISITING;
}