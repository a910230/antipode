class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] nums1Copy = new int[m];
        for (int k = 0; k < m; ++k) {
            nums1Copy[k] = nums1[k];
        }
            
        int i = 0;
        int j = 0;
        while (i < m && j < n) {
            if (nums1Copy[i] < nums2[j]) {
                nums1[i + j] = nums1Copy[i];
                ++i;
            } else {
                nums1[i + j] = nums2[j];
                ++j;
            }
        }
        
        if (i == m) {
            for (; j < n; ++j) {
                nums1[i + j] = nums2[j];
            }
        } else if (j == n) {
            for (; i < m; ++i) {
                nums1[i + j] = nums1Copy[i];
            }
        }
    }
}
