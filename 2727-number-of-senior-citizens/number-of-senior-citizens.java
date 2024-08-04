class Solution {
    public int countSeniors(String[] details) {
        int count =0;
        for(int i=0;i<details.length;i++){
            String a=details[i];         
                if((a.charAt(11))=='6' && (a.charAt(12))=='0'){
                    continue;               
                }
                else if((a.charAt(11))>='6'){
                    count++;
                }
        }
        return count;
    }
}