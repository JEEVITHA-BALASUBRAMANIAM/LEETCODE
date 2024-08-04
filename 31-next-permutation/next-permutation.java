class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int ind=-1,i;
        for(i=n-1;i>0;i--){
            if(nums[i-1]<nums[i]){
                ind=i-1;
                break;
            }
        }
        if(ind!=-1){
            for(i=n-1;i>=ind+1;i--){
                if(nums[i]>nums[ind]){
                    int temp=nums[i];
                    nums[i]=nums[ind];
                    nums[ind]=temp;
                    break;
                }
            }
        }
        int start=ind+1,end=n-1;
        while(start<=end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
}