class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;

        int[] prev = new int[n];
        int[] cur = new int[n];

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(obstacleGrid[i][j] == 1){
                    cur[j] = 0;
                } else if(i == 0 && j == 0){
                    cur[j] = 1;
                } else {
                    int right = 0;
                    int down = 0;
                    if(j > 0){
                        right = cur[j - 1];
                    }
                    if(i > 0){
                        down = prev[j];
                    }
                    cur[j] = right + down;
                }
            }
            for(int j = 0; j < n; j++){
                prev[j] = cur[j];
            }
        }
        return cur[n - 1];
    }
}