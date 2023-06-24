class Solution {
    public void reverseString(char[] s) {
        int l = s.length;
        char c;
        for (int i = 0; i < l / 2; ++i) {
            c = s[i];
            s[i] = s[l - 1 - i];
            s[l - 1 - i] = c;
        }
    }
}
