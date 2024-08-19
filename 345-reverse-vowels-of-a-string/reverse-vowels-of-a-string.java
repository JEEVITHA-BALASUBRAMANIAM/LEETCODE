class Solution {
    public String reverseVowels(String s) {
      char a[]=s.toCharArray();
      int f=0,l=a.length-1;
      while(f<l){
        if(isVowel(a[f]) &&isVowel(a[l])){
            char temp=a[l];
            a[l]=a[f];
            a[f]=temp;
            f++;
            l--;
        }
        else if(!isVowel(a[f]) && isVowel(a[l])){
            f++;
        }
        else if(isVowel(a[f]) &&!isVowel(a[l])){
            l--;
        }
        else{
            f++;
            l--;
        }
      }
       String h=new String(a);
       return h; 
    }
    public static boolean isVowel(char d){
        boolean j=false;
     char b[]={'a','e','i','o','u','A','E','I','O','U'};
     for(int i=0;i<b.length;i++){
        if(d==b[i])
         j= true;
     }
     return j;
    }
}