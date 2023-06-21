// Can be optimized

class Solution {
    public boolean isPalindrome(String s) {        
        String sSimp = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        int l = sSimp.length();
        
        
        if (sSimp.isEmpty()) return true;

        for (int i = 0; i < l / 2; ++i) {
            if (sSimp.charAt(i) != sSimp.charAt(l - 1 - i)) return false;
        }
        return true;
    }
}
