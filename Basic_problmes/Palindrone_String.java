import java.util.*;

public class Palindrone_String {
     public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        boolean check = true;




        for(int i=0;i<A.length()/2;i++)
        {
            if(A.charAt(i) != A.charAt(A.length()-1-i) ){

                check = false;
                break;
            }
            
          }   

      if(check){
        System.out.println("Yes");
      }
      else
      {
       System.out.println("No");
      }

  }
}



