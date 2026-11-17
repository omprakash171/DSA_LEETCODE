class Solution {
    public int uniquePaths(int m, int n) {
        //Tablulation
        int[] prior = new int[n];
        int[] cur = new int[n];
        for(int j = 0; j < n; j++){
            prior[j] = 1;
            cur[j] = 1;
        }
       

        for(int i = 1; i < m; i++){
            for(int j = 1; j < n; j++){
                cur[j] = cur[j - 1] + prior[j];
            }
            for(int j = 0; j < n; j++){
                prior[j] = cur[j];
            }
        }
        return cur[n - 1];


    }
}