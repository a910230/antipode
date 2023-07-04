class Solution {
    public int lengthOfLastWord(String s) {
        int lastLetter = s.length() - 1;
        while (s.charAt(lastLetter) == ' ') --lastLetter;

        int lastSpace = lastLetter - 1;
        while (lastSpace > -1 && s.charAt(lastSpace) != ' ') --lastSpace;
        return lastLetter - lastSpace;
    }
}
