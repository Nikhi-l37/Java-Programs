package Hacker_rank;
import java.util.*;
// Description : finding the second largest and second smallest substring in a String
class Second_larges_string
{
    public static void main(String args[])
    {

        List<String> Array_String = new ArrayList<>();      // Array list is created

        Scanner sc = new Scanner(System.in);             // scanner class is created 
        System.out.println();
        System.out.println("Enter a text:");
        String text = sc.nextLine();                     // input text is created
        System.out.println("Enter length of sustring : ");
        int l =  sc.nextInt();
        System.out.println();

        for(int i=0;i<text.length()-l;i++){
            Array_String.add(text.substring(i,i+l));
        }

        System.out.println(Array_String);

        Collections.sort(Array_String);

        if(Array_String.size() >= 2){

        
        System.out.println(Array_String.get(1));
        System.out.println(Array_String.get(Array_String.size()-2));
        }
        else
        {
            System.out.println("Size is less for text");
        }

    }
}