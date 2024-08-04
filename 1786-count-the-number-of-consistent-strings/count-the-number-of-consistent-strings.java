class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count=0;
        int flag=0;
        for(int i=0;i<words.length;i++){
            for(int j=0;j<words[i].length();j++){
                for(int k=0;k<allowed.length();k++){
            if(words[i].charAt(j)==allowed.charAt(k)){
              flag=0;
              break;
            
            }else{
                flag = flag + 1;
            }
        }
        if (flag > 0) {
                    break;
                }
        }
         if (flag == 0) {
                count = count + 1;
            }
            flag = 0;
        }
        return count;
    }
}