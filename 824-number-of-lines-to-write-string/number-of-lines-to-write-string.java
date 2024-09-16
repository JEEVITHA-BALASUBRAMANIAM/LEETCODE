class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int res1=0,res0=0;
        int length = s.length();
        for(int i=0;i<length;i++){
            res1+=widths[s.charAt(i)-'a'];
            if(res1>100){
                res0++;
                res1=0;
                i--;
            }
        }
        return new int[]{res0+1,res1};
    }
}