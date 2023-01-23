public class Solution {
	int[][] a = { { 1, 0 }, { 0, 1 }, { -1, 0 }, { 0, -1 } };

	boolean validPoint(int x, int y, int n, int m) {
		return x >= 0 && y >= 0 && x < n && y < m;
	}

	boolean solve(String[] board, int x, int y, char ch, boolean[][] visited, int i, int j, int count) {
		if (count > 2 && x == i && y == j)
			return true;
		for (int k = 0; k < 4; k++) {
			x += a[k][0];
			y += a[k][1];

			if (validPoint(x, y, board.length, board[0].length()) && board[x].charAt(y) == ch && !visited[x][y]) {
				visited[x][y] = true;
				if (solve(board, x, y, ch, visited, i, j, count + 1))
					return true;
				visited[x][y] = false;
			}
			x -= a[k][0];
			y -= a[k][1];
		}
		return false;

	}

	int solve(String[] board, int n, int m) {
		boolean[][] visited = new boolean[n][m];
		for (char i = 'A'; i <= 'Z'; i++) {
			for (int j = 0; j < n; j++) {
				for (int k = 0; k < m; k++) {
					if (i == board[j].charAt(k)) {
						if (solve(board, j, k, i, visited, j, k, 0))
							return 1;
					}
				}
			}
		}
		return 0;
	}

}