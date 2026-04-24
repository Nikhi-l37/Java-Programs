class Solution {
    public int visibleBuildings(int arr[]) {
        if (arr == null || arr.length == 0) {
            return 0;
        }

        int count = 1; // The first building always sees the sun
        int maxHeightSoFar = arr[0]; // Fix: Get the first element's value

        for (int i = 1; i < arr.length; i++) {
            // A building sees the sun if it's at least as tall as the max so far
            if (arr[i] >= maxHeightSoFar) {
                count++;
                maxHeightSoFar = arr[i];
            }
        }

        return count;
    }
}
