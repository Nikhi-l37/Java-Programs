class Solution {
    public ArrayList<String> graycode(int n) {
        // Base case: n = 1 returns ["0", "1"]
        if (n == 1) {
            ArrayList<String> base = new ArrayList<>();
            base.add("0");
            base.add("1");
            return base;
        }

        // Recursive call to get code for n-1
        ArrayList<String> prev = graycode(n - 1);
        ArrayList<String> result = new ArrayList<>();

        // Prefix existing sequence with '0'
        for (int i = 0; i < prev.size(); i++) {
            result.add("0" + prev.get(i));
        }

        // Prefix reverse sequence with '1'
        for (int i = prev.size() - 1; i >= 0; i--) {
            result.add("1" + prev.get(i));
        }

        return result;
    }
}
