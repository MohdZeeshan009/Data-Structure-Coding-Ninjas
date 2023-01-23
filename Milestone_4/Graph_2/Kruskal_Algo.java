import java.util.*;

class Edges implements Comparable<Edges> {

	int v1;
	int v2;
	int weigth;

	public Edges(int v1, int v2, int weigth) {
		this.v1 = v1;
		this.v2 = v2;
		this.weigth = weigth;
	}

	@Override
	public int compareTo(Edges o) {

		return this.weigth - o.weigth;
	}
}
public class Solution {
	

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int v = sc.nextInt();
		int e = sc.nextInt();
		int count = 0;
		Edges[] edge = new Edges[e];
		for (int i = 0; i < e; i++) {
			int v1 = sc.nextInt();
			int v2 = sc.nextInt();
			int weigth = sc.nextInt();
			edge[i] = new Edges(v1, v2, weigth);

		}
		Arrays.sort(edge);
		int[] parent = new int[v];
		for (int i = 0; i < v; i++) {
			parent[i] = i;
		}
		int i = 0;
		while (count != v - 1) {
			Edges currEdge = edge[i++];
			int index = parent[currEdge.v1];
			while (index != parent[index]) {
				index = parent[index];

			}
			int index2 = parent[currEdge.v2];
			while (index2 != parent[index2]) {
				index2 = parent[index2];
			}
			if (index != index2) {
				System.out.println(Math.min(currEdge.v1, currEdge.v2) + " " + Math.max(currEdge.v2, currEdge.v1) + " "
						+ currEdge.weigth);
				parent[index] = parent[index2];
				count++;
			}
		}
	}

}