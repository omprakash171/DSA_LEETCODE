class Solution {
    boolean twoSum(int arr[], int target) {
        // Bruteforce O(n^2)
        /*
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] + arr[j] == target){
                    return true;
                }
            }
        }
        return false;
        */
        // Optimal approach
        
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            int req = target - arr[i];
            if(map.containsKey(req)){
                return true;
            }
            map.put(arr[i], i);
        }
        return false;
    }
}