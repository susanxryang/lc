public class numIslands200 {
    private static int r;
    private static int c;

    public static void main(String[] args) {
        char[][] grid = {
                { '1', '1', '0', '0', '0' },
                { '1', '1', '0', '0', '0' },
                { '0', '0', '1', '0', '0' },
                { '0', '0', '0', '1', '1' }
        };
        System.out.println(numIslands(grid));
    }

    public static int numIslands(char[][] grid) {
        r = grid.length;
        if (r == 0)
            return 0;
        c = grid[0].length;

        boolean[][] visited = new boolean[r][c];
        int count = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (visited[i][j] == false && grid[i][j] == '1') {
                    dfs(visited, grid, i, j);
                    count += 1;
                }
            }
        }

        return count;
    }

    public static void dfs(boolean[][] visited, char[][] grid, int i, int j) {
        if (i < 0 || i >= r || j < 0 || j >= c || grid[i][j] == '0' || visited[i][j]) {
            return;
        }
        visited[i][j] = true;
        dfs(visited, grid, i + 1, j);
        dfs(visited, grid, i - 1, j);
        dfs(visited, grid, i, j + 1);
        dfs(visited, grid, i, j - 1);
    }
}
