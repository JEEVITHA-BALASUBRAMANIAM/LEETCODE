class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> li=new ArrayList<>();
        ArrayList<Integer> st=new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            li.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            if(li.contains(nums2[i])){
                st.add(nums2[i]);
                li.remove((Integer) nums2[i]);
            }
        }
        int[] arr=new int[st.size()];
        int index=0;
        for(int s:st){
            arr[index++]=s;
        }
       return arr;
    }
}