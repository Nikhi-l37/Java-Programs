package Hacker_rank;

import java.util.*;

public class practise {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in); 
        System.out.println();
        String s = sc.nextLine();

        String[] clean_string = s.split("[^a-zA-Z]+") ;

        for(int i=0;i<clean_string.length;i++){
            if(!clean_string[i].isEmpty())
            {
            System.out.println(clean_string[i]);
            }

        }   

        // if you want to add the spaces in between the words then use the join function
        String without_space_in_string = String.join(" ",clean_string);
        System.out.println(without_space_in_string);



    }
    
}
