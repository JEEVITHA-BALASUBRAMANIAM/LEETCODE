class Solution {
    public boolean find(String a, String b){
        int i=0, j=0;
        while(i<a.length() && j<b.length()){
            if (a.charAt(i)==b.charAt(j++)) 
                i++;
        } 
        return i==a.length();
    }
    public int findLUSlength(String[] strs) {
        int res=-1, n=strs.length;
        for (int i=0; i<n; i++){
            if (strs[i].length()<res)
                continue;
            int j=-1;
            while(++j<n){
                if (i!=j && find(strs[i], strs[j]))
                    break;
            } 
                
            if (j==n) {
                res=Math.max(res, strs[i].length());
            }
        }
        return res;
    }
}