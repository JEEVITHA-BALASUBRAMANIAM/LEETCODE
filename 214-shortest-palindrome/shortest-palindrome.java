//class Solution {
    //public String shortestPalindrome(String s) {
        // StringBuilder r = new StringBuilder(s).reverse();
        // for (int i = 0; i <s.length(); i++) {
        //     if (s.startsWith(r.substring(i))) {
        //         return r.substring(0, i) + s;
        //     }
        // }
        // return ""; 
//     }
// }


class Solution
{
    public String shortestPalindrome(String s) 
    {
    
    if(s.length()==0){
        return "";
    }
    int maxLen=0;
    for(int i=s.length()-1;i>=0;i--){
       if(solve(s,0,i)){
            maxLen=i+1;
            break;
       }
    }
    String suffix=s.substring(maxLen);
    String prefix=new StringBuilder(suffix).reverse().toString();
    return prefix+s;
    }

   public static boolean solve(String s,int left,int right){
    while(left < right){
        if(s.charAt(left)!=s.charAt(right)){
        return false;
        }
    left++;
    right--;
    }
    return true;
   }
}