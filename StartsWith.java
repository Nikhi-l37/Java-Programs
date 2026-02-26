public class PrefixCheck {
    public static void main(String[] args) {
        String url1 = "https://google.com";
        String url2 = "http://example.com";

        // Basic check
        System.out.println(url1.startsWith("https")); // Output: true
        System.out.println(url2.startsWith("https")); // Output: false
    }
}
