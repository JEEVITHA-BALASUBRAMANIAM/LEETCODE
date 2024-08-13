class Solution {
    public boolean isAcronym(List<String> words, String s) {
        StringBuilder nm=new StringBuilder();
        for(int i=0;i<words.size();i++)
        {
            nm.append(words.get(i).charAt(0));
        }
        return nm.toString().equals(s);
    }
}