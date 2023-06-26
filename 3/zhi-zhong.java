class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        Set<Character> sub = new HashSet<Character>();
        int l = 0;
        for (int r = 0; r < s.length(); ++r) {
            Character c = s.charAt(r);
            if (sub.contains(c)) {
                max = Math.max(max, r - l);
                while (s.charAt(l) != c) {
                    sub.remove(s.charAt(l));
                    ++l;
                }
                ++l;
            } else sub.add(c);
        }
        return Math.max(max, s.length() - l);
    }
}
