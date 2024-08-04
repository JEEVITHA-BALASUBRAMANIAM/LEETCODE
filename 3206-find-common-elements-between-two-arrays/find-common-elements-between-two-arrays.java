class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
    int count=0;
    int[] res = new int[2];
       int  n = nums1.length;
       int  m = nums2.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(nums1[i]==nums2[j]){
                    count++;
                    break;
                    }
                }
            } 
        res[0]=count;
        

        count=0;
        for(int i=0;i<nums2.length;i++)
        {
            for(int j=0;j<nums1.length;j++)
            {
                if(nums1[j]==nums2[i])
                {
                    count++;
                    break;
                }
            }
        }
        res[1]=count;
        
        return res;
    }
}