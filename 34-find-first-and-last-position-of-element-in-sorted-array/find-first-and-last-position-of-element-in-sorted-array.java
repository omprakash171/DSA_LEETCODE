class Solution {
    public static int findFirst(int[] nums, int target){
        int start = 0, end = nums.length - 1;
        int first = -1;
        while(start <= end){
            int mid = (start + end) / 2;
            if(nums[mid] == target){
                first = mid;
                end = mid - 1;
            } else if(nums[mid] > target){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return first;
    }
    public static int findLast(int[] nums, int target){
        int start = 0, end = nums.length - 1;
        int last = -1;
        while(start <= end){
            int mid = (start + end) / 2;
            if(nums[mid] == target){
                last = mid;
                start = mid + 1;
            } else if(nums[mid] > target){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
            
        }
        return last;
    }
    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];
        int first = findFirst(nums, target);
        if(first == -1){
            ans[0] = -1;
            ans[1] = -1;
            return ans;
        }
        int last = findLast(nums, target);
        ans[0] = first;
        ans[1] = last;
        return ans;
    }
}