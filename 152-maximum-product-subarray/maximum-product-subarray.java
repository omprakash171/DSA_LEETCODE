class Solution {
    public int maxProduct(int[] nums) {
        /* bruteforce O(n^3)
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            for(int j = i; j < nums.length; j++){
                int prod = 1;
                for(int k = i; k <= j; k++){
                    prod *= nums[k];
                }
                max = Math.max(prod, max);
            }
        }
        return max;
        */

        int prefix = 1, suffix = 1;
        int ans = Integer.MIN_VALUE;
        int n = nums.length;

        for(int i = 0; i < n; i++){
            if(prefix == 0) prefix = 1;
            if(suffix == 0) suffix = 1;
            prefix = prefix * nums[i];
            suffix = suffix * nums[n - i - 1];
            ans = Math.max(ans, Math.max(prefix, suffix));
        }
        return ans;
    }
}