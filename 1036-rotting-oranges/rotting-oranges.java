class Solution {
    class Pair {
        int i, j;
        int time;
        Pair(int i, int j, int time) {
            this.i = i;
            this.j = j;
            this.time = time;
        }
    }

    private boolean isValid(int nr, int nc, int rows, int cols, boolean[][] vis, int[][] mat) {
        return nr >= 0 && nc >= 0 && nr < rows && nc < cols && !vis[nr][nc] && mat[nr][nc] == 1;
    }

    public int orangesRotting(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        boolean[][] vis = new boolean[m][n];
        Queue<Pair> q = new LinkedList<>();
        int fresh = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 2) {
                    q.add(new Pair(i, j, 0));
                    vis[i][j] = true;
                }
                if (grid[i][j] == 1) fresh++;
            }
        }

        int[] dr = {0, 1, 0, -1};
        int[] dc = {1, 0, -1, 0};
        int time = 0;

        while (!q.isEmpty()) {
            Pair curr = q.poll();
            time = curr.time;

            for (int i = 0; i < 4; i++) {
                int nr = curr.i + dr[i];
                int nc = curr.j + dc[i];
                if (isValid(nr, nc, m, n, vis, grid)) {
                    vis[nr][nc] = true;
                    q.add(new Pair(nr, nc, curr.time + 1));
                    fresh--;
                }
            }
        }

        return fresh == 0 ? time : -1;
    }
}