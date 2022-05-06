
// Java code to implement the approach
import java.util.*;

class GFG {
	static int row;
	static int col;

	// A class to represent coordinates of
	// element in matrix
	static class Pair {
		int x;
		int y;

		Pair(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	// Function to find closest distance
	static void closestDistance(int[][] grid) {
		row = grid.length;
		col = grid[0].length;

		// List of coordinates
		// of all the islands
		ArrayList<ArrayList<Pair>> list = findIslands(grid);

		// Number of islands
		int n = list.size();

		System.out.println("Nombre d'Ile " + n);

		// Variable to store
		// minimum of all distances
		int ans = Integer.MAX_VALUE;
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				ArrayList<Pair> island1 = list.get(i);
				ArrayList<Pair> island2 = list.get(j);
				int dist = findDistance(island1,
						island2);
				ans = Math.min(dist, ans);
			}
		}
		System.out.println(ans);
	}

	// Function to find and
	// store all islands in list
	static ArrayList<ArrayList<Pair>> findIslands(int[][] grid) {

		boolean[][] visited = new boolean[row][col];
		ArrayList<ArrayList<Pair>> list = new ArrayList<>();
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (grid[i][j] == 1 && !visited[i][j]) {
					ArrayList<Pair> island = new ArrayList<>();
					dfs(visited, grid, i, j, island);
					list.add(island);
				}
			}
		}
		return list;
	}

	// Function to find min distance
	// between 2 islands
	static int findDistance(ArrayList<Pair> island1, ArrayList<Pair> island2) {
		int dist = Integer.MAX_VALUE;
		for (int i = 0; i < island1.size(); i++) {
			Pair point1 = island1.get(i);
			for (int j = 0; j < island2.size(); j++) {
				Pair point2 = island2.get(j);
				int distp1p2 = Math.abs(point1.x - point2.x)
						+ Math.abs(point1.y - point2.y)
						- 1;
				dist = Math.min(dist, distp1p2);
			}
		}
		return dist;
	}

	static int[] dirx = { 0, 1, 0, -1 };
	static int[] diry = { 1, 0, -1, 0 };

	static void dfs(boolean[][] visited, int[][] grid, int i, int j, ArrayList<Pair> island) {
		visited[i][j] = true;
		island.add(new Pair(i, j));
		for (int idx = 0; idx < 4; idx++) {
			int x = i + dirx[idx];
			int y = j + diry[idx];
			if (isValid(x, y) && grid[x][y] == 1 && !visited[x][y]) {
				dfs(visited, grid, x, y, island);
			}
		}
	}

	// Function to check if
	// a point is inside grid
	static boolean isValid(int x, int y) {
		if (x < 0 || x >= row || y < 0 || y >= col)
			return false;
		return true;
	}

	// Driver code
	public static void main(String[] args) {
		int[][] grid = { 
			{ 1, 0, 0, 0, 1 },
			{ 1, 1, 0, 0, 0 },
			{ 0, 0, 0, 0, 0 },
			{ 0, 0, 1, 1, 1 } 
		};
		closestDistance(grid);
	}
}
