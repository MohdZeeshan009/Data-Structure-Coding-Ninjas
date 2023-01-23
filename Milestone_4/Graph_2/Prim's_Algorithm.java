import java.util.Arrays;
import java.util.Scanner;

public class Solution {

	public static void DFS(int[][] adjMatrix, int x, boolean[] visited, int[] weight, int[] parent, int count) {
		if (count == adjMatrix.length)
			return;
		for (int i = 0; i < adjMatrix.length; i++) {
			if (adjMatrix[x][i] != 0 && adjMatrix[x][i] < weight[i] && !visited[i]) {
				weight[i] = adjMatrix[x][i];
				parent[i] = x;
			}
		}
		visited[x] = true;
		x = -1;
		for (int i = 0; i < adjMatrix.length; i++) {
			if (!visited[i] && (x == -1 || weight[x] > weight[i])) {
				x = i;
			}
		}
		DFS(adjMatrix, x, visited, weight, parent, count + 1);

	}


	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int V = s.nextInt();
        int E = s.nextInt();
        int[][] adjMatrix = new int[V][V];
        for (int i = 0; i < E; i++) {
            int v1 = s.nextInt();
            int v2 = s.nextInt();
            int weight = s.nextInt();
            adjMatrix[v1][v2] = weight;
            adjMatrix[v2][v1] = weight;
        }
        boolean[] visited = new boolean[V];
        int[] weight = new int[V];
        Arrays.fill(weight, Integer.MAX_VALUE);
        weight[0] = 0;
        int[] parent = new int[V];
        parent[0] = -1;
        DFS(adjMatrix, 0, visited, weight, parent,0);
        for (int i = 1; i < V; i++) {
            System.out.println(Math.min(i, parent[i]) + " " + Math.max(i, parent[i]) + " " + weight[i]);
        }

    }
}