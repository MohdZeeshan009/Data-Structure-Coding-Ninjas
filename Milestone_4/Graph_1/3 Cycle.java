import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static int solve(boolean[][] graph, int i, int x, int count, boolean[] visited) {
		int cycle = 0;
		if (count == 2) {
			if (graph[i][x])
				return 1;
			else
				return 0;
		}
		for (int k = 0; k < graph.length; k++) {
			if (graph[i][k] && !visited[k]) {
				visited[k] = true;
				cycle += solve(graph, k, x, count + 1, visited);
				visited[k] = false;
			}
		}
		return cycle;
	}

	public static int solve(boolean[][] graph, int n) {
		int cycle = 0;
		for (int i = 0; i < n; i++) {
			cycle += solve(graph, i, i, 0, new boolean[n]);
		}
		return cycle / 6;
	}

	public static boolean[][] takeInput() throws IOException {
		String[] strNums;
		strNums = br.readLine().split("\\s");
		int n = Integer.parseInt(strNums[0]);
		int m = Integer.parseInt(strNums[1]);

		boolean[][] graphs = new boolean[n][n];
		int firstvertex, secondvertex;

		for (int i = 0; i < m; i++) {
			String[] strNums1;
			strNums1 = br.readLine().split("\\s");
			firstvertex = Integer.parseInt(strNums1[0]);
			secondvertex = Integer.parseInt(strNums1[1]);
			graphs[firstvertex][secondvertex] = true;
			graphs[secondvertex][firstvertex] = true;
		}
		return graphs;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		boolean[][] graphs = takeInput();

		int ans = solve(graphs, graphs.length);
		System.out.println(ans);

	}
}