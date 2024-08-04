class Solution {
    public String[] findWords(String[] words) {
        String a = "qwertyuiopQWERTYUIOP";           
        String b = "asdfghjklASDFGHJKL";            
        String c = "zxcvbnmZXCVBNM";   
        ArrayList<String> result = new ArrayList<>();        
        for (String word : words) {                    
            boolean found = true;
            char firstChar = word.charAt(0);            
            String row = (a.indexOf(firstChar) != -1) ? a : (b.indexOf(firstChar) != -1) ? b : c;          
            for (int j = 0; j < word.length(); j++) {
                if (row.indexOf(word.charAt(j)) == -1) {
                    found = false;
                    break;
                }
            }           
            if (found) {
                result.add(word);
            }
        }      
        return result.toArray(new String[result.size()]);
    }
}