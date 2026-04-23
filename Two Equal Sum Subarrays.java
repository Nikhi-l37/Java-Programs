class Solution {
    public boolean canSplit(int arr[]) {
        long totalSum = 0;
        
        // Step 1: Calculate the total sum of the array
        for (int num : arr) {
            totalSum += num;
        }
        
        // Step 2: If the total sum is odd, it's impossible to split into two equal integers
        if (totalSum % 2 != 0) {
            return false;
        }
        
        long target = totalSum / 2;
        long currentRunningSum = 0;
        
        // Step 3: Iterate and find if any prefix sum equals the target
        for (int num : arr) {
            currentRunningSum += num;
            
            if (currentRunningSum == target) {
                return true;
            }
            
            // Optimization: If we exceed the target, no need to keep looking
            if (currentRunningSum > target) {
                return false;
            }
        }
        
        return false;
    }
}
