class Solution {
    public int hIndex(int[] citations) {
        int max = citations.length;
        int[] count = new int[max + 1];
        for (int c: citations) {
            if (c > max) {
                ++count[max];
                continue;
            }
            ++count[c];
        }

        int h = 0;
        for (int i = max; i > -1; --i) {
            h += count[i];
            if (h >= i) return i;
        }
        return 0;
    }
}
