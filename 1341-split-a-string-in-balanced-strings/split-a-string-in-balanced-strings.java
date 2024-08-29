class Solution {
    public int balancedStringSplit(String s) {
        int count = 0;
        int chr = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'R') 
            chr++; 
            else 
            chr--;
            if (chr == 0) 
            count++;
        }
        return count;
        
    }
}