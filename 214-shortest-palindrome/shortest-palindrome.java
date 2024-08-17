class Solution {
    public String shortestPalindrome(String s) {
        StringBuilder r = new StringBuilder(s).reverse();
        for (int i = 0; i <= s.length(); i++) {
            if (s.startsWith(r.substring(i))) {
                return r.substring(0, i) + s;
            }
        }
        return ""; 
    }
}