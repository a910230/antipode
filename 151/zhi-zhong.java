class Solution {
    public String reverseWords(String s) {
        int lastSpace = s.length() - 1;
        while (s.charAt(lastSpace) == ' ') --lastSpace;
        ++lastSpace;

        StringBuilder rev = new StringBuilder();
        for (int secondLastSpace = lastSpace - 1; secondLastSpace > -1; --secondLastSpace) {
            if (s.charAt(secondLastSpace) != ' ') continue;
            if (rev.length() != 0) rev.append(' ');
            rev.append(s.substring(secondLastSpace + 1, lastSpace));
            lastSpace = secondLastSpace - 1;
            while (lastSpace > -1 && s.charAt(lastSpace) == ' ') --lastSpace;
            ++lastSpace;
            secondLastSpace = lastSpace;
        }
        if (lastSpace == 0) return rev.toString();

        if (rev.length() != 0) rev.append(' ');
        rev.append(s.substring(0, lastSpace));

        return rev.toString();
    }
}
