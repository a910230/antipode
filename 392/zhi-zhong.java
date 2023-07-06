class Solution {
    public boolean isSubsequence(String s, String t) {
        int sLen = s.length(), tLen = t.length();
        if (sLen == 0) return true;
        if (sLen > tLen) return false;
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        int i = 0;
        for (int j = 0; j < tLen; ++j) {
            if (tArray[j] == sArray[i]) ++i;
            if (i == sLen) return true;
        }
        return false;
    }
}
