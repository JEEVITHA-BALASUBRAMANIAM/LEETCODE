class Solution {
    public List<Integer> stableMountains(int[] height, int threshold) {
        int count=0;
        List<Integer> li=new ArrayList<>();
        for(int i=1;i<height.length;i++){
             if(height[i-1]>threshold){
                    li.add(i);
             }
        }
        return li;
    }
}