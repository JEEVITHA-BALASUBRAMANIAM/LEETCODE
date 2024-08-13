class Solution {
public:
    char findTheDifference(string s, string t) {
       int sum1=0,sum2=0;
       for(int i=0;i<t.length();i++){
         sum1=sum1+t[i];
       }
       for(int i=0;i<s.length();i++){
         sum2=sum2+s[i];
       }
      int sum3 =sum1-sum2;
      return (char) sum3;
    }
};