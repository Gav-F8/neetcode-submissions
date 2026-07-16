class Solution {
    public boolean hasDuplicate(int[] nums) {
            HashSet<Integer> set = new HashSet<>();
        for(int n : nums) {
            if(set.add(n)) continue;
            else return true;
        }
        return false;
    }
}