public class Solution {

    int[][] a = {{-1, -1}, {-1, 0}, {0, -1}, {0, 1}, {1, 0}, {1, 1}, {-1, 1}, {1, -1}};

    boolean validPoint(int x, int y, int N, int M) {
        return x >= 0 && y >= 0 && x < N && y < M;
    }

    boolean solve(Character[][] characters, int x, int y, String s, boolean[][] visited) {
        if (s.length() == 0) return true;
        for (int i = 0; i < 8; i++) {
            int newX = x + a[i][0];
            int newY = y + a[i][1];
            if (validPoint(newX, newY, characters.length, characters[0].length) && characters[newX][newY] == s.charAt(0) && !visited[newX][newY]) {
                visited[newX][newY] = true;
                if (solve(characters, newX, newY, s.substring(1), visited)) return true;
                visited[newX][newY] = false;
            }
        }
        return false;
    }

    int solve(String[] Graph, int N, int M) {
        Character[][] characters = new Character[N][M];
        int x, y;
        boolean[][] visited = new boolean[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                characters[i][j] = Graph[i].charAt(j);
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (characters[i][j] == 'C') {
                    x = i;
                    y = j;
                    visited[i][j] = true;
                    if (solve(characters, x, y, "ODINGNINJA", visited)) return 1;
                    visited[i][j] = false;
                }
            }
        }
        return 0;
    }

}