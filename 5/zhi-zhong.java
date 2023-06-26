class Solution {
    public String longestPalindrome(String s) {
        int len = s.length();
        int subLen = 1;
        String subStr = s.substring(0, 1);
        
        // Odd palindrome
        for (int i = 1; i < len; ++i) {
            int lExt = i;
            int rExt = len - 1 - i;
            int maxExt = Math.min(lExt, rExt); // The longest possible extension at i
            if (rExt * 2 + 1 <= subLen) break; // No enough space at the right. No need to check further.
            
            int curLen = 1;
            boolean full = true;
            for (int j = 1; j < maxExt + 1; ++j) {
                if (s.charAt(i - j) == s.charAt(i + j)) curLen += 2;
                else {
                    if (curLen > subLen) {
                        subLen = curLen;
                        subStr = s.substring(i - j + 1, i + j);
                    }
                    full = false;
                    break;
                }
            }
            if (full) {
                subLen = curLen; // Guaranteed curLen > subLen
                subStr = s.substring(i - maxExt, i + maxExt + 1);
            }
        }
        
        // Even palindrome
        for (int i = 0; i < len - 1; ++i) {
            if (s.charAt(i) != s.charAt(i + 1)) continue;
            int lExt = i;
            int rExt = len - 2 - i;
            int maxExt = Math.min(lExt, rExt); // The longest possible extension at i, i + 1
            if (lExt * 2 + 2 <= subLen) continue; // No enough space at the left
            if (rExt * 2 + 2 <= subLen) break; // No enough space at the right. No need to check further.
            
            int curLen = 2;
            boolean full = true;
            for (int j = 1; j < maxExt + 1; ++j) {
                if (s.charAt(i - j) == s.charAt(i + 1 + j)) curLen += 2;
                else {
                    if (curLen > subLen) {
                        subLen = curLen;
                        subStr = s.substring(i - j + 1, i + 1 + j);
                    }
                    full = false;
                    break;
                }
            }
            if (full) {
                subLen = curLen; // Guaranteed curLen > subLen
                subStr = s.substring(i - maxExt, i + maxExt + 2);
            }
        }
        
        return subStr;
    }
}
