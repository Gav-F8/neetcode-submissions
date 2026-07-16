class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] res = new int[k];
        HashMap <Integer, Integer> map = new HashMap<>();

        Arrays.sort(nums);

        for(int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        for(int i = 0; i < k; i++) {
            int largestNum = 0;
            int mostFreaquent = 0;
            for(int num : map.keySet()) {
                if(map.get(num) > mostFreaquent) {
                    mostFreaquent = map.get(num);
                    largestNum = num;
                }
            }
            res[i] = largestNum;
            map.remove(largestNum);
        }

        return res;
    }
}
