package Algorithm.First.Day7;

public class MaxAreaOfIsland {
    public boolean[][] visitedFields;

    public int maxAreaOfIsland(int[][] grid) {
        visitedFields = new boolean[grid.length][grid[0].length];
        int maxSquare = 0;
        for (int i = 0; i < grid.length; ++i) {
            for (int j = 0; j < grid[0].length; ++j) {
                maxSquare = Math.max(maxSquare, diveIsland(grid, i, j, grid[i][j]));
            }
        }
        return maxSquare;
    }

    private int diveIsland(int[][] grid, int y, int x, int square) {
        if (y < 0 || x < 0 || x >= grid[0].length || y >= grid.length || visitedFields[y][x] || grid[y][x] == 0) {
            return 0;
        }
        visitedFields[y][x] = true;
        return 1 + diveIsland(grid, y - 1, x, square) +
                diveIsland(grid, y, x - 1, square) +
                diveIsland(grid, y, x + 1, square) +
                diveIsland(grid, y + 1, x, square);
    }
}
