class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0;
        int res = 0;
        int[] freq = new int[128];
        int maxFreq = 0;
        
        for(int i = 0; i < s.length(); i++){
            freq[s.charAt(i)]++;
            maxFreq = Math.max(maxFreq, freq[s.charAt(i)]);
            while(i - left + 1 > maxFreq+k){
                freq[s.charAt(left)]--;
                left++;
            }
            res = Math.max(res, i - left + 1);
        }
        return res;
    }
}
