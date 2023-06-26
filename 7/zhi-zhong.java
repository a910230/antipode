class Solution {
    public int reverse(int x) {
        if (x == Integer.MIN_VALUE) return 0;
        int sign = 1;
        if (x < 0) {
            sign = -1;
            x = -x;
        }
        
        int rev = 0;
        for (int i = 0; i < 9; ++i) {
            rev = rev * 10 + x % 10;
            x /= 10;
            if (x == 0) return sign * rev;
        }
        if (rev > Integer.MAX_VALUE / 10) return 0;
        if (rev == Integer.MAX_VALUE / 10 && x > Integer.MAX_VALUE % 10) return 0;
        return sign * (rev * 10 + x);
    }
}
