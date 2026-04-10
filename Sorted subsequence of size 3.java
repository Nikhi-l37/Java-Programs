import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> find3Numbers(int[] arr) {
        int n = arr.length;
        ArrayList<Integer> result = new ArrayList<>();
        
        if (n < 3) return result;

        int[] leftMin = new int[n];
        leftMin[0] = arr[0];
        for (int i = 1; i < n; i++) {
            leftMin[i] = Math.min(leftMin[i - 1], arr[i]);
        }

        int[] rightMax = new int[n];
        rightMax[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], arr[i]);
        }

        for (int j = 1; j < n - 1; j++) {
            if (arr[j] > leftMin[j - 1] && arr[j] < rightMax[j + 1]) {
                result.add(leftMin[j - 1]);
                result.add(arr[j]);
                result.add(rightMax[j + 1]);
                return result;
            }
        }

        return result;
    }
}
