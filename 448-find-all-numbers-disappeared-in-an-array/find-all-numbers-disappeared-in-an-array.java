class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        boolean[] a=new boolean[nums.length];
        List<Integer> li=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            a[nums[i]-1]=true; 
        }
        for(int i=0;i<a.length;i++){
            if(!a[i]){
                li.add(i+1);
            }
        }
        return li;
    }
}