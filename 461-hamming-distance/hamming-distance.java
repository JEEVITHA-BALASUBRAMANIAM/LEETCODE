class Solution {
    public int hammingDistance(int x, int y) {
        int val = x ^ y;
        int count = 0;
        while(val != 0)
        {
            int bit = val & 1;
            if(bit == 1) 
            count++;
            val >>= 1;
        }
        return count;

    }
}