class Solution {
    public boolean isSorted(int[] arr) {
        // code here
        int a[] = new int[arr.length];
        
        for(int i=0;i<arr.length;i++){
            a[i] = arr[i];
        }
        
        Arrays.sort(a);
        
        for(int i=0;i<arr.length;i++){
            if(arr[i] != a[i]){
                return false;
            }
        }
        
        return true;
    }
}
