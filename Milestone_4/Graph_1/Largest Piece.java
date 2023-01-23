public class Solution {

	static int[][] dir = { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };

	static boolean validPoint(int x, int y, int n) {
		return x < n && y < n && x >= 0 && y >= 0;
	}

	static int solve(String[] board, int x, int y, boolean[][] visited, int count) {
		for (int k = 0; k < 4; k++) {
			x += dir[k][0];
			y += dir[k][1];

			if (validPoint(x, y, board.length) && board[x].charAt(y) == '1' && !visited[x][y]) {
				visited[x][y] = true;
				int i = solve(board, x, y, visited, count + 1);
				if (i > count)
					count = i;
			}
			x -= dir[k][0];
			y -= dir[k][1];
		}
		return count;
	}

	public static int dfs(String[] edge, int n) {
		boolean[][] visited = new boolean[n][n];
		int count = 0;
		for (int j = 0; j < n; j++) {
			for (int k = 0; k < n; k++) {
				if (edge[j].charAt(k) == '1') {
					visited[j][k] = true;
					int i = solve(edge, j, k, visited, 1);
					if (i > count)
						count = i;
				}
			}
		}
		return count;
	}

}