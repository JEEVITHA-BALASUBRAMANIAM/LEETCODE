class Solution {
    public String finalString(String s) {
        StringBuilder sb=new StringBuilder();
       
       for(char a:s.toCharArray()){
            if(a=='i'){
            sb.reverse();
            }
            else{
                sb.append(a);
            }
        }return sb.toString();
            }
}