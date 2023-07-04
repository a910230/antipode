class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1) return s;

        int groupLen = 2 * (numRows - 1);
        StringBuilder zig = new StringBuilder();

        for (int j = 0; j < s.length(); j += groupLen) zig.append(s.charAt(j));
        for (int i = 1; i < numRows - 1; ++i) {
            int j = groupLen - i;
            for (; j < s.length(); j += groupLen) {
                zig.append(s.charAt(j - groupLen + 2 * i));
                zig.append(s.charAt(j));
            }
            j += -groupLen + 2 * i;
            if (j < s.length()) zig.append(s.charAt(j));
        }
        for (int j = numRows - 1; j < s.length(); j += groupLen) zig.append(s.charAt(j));

        return zig.toString();
    }
}
