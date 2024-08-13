class Solution {
 public char findTheDifference(String s, String t) {
       int sum1=0,sum2=0;
       for(int i=0;i<t.length();i++){
         sum1=sum1+t.charAt(i);
       }
       for(int i=0;i<s.length();i++){
         sum2=sum2+s.charAt(i);
       }
      int sum3 =sum1-sum2;
      return (char) sum3;
    }
};