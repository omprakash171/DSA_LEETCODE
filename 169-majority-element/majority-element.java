class Solution {
    public int majorityElement(int[] nums) {
        //Bruteforce
        /*
        for(int i = 0; i < nums.length; i++){
            int count = 0;
            for(int j = 0; j < nums.length; j++){
                if(nums[j] == nums[i]){
                    count++;
                }
            }
            if(count > nums.length / 2){
                return nums[i];
            }
        }
        return -1;
        */

        //Better - usning hashmap
        int threshold = nums.length / 2;
        HashMap<Integer, Integer> frequencies = new HashMap<>();
        for(int value : nums){
            int updatedFrequency = frequencies.getOrDefault(value, 0) + 1;
            frequencies.put(value, updatedFrequency);
            if(updatedFrequency > threshold){
                return value;
            }
        }
        return -1;
    }
}