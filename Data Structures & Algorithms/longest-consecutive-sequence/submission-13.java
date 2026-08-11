class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;


        Set<Integer> set = new HashSet<>();

        for(int i : nums) set.add(i);
        int longest = 0;
        for(int i : set){
            if(!set.contains(i - 1)){
                int current = i;
                int length = 1;

                while(set.contains(current + 1)){
                    current++;
                    length++;
                }

                longest = Math.max(longest, length);
            }
        }
        return longest;
    // int min = nums[0];
    // int lastNum = nums[0];
    // int currentMax = 1;
    // int res = 1;

    //     for(int i = 0; i < nums.length; i++){
    //         if(nums[i] == lastNum+1){
    //             currentMax++;
    //             lastNum++;
    //             i = 0;
    //         }

    //         if(nums[i] < min){
    //             min = nums[i];
    //             lastNum = nums[i];
    //             currentMax = 1;
    //             i = 0;
    //         }
            
    //         res = Math.max(res, currentMax);
    //     }

    //     return res;
    }
}
