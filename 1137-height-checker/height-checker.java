class Solution {
    public int heightChecker(int[] heights) {
        int[] a=new int[heights.length];
        for(int i=0;i<heights.length;i++){
            a[i]=heights[i];
        }
        Arrays.sort(a);
        int count=0;
        for(int i=0;i<a.length;i++){
            if(heights[i]!=a[i]){
                count++;
            }
        }
       return count;
    }
}