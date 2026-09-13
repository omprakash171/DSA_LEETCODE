class Solution {
    public int missingNumber(int[] nums) {
        int xor = 0;
        for(int num : nums){
            xor ^= num;
        }
        int n = nums.length;
        for(int i = 0; i <= n; i++){
            xor ^= i;
        }
        return xor;
    }
}