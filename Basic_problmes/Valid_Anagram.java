import java.util.Scanner;
import java.util.Arrays;


class Valid_Anagram
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a first string:");
        String s1 = sc.nextLine();

        System.out.println();
        System.out.println("Enter a second string:");
        String s2 = sc.nextLine();

        System.out.println();
        System.out.println(s1);
        System.out.println(s2);

        if(s1.length()!=s2.length()){
            System.out.println("It is not a Valid_Anagram");
        }

        char[] arr1 = s1.toCharArray();   // These line stores array into char array
        char[] arr2 = s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if(Arrays.equals(arr1,arr2))
        {
            System.out.println("It is  a Valid_Anagram");

        }
        else
        {

             System.out.println("It is  not a  Valid_Anagram");

        }

    }
}