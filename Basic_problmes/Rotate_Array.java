import java.util.*;
public class Rotate_Array {
    public static void main(String args[])
    {

        int[] array = {1,2,3,4,5};
        int n = array.length;

        for(int i=0;i<n/2;i++)
        {
            int temp = array[i];
            array[i] = array[n-i-1];
            array[n-i-1] = temp;
            System.out.println(Arrays.toString(array));
        }
       

    }
    
}
