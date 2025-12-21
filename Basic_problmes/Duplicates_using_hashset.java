import java.util.*;
class Duplicates_using_hash_set
{
    public static void main(String args[])
    {

        int[] array = {1,2,2,36,7,3,3,4,3,4,5,6,6,7,7,1,8,9,1,9};
        Set<Integer> seen = new HashSet<>();
        Set<Integer> Duplicates = new HashSet<>();

        for(int num : array){
            if(!seen.add(num)){
                Duplicates.add(num);
            }
        }
        
        System.out.println(Duplicates);
        System.out.println(seen);





    }

}