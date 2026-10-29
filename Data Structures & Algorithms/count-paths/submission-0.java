class Solution {
    public int uniquePaths(int m, int n) {
        int[][] solution = new int[m][n];
        for (int i = 0; i < solution.length; i++){
            solution[i][0] = 1;
        }
        for (int i = 0; i < solution[0].length; i++){
            solution[0][i] = 1;
        }
        for (int i = 1; i < solution.length; i++){
            for (int j = 1; j < solution[0].length; j++){
                solution[i][j] = solution[i-1][j] + solution[i][j-1];
            }
        }
        return solution[m-1][n-1];
    }
}
