class Solution {
    public void reverse(int[] arr, int s, int e) {
      while(s<=e)  {
        int temp=arr[s];
        arr[s]=arr[e];
        arr[e]=temp;
        s++;
        e--;
      }
    }
    public void rotate(int[] arr, int k) {
        int n= arr.length;
        k=k%n;
        reverse(arr,0,n-k-1);
        reverse(arr,n-k,n-1);
        reverse(arr,0,n-1);
    }
}