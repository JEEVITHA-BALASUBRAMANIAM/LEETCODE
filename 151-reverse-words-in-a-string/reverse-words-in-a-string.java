class Solution {
    public String reverseWords(String s) {
        String str="";
        String[] a=s.split("\\s+");
        for(int i=a.length-1;i>=0;i--){
            str=str+a[i]+" ";
        }
        return str.trim();      
    }
}