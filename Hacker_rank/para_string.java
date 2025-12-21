package Hacker_rank;
import java.util.*;

public class para_string {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
         
        System.out.println();
        String s = sc.nextLine();
        String[] parts = s.split("[^a-zA-Z]");

        String result = String.join(" ", parts);
        int count = 0;
                System.out.println(parts);


        for(String word : parts){
            if(!word.isEmpty()){
                count = count+1;
            }
        }

        System.out.println(count);

        
        for(String word : parts){
            if(!word.isEmpty()){
                System.out.println(word);
            }
        }




    }
}
