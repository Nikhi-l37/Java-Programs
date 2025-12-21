package Hacker_rank;
    import java.util.Scanner;


public class str2 {


    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        for(int i = 0 ;i<k;i++){
            char s1 = s.charAt(i);  
                    System.out.print(s1);
        }
        
        
        
        for(int i = s.length()-k ;i<s.length();i++){
            char s2 = s.charAt(i);  
                    System.out.print(s2);
        }
        
      
        
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
    
