package Hacker_rank;
import java.util.*;
// Description : Finding the smallest and largest substring in a string 

public class Str3 {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0,k);
        String largest = s.substring(0,k) ;
        
        for(int i = 1;i<=s.length()-k;i++){

            String sub  = s.substring(i,i+k);

            if(sub.compareTo(largest)>0){
                largest = sub;
            }

            
            if(sub.compareTo(smallest)<0){
                smallest = sub;
            }
        }
        

        
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
      
        System.out.println(getSmallestAndLargest(s, k));

        String s1 = scan.next();

        System.out.println(s1.substring(0,1).toUpperCase()+ s1.substring(1));
        scan.close();




    }
}
