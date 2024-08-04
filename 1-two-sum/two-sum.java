class Solution {
    public int[] twoSum(int[] arr, int target) {
       int n=arr.length;
       int[] a=new int[2];
       HashMap<Integer,Integer> map=new HashMap<>();
       int i;
       for(i=0;i<=n-1;i++){
        int key=target-arr[i];
        if(map.containsKey(key)){
            a[0]=map.get(key);
            a[1]=i;
            return a;
        }
        map.put(arr[i],i);
       } 
       return a;
    }
}