class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int[][] newArr = new int[image.length][image[0].length];
        for(int i=0;i<image.length;i++){
        for(int j=image[0].length-1;j>=0;j--){
             newArr[i][ image[0].length- 1 - j] = 1 - image[i][j];
            
        
        }
        }return newArr;
    }
}