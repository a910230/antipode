class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> freq1 = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums1.length; ++i) gain(freq1, nums1[i]);
        
        Map<Integer, Integer> freq1And2 = new HashMap<Integer, Integer>();
        int len = 0;
        for (int i = 0; i < nums2.length; ++i) {
            int key = nums2[i];
            if (lose(freq1, key)) {
                gain(freq1And2, key);
                ++len;
            }
        }
        
        int[] ret = new int[len];
        int cur = 0;
        for (Integer num: freq1And2.keySet()) {
            int count = freq1And2.get(num);
            for (int i = 0; i < count; ++i) {
                ret[cur + i] = num;
            }
            cur += count;
        }
        
        return ret;
    }
    
    private void gain(Map<Integer, Integer> map, int key) {
        if (map.containsKey(key)) {
            map.replace(key, map.get(key) + 1);
        } else {
            map.put(key, 1);
        }
    }
    
    private boolean lose(Map<Integer, Integer> map, int key) {
        if (map.containsKey(key)) {
            int val = map.get(key);
            if (val > 0) {
                map.replace(key, val - 1);
                return true;
            }
        }
        return false;
    }
}
