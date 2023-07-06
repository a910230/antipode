class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> lines = new ArrayList<String>();

        int startInd = 0;
        int curWidth = words[0].length() + 1;
        for (int i = 1; i < words.length; ++i) {
            if (curWidth + words[i].length() > maxWidth) {
                lines.add(line(words, startInd, i, maxWidth - curWidth + i - startInd));
                startInd = i;
                curWidth = 0;
            }
            curWidth += words[i].length() + 1;
        }
        lines.add(leftJustLine(words, startInd, words.length, maxWidth - curWidth + words.length - startInd));
        return lines;
    }

    private String line(String[] words, int begin, int end, int numSpace) {
        int numInterval = end - begin - 1;
        if (numInterval == 0) return leftJustLine(words, begin, end, numSpace);
        StringBuilder line = new StringBuilder();
        for (int i = 0; i < numInterval; ++i) {
            line.append(words[begin + i]);
            for (int j = 0; j < numSpace / numInterval; ++j) {
                line.append(' ');
            }
            if (i < numSpace % numInterval) line.append(' ');
        }
        line.append(words[end - 1]);
        return line.toString();
    }

    private String leftJustLine(String[] words, int begin, int end, int numSpace) {
        StringBuilder leftJustLine = new StringBuilder();
        for (; begin < end - 1; ++begin) {
            leftJustLine.append(words[begin]);
            leftJustLine.append(' ');
            --numSpace;
        }
        leftJustLine.append(words[begin]);
        for (int i = 0; i < numSpace; ++i) leftJustLine.append(' ');

        return leftJustLine.toString();
    }
}
