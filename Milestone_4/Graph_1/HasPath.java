import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Solution {

	public static void BFTraversal(int[][] adjMatrix, Queue<Integer> queue, boolean[] visited) {
		if (queue.peek() == null)
			return;
		for (int i = 0; i < visited.length; i++) {
			if (adjMatrix[queue.peek()][i] == 1 && !visited[i]) {
				queue.add(i);
				visited[i] = true;
			}
		}
		queue.poll();
		BFTraversal(adjMatrix, queue, visited);
	}

	public static void BFTraversal(int[][] adjMatrix, int v1, int v2) {
		Queue<Integer> queue = new LinkedList<>();
		boolean[] visited = new boolean[adjMatrix.length];
		queue.add(v1);
		visited[v1] = true;
		BFTraversal(adjMatrix, queue, visited);
		System.out.println(visited[v2]);
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int e = scanner.nextInt();
		if (n == 0)
			return;
		int[][] adjMatrix = new int[n][n];
		for (int i = 0; i < e; i++) {
			int v1 = scanner.nextInt();
			int v2 = scanner.nextInt();
			adjMatrix[v1][v2] = 1;
			adjMatrix[v2][v1] = 1;
		}
		int v1 = scanner.nextInt();
		int v2 = scanner.nextInt();
		if (v1 < 0 || v1 >= adjMatrix.length || v2 < 0 || v2 >= adjMatrix.length) {
			System.out.println(false);
			return;
		}
		BFTraversal(adjMatrix, v1, v2);
	}

}