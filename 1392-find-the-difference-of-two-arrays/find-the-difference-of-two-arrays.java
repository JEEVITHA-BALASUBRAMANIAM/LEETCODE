class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
          ArrayList<List<Integer>>  li=new ArrayList<>();
          ArrayList<Integer> a=new ArrayList<>();
          HashSet<Integer> b=new HashSet<>();
          ArrayList<Integer> c=new ArrayList<>();
          HashSet<Integer> d=new HashSet<>();
          for(int s:nums1){
            a.add(s);
          }
          for(int f:nums2){
            c.add(f);
          }
          for(int i=0;i<nums2.length;i++){
             if(!a.contains(nums2[i])){
                 b.add(nums2[i]);
             }
          }

          for(int i=0;i<nums1.length;i++){
             if(!c.contains(nums1[i])){
                 d.add(nums1[i]);
             }
          }

          ArrayList<Integer> q=new ArrayList<>();
          ArrayList<Integer> w=new ArrayList<>();
          for(int r:b){
            q.add(r);
          }
          for(int y:d){
            w.add(y);
          }

          li.add(w);
          li.add(q);
       return li;
    }
}