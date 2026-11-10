class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        //tabulation
        /*
        if(n == 1){
            return nums[0];
        }
        int[] dp = new int[n];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for(int i = 2; i < n; i++){
            int pick = nums[i] + dp[i - 2];
            int notPick = 0 + dp[i - 1];
            dp[i] = Math.max(pick, notPick);
        }
        return dp[n - 1];
        */

        //space optimized tabulation
        if(n == 1){
            return nums[0];
        }
        int p2 = nums[0];
        int p1 = Math.max(nums[0], nums[1]);
        
        int cur = p1;
        for(int i = 2; i < n; i++){
            int pick = nums[i] + p2;
            int notPick = 0 + p1;
            cur = Math.max(pick, notPick);
            p2 = p1;
            p1 = cur;
        }
        return cur;
    }
}