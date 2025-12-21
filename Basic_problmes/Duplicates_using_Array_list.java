import java.util.*;
public class Duplicates_using_Array_list {
    public static void main(String args[]){
        List<Integer> array = new ArrayList<>();
        List<Integer> duplicate_array = new ArrayList<>();


        Scanner scan = new Scanner(System.in);
        System.out.println();
        System.out.println("Enter the size of the array");

        int n = scan.nextInt();


        for(int i =0;i<n;i++){
            array.add(scan.nextInt());
        }

        Collections.sort(array);

        for(int i=0;i<n;i++){

            for(int j=i+1;j<n;j++){

            if(array.get(i).equals(array.get(j)))
            {
                int num = array.get(i);
                if(!duplicate_array.contains(num))
                {
                     duplicate_array.add(num);
                }
                
            }
        }

    }
        System.out.println(duplicate_array);


        System.out.println("Elements in the array : "+array);






    }
    
}
