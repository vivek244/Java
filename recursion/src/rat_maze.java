import java.util.ArrayList;
import java.util.Scanner;

public class rat_maze {

    private static void insertCurrentState(int[][] solution, ArrayList<ArrayList<Integer>> ans, int n) {
        // Insert the solution matrix element by element in the ans.
        ArrayList<Integer> currentState = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                currentState.add(solution[i][j]);
            }
        }
        ans.add(currentState);

    }

    private static void solveMaze(int[][] maze, int[][] solution, ArrayList<ArrayList<Integer>> ans, int x, int y,
            int n) {
        // Base case that we reach our destination.
        if (x == n - 1 && y == n - 1) {
            solution[x][y] = 1;
            // Call to add the updated solution matrix in 'ANS'.
            insertCurrentState(solution, ans, n);
            return;
        }

        // Condition of out of boundary of the maze.
        if (x > n - 1 || x < 0 || y > n - 1 || y < 0) {
            return;
        }

        /*
         * Condition for 'MAZE[x][y]==0' - if that particular cell is block.
         * 'SOLUTION[x][y]'' == 1 - if it is already visited or already we go through
         * it.
         */
        if (maze[x][y] == 0 || solution[x][y] == 1) {
            return;
        }

        // No problem comes in visiting this cell so visit it.
        solution[x][y] = 1;

        // Recursive calls to all directions(call to function having same name with diff
        // value of params).
        // Up move.
        solveMaze(maze, solution, ans, x - 1, y, n);
        // Down move.
        solveMaze(maze, solution, ans, x + 1, y, n);
        // Left move.
        solveMaze(maze, solution, ans, x, y - 1, n);
        // Right move.
        solveMaze(maze, solution, ans, x, y + 1, n);

        // Backtracking if there is no further path exists.
        solution[x][y] = 0;
    }

    public static void ratInAMaze(int maze[][], int n) {
        int[][] solution = new int[n][n];

        // Vector used to store all the paths.
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        // Final call to function to print the solutions.
        solveMaze(maze, solution, ans, 0, 0, n);
        int[][] res = ans.stream().map(u -> u.stream().mapToInt(i -> i).toArray()).toArray(int[][]::new);

        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[i].length; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
        // for (int i = 0; i < ans.size(); i++) {
        // System.out.println(ans.get(i) + " ");
        // }
        // Return the updated ans.
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        ratInAMaze(arr, n);
        sc.close();
    }

}
