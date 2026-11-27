class Solution {
    public static boolean helper(String s, String t){
        HashMap<Character, Character> map = new HashMap<>();
        int n = s.length();
        for(int i = 0; i < n; i++){
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), t.charAt(i));
            } else if(!map.get(s.charAt(i)).equals(t.charAt(i))){
                return false;
            }
        }
        return true;
    }
    public boolean isIsomorphic(String s, String t) {
        return helper(s, t) && helper(t, s);

    }
}