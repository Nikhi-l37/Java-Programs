package Hacker_rank;
import java.util.Scanner;
//description : with out using functions we should compare with two strings
public class pronlem1 {

    static boolean isAnagram(String a, String b) {

         a = a.toLowerCase();
         b = b.toLowerCase();
        
        char[] A  = a.toCharArray();
        char[] B  = b.toCharArray();
        char temp1,temp2;

        for(int i=0;i<A.length-1;i++){

            for(int j=0;j<A.length-1;j++){

                if(A[j]>A[j+1]){

                    temp1 = A[j+1];
                    A[j+1] = A[j];
                    A[j] = temp1;
                }
            }
        }

        for(int i=0;i<B.length-1;i++){

            for(int j=0;j<B.length-1;j++){

                if(B[j]>B[j+1]){

                    temp2 = B[j+1];
                    B[j+1] = B[j];
                    B[j] = temp2;
                }
            }
        }

            //for(int i=0;i<A.length-1;i++){

              //  if(A[i] != B[i])
               // {
                 //   return false;

               //// }
          //  }
   

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









