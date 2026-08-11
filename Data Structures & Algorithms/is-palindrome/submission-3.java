class Solution {
    public boolean isPalindrome(String s) {
        String sb = s.toLowerCase();
        int right = s.length()-1;
        int left = 0;

        while(right>left){
            while(right>left && !Character.isLetterOrDigit(sb.charAt(left))) left++;
            while(right>left && !Character.isLetterOrDigit(sb.charAt(right))) right--;
            if(sb.charAt(left) != sb.charAt(right)) return false;
            left++;
            right--;
        }

        return true;
    }
}
