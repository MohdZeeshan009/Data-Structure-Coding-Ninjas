import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Solution {

	public static void BFTraversal(int[][] adjMatrix, Queue<Integer> queue, boolean[] visited) {
		if (queue.peek() == null)
			return;
		System.out.print(queue.peek() + " ");
		for (int i = 0; i < visited.length; i++) {
			if (adjMatrix[queue.peek()][i] == 1 && !visited[i]) {
				queue.add(i);
				visited[i] = true;
			}
		}
		queue.poll();
		BFTraversal(adjMatrix, queue, visited);
	}

	public static void BFTraversal(int[][] adjMatrix) {
		Queue<Integer> queue = new LinkedList<>();
		boolean[] visited = new boolean[adjMatrix.length];
		for (int i = 0; i < visited.length; i++)
			if (!visited[i]) {
				queue.add(i);
				visited[i] = true;
				BFTraversal(adjMatrix, queue, visited);
			}
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
		BFTraversal(adjMatrix);
	}

}