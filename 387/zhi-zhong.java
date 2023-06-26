class Solution {
    public int firstUniqChar(String s) {
        int[] unique = new int[26];
        for (int i = 0; i < s.length(); ++i) {
            int code = charToInt(s.charAt(i));
            if (unique[code] == 0) unique[code] = i + 1;
            else unique[code] = -1;
        }
        
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < 26; ++i) {
            int pos = unique[i];
            if (pos > 0 && pos < min) min = pos;
        }
        
        if (min == Integer.MAX_VALUE) return -1;        
        return min - 1;
    }
    
    private int charToInt(char c) {
        // c must be a lowercase English letter
        return c - 'a';
    }
}
