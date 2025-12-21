package Hacker_rank;
import java.util.regex.*;

public class practise1 {
    public static void main(String[] args) {
        String input = "Hello";

        // Step 1: Compile the regex
        Pattern pattern = Pattern.compile("([A-Z])(.+)");

        // Step 2: Create Matcher
        Matcher matcher = pattern.matcher(input);

        // Step 3: Check if matches
        if (matcher.matches()) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }
}
