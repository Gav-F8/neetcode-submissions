class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] freq = new int[128];
        int left = 0;

        int res = 0;

        for(int i = 0; i < s.length(); i++){
            freq[s.charAt(i)]++;
            while(freq[s.charAt(i)] > 1) {
                freq[s.charAt(left)]--;
                left++;
            }
            res = Math.max(res, i - left + 1);
        }
        return res;
    }
}
