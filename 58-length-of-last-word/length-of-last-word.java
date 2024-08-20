class Solution {
    public int lengthOfLastWord(String s) {
    //     s = s.trim();
        
    //     int length = 0;
    //     for (int i = s.length() - 1; i >= 0; i--) {
    //         if (s.charAt(i) != ' ') {
    //             length++;
    //         }
    //         else if (length > 0) {
    //             break;
    //         }
    //     }
        
    //     return length;
    // }
   // }
   String n="";
    String[] arr=s.split(" ");
    n=arr[arr.length-1];
    return n.length();
}
}
    