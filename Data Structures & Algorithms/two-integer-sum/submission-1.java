class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int n = 0; n < nums.length; n++) {
            int required = target-nums[n];
            if(map.containsKey(required)){
                return new int[] {map.get(required), n};
            }
            else{
                map.put(nums[n], n);
            }
        }
        return new int[] {-1, -1};
    }
}