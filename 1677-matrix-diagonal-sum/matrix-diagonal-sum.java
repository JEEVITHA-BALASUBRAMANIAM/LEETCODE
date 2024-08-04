class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        for(int i=0;i<mat.length;i++){
        for(int j=0;j<mat.length;j++){
            if(i==j){
                sum=sum+mat[i][j];
            }
            if(j==mat.length-i-1 && i!=j){
                 sum=sum+mat[i][j];
            }
        }
        }return sum;
    }
}