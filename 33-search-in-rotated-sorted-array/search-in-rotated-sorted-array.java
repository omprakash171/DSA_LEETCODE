class Solution {
    static int findPivotIndex(int[] nums){
        int n = nums.length;
        int s = 0, e = n - 1, ans = -1;
        if(nums[s] < nums[e]){
            return -1;
        }
        while(s <= e){
            int mid = (s + e) / 2;
            if(nums[mid] <= nums[n - 1]){
                e = mid - 1;
            } else {
                ans = mid;
                s = mid + 1;
            }
        }
        return ans;
    }
    static int binarySearch(int[] nums, int start, int end, int target){
        while(start <= end){
            int mid = (start + end) / 2;
            if(nums[mid] == target){
                return mid;
            }
            if (nums[mid] > target){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
    public int search(int[] nums, int target) {
        int pivotIndex = findPivotIndex(nums);
        int n = nums.length;
        if(pivotIndex == -1){
            int ans = binarySearch(nums, 0, n - 1, target);
            return ans;
        }
        else {
            int startArr1 = 0;
            int endArr1 = pivotIndex;
            if(target >= nums[startArr1] && target <= nums[endArr1]){
                int ans = binarySearch(nums, startArr1, endArr1, target);
                return ans;
            }

            int startArr2 = pivotIndex + 1;
            int endArr2 = n - 1;
            if(target >= nums[startArr2] && target <= nums[endArr2]){
                int ans = binarySearch(nums, startArr2, endArr2, target);
                return ans;
            }
        }
        return -1;
    }
    
}