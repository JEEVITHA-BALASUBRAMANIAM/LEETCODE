class Solution {
    public boolean canAliceWin(int[] nums) {
        List<Integer> a=new ArrayList<>();
         List<Integer> b=new ArrayList<>();
        
        for(int i=0;i<nums.length;i++){
            String s=Integer.toString(nums[i]);
            if(s.length()==1){
                a.add(nums[i]);
            }
            if(s.length()==2){
                b.add(nums[i]);
            }
            
        }
        int sum=0;
        int sum1=0;
        for(int d:a ){
            sum=sum+d;
        }
        for(int g:b ){
            sum1=sum1+g;
        }

        if(sum>sum1 || sum1>sum){
            return true;
        }
        return false;
    }
}