import java.util.Arrays;
import java.util.Scanner;

public class Solution {

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
		int[] distance = new int[V];
		Arrays.fill(distance, Integer.MAX_VALUE);
		distance[0] = 0;
		for (int i = 0; i < adjMatrix.length; i++) {
			int minVertex = -1;
			for (int j = 0; j < adjMatrix.length; j++) {
				if (!visited[j] && (minVertex == -1 || distance[minVertex] > distance[j])) {
					minVertex = j;
				}
			}
			visited[minVertex] = true;
			for (int j = 0; j < adjMatrix.length; j++) {
				if (!visited[j] && adjMatrix[minVertex][j] != 0
						&& distance[j] > distance[minVertex] + adjMatrix[minVertex][j]) {
					distance[j] = distance[minVertex] + adjMatrix[minVertex][j];
				}
			}
		}
		for (int i = 0; i < adjMatrix.length; i++) {
			System.out.println(i + " " + distance[i]);
		}
	}
}