class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
          ArrayList<List<Integer>>  li=new ArrayList<>();
          ArrayList<Integer> a=new ArrayList<>();
          ArrayList<Integer> b=new ArrayList<>();
          ArrayList<Integer> c=new ArrayList<>();
          ArrayList<Integer> d=new ArrayList<>();
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
          HashSet<Integer> g=new HashSet<>();
          HashSet<Integer> j=new HashSet<>();
          for(int u:d){
            g.add(u);
          }
          for(int t:b){
            j.add(t);
          }

          ArrayList<Integer> q=new ArrayList<>();
          ArrayList<Integer> w=new ArrayList<>();
          for(int r:g){
            q.add(r);
          }
          for(int y:j){
            w.add(y);
          }

          li.add(q);
          li.add(w);
       return li;
    }
}