// package DSA;
import java.util.*;
public class Rotating_Array {
    public static void main(String args[])
    {
        int arr[] = {1,2,3,4,5};
        int n = arr.length;
        System.out.println();
        System.out.println("Sorting the array");
        Scanner scan = new Scanner(System.in);


        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }

        }
        for(int num:arr){
        System.out.println(num);
        }
        System.out.println();
        System.out.println("Reverse of an array");
        
        for(int i=0;i<n/2;i++)
        { 
            int temp = arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1] = temp;
        }
    
            for(int num:arr){
                System.out.print(num+" ");
        }   

        System.out.println();
        System.out.println("Reversing the array in specific range:");
        System.out.println();
        int k = scan.nextInt();

        for(int i=k;i<n-1;i++)
        {
            for(int j=k;j<n-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }        System.out.println();
                for(int num:arr){
                System.out.print(num+" ");
                }   
    
    
    
    
    }
    
}
