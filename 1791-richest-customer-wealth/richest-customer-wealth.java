class Solution {
    public int maximumWealth(int[][] accounts) {
        int m = accounts.length;
        int n = accounts[0].length;
        int ms = 0;
        for(int i = 0; i < m; i++){
            int cs = 0;
            for(int j = 0; j < n; j++){
                cs += accounts[i][j];
                ms = Math.max(cs, ms);
            }
        }
        return ms;
    }
}