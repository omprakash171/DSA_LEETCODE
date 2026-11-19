class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[] prev = new int[n];
        int[] cur = new int[n];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(i == 0 && j == 0){
                    cur[0] = grid[0][0];
                } else {
                    int right = Integer.MAX_VALUE;
                    int down = Integer.MAX_VALUE;
                    if(j > 0){
                        right = cur[j-1];
                    }
                    if(i > 0){
                        down = prev[j];
                    }
                    cur[j] = grid[i][j] + Math.min(right, down);
                }
            }
            for(int j = 0; j < n; j++){
                prev[j] = cur[j];
            }
        }
        return cur[n - 1];
    }
}