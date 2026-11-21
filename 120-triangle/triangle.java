class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int[] prev = new int[n];
        int[] cur = new int[n];

        for(int i = 0; i < n; i++){
            prev[i] = triangle.get(n - 1).get(i);
        }

        for(int i = n - 2; i >= 0; i--){
            for(int j = 0; j <= i; j++){
                int down = prev[j];
                int diag = prev[j + 1];
                cur[j] = triangle.get(i).get(j) + Math.min(down, diag);
            }
            for(int j = 0; j <= i; j++){
                prev[j] = cur[j];
            }
        }
        return prev[0];
    }
}