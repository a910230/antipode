class Solution {
    public int myAtoi(String s) {
        int len = s.length();
        if (len == 0) return 0;
        
        int i = 0;
        for (; i < len; ++i) {
            if (s.charAt(i) != ' ') break;
        }
        if (i == len) return 0;
        
        int val = 0;
        boolean negative = false;
        int bound = Integer.MAX_VALUE / 10;
        
        if (s.charAt(i) == '+') ++i;
        else if (s.charAt(i) == '-') {
            negative = true;
            ++i;
        }
        
        for (; i < s.length(); ++i) {
            int digit = s.charAt(i) - '0';
            if (digit < 0 || digit > 9) return negative? -val: val;
            
            if (val > bound) return negative? Integer.MIN_VALUE: Integer.MAX_VALUE;
            if (val == bound) {
                if (negative && digit >= -(Integer.MIN_VALUE % 10)) return Integer.MIN_VALUE;
                if (!negative && digit >= Integer.MAX_VALUE % 10) return Integer.MAX_VALUE;
            }
            val = val * 10 + digit;
        }
        return negative? -val: val;
    }
}
