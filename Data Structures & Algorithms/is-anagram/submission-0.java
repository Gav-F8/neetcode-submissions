class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        
        char[] s_ = s.toCharArray();
        char[] t_ = t.toCharArray();

        Arrays.sort(s_);
        Arrays.sort(t_);

        for(int i = 0; i < s.length(); i++) {
            if(s_[i] != t_[i]) return false;
        }

        return true;
    }
}
