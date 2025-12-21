package Hacker_rank;
import java.util.*;
import java.util.regex.*;


public class validatin_string {
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int testcases = Integer.parseInt(scan.nextLine());
        String pattern[] = new String[testcases];


        for(int i=0;i<testcases;i++)
        {
            pattern[i] = scan.nextLine().trim();
        }

           for(String word :pattern){

            try{
                Pattern.compile(word);
                System.out.println("Valid");
            }
            catch(PatternSyntaxException e)
            {
                System.out.println();
            }
        }

            }

        }



    
    

