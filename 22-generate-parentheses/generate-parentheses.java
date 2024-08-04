class Solution {
    public void solve (int n,String str,List<String> result,int open_count,int close_count){
        if(open_count==n && close_count==n){
            result.add(str);
        }
        else{
            if(open_count<n){
                solve(n,str+"(",result,open_count+1,close_count);
            }
            if(open_count>close_count){
                solve(n,str+")",result,open_count,close_count+1);
            }
        }
    }
    
    public List<String> generateParenthesis(int n) {
        List<String> result=new ArrayList<>();
        String str="";
        solve(n,str,result,0,0);
        return result;
    }
}