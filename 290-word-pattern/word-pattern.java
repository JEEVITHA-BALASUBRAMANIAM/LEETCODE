class Solution {
    public boolean wordPattern(String pattern, String s) {
         String[] words = s.split(" ");
        int n = pattern.length();

        if (n != words.length) return false;

        HashMap<Character, String> charToWord = new HashMap<>();
        HashMap<String, Character> wordToChar = new HashMap<>();

        for (int i = 0; i < n; i++) {
            char c = pattern.charAt(i);
            String word = words[i];

            if (charToWord.containsKey(c)) {
                if (!charToWord.get(c).equals(word)) return false;
            } else {
                charToWord.put(c, word);
            }

            if (wordToChar.containsKey(word)) {
                if (!wordToChar.get(word).equals(c)) return false;
            } else {
                wordToChar.put(word, c);
            }
        }

        return true;
    }
}