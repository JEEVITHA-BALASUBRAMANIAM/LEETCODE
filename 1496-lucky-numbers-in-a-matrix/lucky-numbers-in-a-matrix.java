class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
     
    int ans=Integer.MAX_VALUE;
    int res=Integer.MIN_VALUE;
    int ans1=Integer.MIN_VALUE;
     int res1=Integer.MAX_VALUE;

    List<Integer> li=new ArrayList<>();
    int m=matrix.length;
    int n=matrix[0].length;
    for(int i=0;i<m;i++){
      ans=Integer.MAX_VALUE;
    for(int j=0;j<n;j++){
      if(matrix[i][j]<ans){
          ans=matrix[i][j];
}
}
      if(res<ans){
          res=ans;
}
}

    for(int i=0;i<n;i++){
      ans1=Integer.MIN_VALUE;
    for(int j=0;j<m;j++){
      if(matrix[j][i]>ans1){
          ans1=matrix[j][i];
}
}
      if(res1>ans1){
          res1=ans1;
}
}

if(res==res1)
li.add(res);

return li;
    }
}

    