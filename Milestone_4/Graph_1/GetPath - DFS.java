import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;
public class Solution {

	public static void dfTraversal(int adjMatrix[][], boolean visited[], String s, int a, int b) {

		visited[a] = true;
		if (a == b) {
			System.out.println(b + " " + s);
			return;
		}
		for (int i = 0; i < adjMatrix.length; i++) {
			if (adjMatrix[a][i] == 1 && !visited[i]) {
				dfTraversal(adjMatrix, visited, a + " " + s, i, b);
			}
		}
	}

	public static void dfTraversal(int adjMatrix[][], int a, int b) {
		dfTraversal(adjMatrix, new boolean[adjMatrix.length], "", a, b);
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
        
        /* Write Your Code Here
		 * Complete the Rest of the Program
		 * You have to take input and print the output yourself
		 */
		Scanner sc = new Scanner(System.in);
		int v = sc.nextInt();
		int e = sc.nextInt();

		int adjMatrix[][] = new int[v][v];
		if (v==0)return;
		for (int i = 0; i < e; i++) {
			int v1 = sc.nextInt();
			int v2 = sc.nextInt();
			adjMatrix[v1][v2] = 1;
			adjMatrix[v2][v1] = 1;
		}

		int a = sc.nextInt();
		int b = sc.nextInt();
		if (a < 0 || a > adjMatrix.length || b < 0 || b > adjMatrix.length) {
			return;
		}
		dfTraversal(adjMatrix, a, b);
	}
}