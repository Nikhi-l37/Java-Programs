import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String s = "software";
        
        // 1. Convert string to char array
        char[] chars = s.toCharArray();
        
        // 2. Sort the array (O(N log N))
        Arrays.sort(chars);
        
        // 3. Convert back to string
        String sorted = new String(chars);
        
        System.out.println(sorted); // Output: aeofqrstw
    }
}
