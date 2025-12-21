package Hacker_rank;
import java.io.*;
import java.util.*;
// Descripotion : converting the frist letter into capital letter 

public class Str1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        // 1. Sum of lengths
        System.out.println(s1.length() + s2.length());

        // 2. Lexicographical comparison
        if (s1.compareTo(s2) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        // 3. Capitalize first letter of both strings
        String cap_s1 = s1.substring(0, 1).toUpperCase() + s1.substring(1);
        String cap_s2 = s2.substring(0, 1).toUpperCase() + s2.substring(1);

        System.out.println(cap_s1 + " " + cap_s2);
    }
}
