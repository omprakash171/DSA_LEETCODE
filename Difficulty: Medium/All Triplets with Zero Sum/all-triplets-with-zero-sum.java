class Solution {
    public List<List<Integer>> findTriplets(int[] arr) {
        // Your code here
        int n = arr.length;
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0; i <= n - 3; i++){
            for(int j = i + 1; j <= n - 2; j++){
                for(int k = j + 1; k <= n - 1; k++){
                    if(arr[i] + arr[j] + arr[k] == 0){
                        List<Integer> temp = new ArrayList<>();
                        temp.add(i);
                        temp.add(j);
                        temp.add(k);
                        ans.add(temp);
                    }
                }
            }
        }
        return ans;
    }
}