class Solution {
    public String replaceDigits(String s) {
        int l = s.length();
        StringBuilder ans = new StringBuilder();

        for (int i = 1; i < l; i = i + 2) {
            ans.append(s.charAt(i - 1));
            ans.append((char) (s.charAt(i - 1)+s.charAt(i)-'0'));
        }

        if (l % 2 != 0)
         ans.append(s.charAt(l - 1));

        return String.valueOf(ans);
    }
}