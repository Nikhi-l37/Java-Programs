import java.util.*;
// Descripotion : Finding the duplicates in an array 
public class Duplicates {
    public static void main(String args[])
    {
        Scanner scan  = new Scanner(System.in);

        int[] array = {1,2,2,2,2,11,11,11,0,0,4,5,5,1,10,9};        
        
        boolean visited[] = new boolean[array.length];

        for(int i=0;i<array.length;i++)
        {
            if(visited[i]){
                continue;
            }
            
            int count = 1;
            
            for(int j=1+i;j<array.length;j++){
                
                if(array[i]==array[j]){
                    visited[j]=true;
                     count++;
                }

            }

            if(count>1){
                System.out.println(array[i]);
            }

        }
       




    }
}
