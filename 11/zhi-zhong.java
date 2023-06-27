// Optimization needed

class Solution {
    public int maxArea(int[] height) {
        Map<Integer, int[]> hMap = new TreeMap<>(Collections.reverseOrder());
        for (int i = 0; i < height.length; ++i) {
            if (hMap.containsKey(height[i])) hMap.get(height[i])[1] = i;
            else {
                int[] pos = new int[]{i, i};
                hMap.put(height[i], pos);
            }
        }
        
        int lPos = height.length;
        int rPos = -1;
        int lMost = lPos;
        int rMost = rPos;
        int area = -1;
        
        for (Map.Entry<Integer, int[]> entry: hMap.entrySet()) {
            int[] pos = entry.getValue();
            lMost = Math.min(lMost, pos[0]);
            rMost = Math.max(rMost, pos[1]);
            int curArea = (rMost - lMost) * entry.getKey();
            
            if (curArea > area) {
                lPos = lMost;
                rPos = rMost;
                area = curArea;
            }
        }
        
        return area;
    }
}
