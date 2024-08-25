class Solution {
    public int findComplement(int num) {
        return num ^ (1<<((int)(Math.log10(num) / Math.log10(2))+1))-1;
    }
}