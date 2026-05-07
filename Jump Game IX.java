class Solution {
    public int[] maxValue(int[] nums) {
        int n = nums.length;
        int[] suffMin = new int[n + 1];
        suffMin[n] = Integer.MAX_VALUE;
        for (int i = n - 1; i >= 0; i--) {
            suffMin[i] = Math.min(suffMin[i + 1], nums[i]);
        }

        int[] ans = new int[n];
        int segStart = 0;
        int segMax = nums[0];
        for (int i = 0; i < n; i++) {
            segMax = Math.max(segMax, nums[i]);
            // Close the segment if no inversion can cross between i and i+1
            if (segMax <= suffMin[i + 1]) {
                for (int k = segStart; k <= i; k++) ans[k] = segMax;
                segStart = i + 1;
                segMax = (i + 1 < n) ? nums[i + 1] : 0;
            }
        }
        return ans;
    }
}
