class Solution {
    public String sortSentence(String s) {
         StringBuilder str = new StringBuilder();
        String[] sp = s.split(" ");
        
        for(int i=1;i<=sp.length;i++) {
            for (String a:sp) {
                if (a.endsWith(String.valueOf(i))) {
                    str.append(a, 0, a.length()-1);
                    if(i!=sp.length)
                    str.append(" ");
                }
            }
        }
        return String.valueOf(str);
    }
}