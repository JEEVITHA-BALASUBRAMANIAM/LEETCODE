class Solution {
    public String longestPalindrome(String s) {
        if (s.length()==0) {
            return "";
        }

        int start=0,end=0;
        for (int i=0;i<s.length();i++) {
            
            int odd=solve(s,i,i);          
            int even=solve(s,i,i+1);        
            int len=Math.max(odd,even);
          
            if (len>end-start) {
                start=i-(len-1)/2;
                end=i+len/2;
            }
        }     
        return s.substring(start,end+1);
    }
   
    private int solve(String s,int left,int right) {
        int flag=0;
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
             
                   left--;
                   right++;
               
            }
        
       
        return right-left-1;  
    }
}
