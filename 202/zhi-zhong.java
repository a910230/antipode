class Solution {
    public boolean isHappy(int n) {
        Set<Integer> family = new HashSet<Integer>();
        while (family.add(n)) { // eturn false if n exists
            n = next(n);
        }
        
        return n == 1;
    }        
    
    private int next(int n) {
        int ret = 0;
        while (n != 0) {
            ret += (n % 10) * (n % 10);
            n /= 10;
        }
        return ret;
    }
}
