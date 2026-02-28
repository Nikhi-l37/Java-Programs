import java.util.ArrayList;

class Solution {
    public static ArrayList<Integer> findClosestPair(int arr1[], int arr2[], int x) {
        int n = arr1.length;
        int m = arr2.length;
        
        // Initialize variables to track the closest difference and the resulting pair
        int diff = Integer.MAX_VALUE;
        int res_left = 0, res_right = 0;
        
        // Two pointers: left starts at the beginning of arr1, right at the end of arr2
        int left = 0;
        int right = m - 1;
        
        while (left < n && right >= 0) {
            int currentSum = arr1[left] + arr2[right];
            
            // Check if this pair is closer to x than the previous best
            if (Math.abs(currentSum - x) < diff) {
                res_left = arr1[left];
                res_right = arr2[right];
                diff = Math.abs(currentSum - x);
            }
            
            // If the sum is more than x, move to smaller values in arr2
            if (currentSum > x) {
                right--;
            } 
            // If the sum is less than x, move to larger values in arr1
            else {
                left++;
            }
        }
        
        // Prepare the result list
        ArrayList<Integer> result = new ArrayList<>();
        result.add(res_left);
        result.add(res_right);
        return result;
    }
}
