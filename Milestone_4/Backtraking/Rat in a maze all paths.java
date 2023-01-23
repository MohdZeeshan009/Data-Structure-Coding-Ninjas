public class Solution {

    public static void ratInAMaze(int[][] maze, int[][] path, int i, int j,int n) {
        if (i < 0 || i >= n || j < 0 || j >= n || maze[i][j] == 0 || path[i][j] == 1) return;
        path[i][j] = 1;
        if (i == n - 1 && j == n - 1) {
            for (int r=0;r<n;r++){
                for (int c=0;c<n;c++){
                    System.out.print(path[r][c]+" ");
                }
            }
            System.out.println();
            path[i][j] = 0;
            return;
        }
        ratInAMaze(maze, path, i - 1, j,n);
        ratInAMaze(maze, path, i, j + 1,n);
        ratInAMaze(maze, path, i + 1, j,n);
        ratInAMaze(maze, path, i, j - 1,n);
        path[i][j]=0;
    }

    public static void ratInAMaze(int[][] maze, int n) {
        ratInAMaze(maze, new int[n][n], 0, 0,n);
    }
}
