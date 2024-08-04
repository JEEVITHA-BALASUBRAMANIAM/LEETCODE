class Solution {
    public boolean divideArray(int[] nums) {
      boolean[] odd = new boolean[501];
        for (int n : nums)
            odd[n] = !odd[n];
        return Arrays.equals(odd, new boolean[501]);     
    
    }
}