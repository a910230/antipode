class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        Map<Character, Integer> freq = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); ++i) {
            char c = s.charAt(i);
            if (freq.containsKey(c)) freq.replace(c, freq.get(c) + 1);
            else freq.put(c, 1);
        }
        
        for (int i = 0; i < t.length(); ++i) {
            char c = t.charAt(i);
            if (freq.containsKey(c)) {
                if (freq.get(c) > 0) freq.replace(c, freq.get(c) - 1);
                else return false;
            }
            else return false;
        }
        return true;
    }
}
