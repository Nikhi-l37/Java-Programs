package Hacker_rank;
import java.io.*;
import java.util.*;


public class Duplicate_in_string_in_para {

    public static void main(String[] args) {
        
        

    Scanner scan = new Scanner(System.in);

        int n = scan.nextInt(); // number of strings
        scan.nextLine(); // consume leftover newline

        String[] cleanedResults = new String[n]; // to store all cleaned outputs

        for (int line = 0; line < n; line++) {
            
            String data = scan.nextLine();
            String[] words = data.split("[^a-zA-Z]+"); // split by non-letters
            boolean visited[] = new boolean[words.length];

            StringBuilder result = new StringBuilder();

            for (int i = 0; i < words.length; i++) {
                if (words[i].isEmpty() || visited[i]) continue; // skip empty or already visited

                result.append(words[i]); // add word

                // mark duplicates (case-insensitive)
                for (int j = i + 1; j < words.length; j++) {
                    if (words[i].equalsIgnoreCase(words[j])) {
                        visited[j] = true;
                    }
                }

                result.append(" ");
            }

            cleanedResults[line] = result.toString().trim();
        }

        // Print all cleaned strings after processing all inputs
        for (String cleaned : cleanedResults) {
            System.out.println(cleaned);
        }
    
    
    }
}