import java.util.*;

class Solution {
    public long[] distance(int[] nums) {
        int n = nums.length;
        long[] res = new long[n];
        Map<Integer, List<Integer>> map = new HashMap<>();

        // Group indices by their value
        for (int i = 0; i < n; i++) {
            map.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
        }

        // Calculate distances for each unique value
        for (List<Integer> indices : map.values()) {
            int size = indices.size();
            if (size <= 1) continue;

            // Calculate total sum of indices to help with suffix sums
            long totalSum = 0;
            for (int index : indices) {
                totalSum += index;
            }

            long prefixSum = 0;
            for (int i = 0; i < size; i++) {
                long currentIdx = indices.get(i);
                
                // Sum of distances = (Right side) + (Left side)
                // Right side: (TotalSum - PrefixSum - currentIdx) - (currentIdx * remaining count)
                // Left side: (currentIdx * current count) - PrefixSum
                
                long countLeft = i;
                long countRight = size - 1 - i;
                long suffixSum = totalSum - prefixSum - currentIdx;

                res[(int)currentIdx] = (currentIdx * countLeft - prefixSum) + 
                                       (suffixSum - currentIdx * countRight);

                prefixSum += currentIdx;
            }
        }

        return res;
    }
}
