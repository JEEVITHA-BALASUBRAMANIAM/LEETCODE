class Solution {
    public boolean isSubsequence(String s, String t) {
        int count=0;
          int  start=0;
        for(int i=0;i<s.length();i++){
            for(int j=start;j<t.length();j++){
               if(s.charAt(i)==t.charAt(j)){
                  count++;
                  start=j+1;
                  j=t.length();
               }
               
            }
        }

       if(count==s.length())
        return true;
        else
        return false;
    }
}