class Solution {
    public int countAsterisks(String s) {
        int count=0,ans=0;
        for(char ch:s.toCharArray()){
           if(ch=='|')
           count++;
           if(count%2==0){
               if(ch=='*')
               ans++;
           }
        }
        return ans; 
    }
}