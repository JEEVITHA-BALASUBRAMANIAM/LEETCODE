class Solution {
    public int[][] largestLocal(int[][] grid) {
        int[][] res=new int[grid.length-2][grid.length-2];
        for(int i=0;i<res.length;i++){
            for(int j=0;j<res.length;j++){

            int largest = Integer.MIN_VALUE;
                for (int row = i; row < i + 3; ++row) {
                    for (int column = j; column < j + 3; ++column) {
                        largest = Math.max(largest, grid[row][column]);
                    }
                }
                res[i][j] = largest;
            }
        } return res;
    }
}