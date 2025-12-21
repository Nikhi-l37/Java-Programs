package Hacker_rank;
// Desciption : when your are comparing the strings try to use (a.equals(b)) it will give efficent output.
import java.util.*;

public class problem {

    static boolean isAnagram(String a, String b) {

        char[] A  = a.toCharArray();
        char[] B  = b.toCharArray();

        Arrays.sort(A);
        Arrays.sort(B);

        a = new  String(A);
        b = new  String(B);               

        if(a.equals(b)){
            return true;
        }
        else {
            return false;
        }
    
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}