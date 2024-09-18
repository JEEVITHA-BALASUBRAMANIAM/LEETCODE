class Solution {
    public boolean validPalindrome(String s) {
         int left = 0;
        int right = s.length() - 1;
        
        while (left < right) {
            if (s.charAt(left) == s.charAt(right)) {
                left++;
                right--;
            } else {
                if (isPalindrome(s, left + 1, right)) {
                    return true;
                }
                if (isPalindrome(s, left, right - 1)) {
                    return true;
                }
                return false;
            }
        }
        return true;
    }   
    boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}