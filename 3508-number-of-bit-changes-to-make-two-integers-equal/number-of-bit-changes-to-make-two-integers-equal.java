class Solution {
    public int minChanges(int n, int k) {
        if ((n | k) != n) {
            return -1;
        }
        int a=(n^k);
        int count=0;
        while(a!=0){
            if((a&1)==1){
                count++;
            }
            a=a>>1;
        }
return count;
    }
}