package Hacker_rank;

public class related_binary_problem {


    
    public static int[]  calculation(int array[],int target){


        int first_value =  left_ocur(array, target);
        int second_value = right_ocur(array, target);

        return new int[]{first_value,second_value};
    }


    public static int left_ocur(int array[],int target)
    {
        int start = 0;
        int end = array.length-1;
        int ans = -1;

    
        while(start<=end){

            int mid = start+(end-start)/2;

            if(array[mid]==target)
            {
                end = mid-1;
                ans = mid;
            }
            else if(array[mid]<target){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return ans;
    }


    public static int  right_ocur(int array[],int target){

        int start = 0;
        int end = array.length-1;
        int ans = -1;

          while(start<=end){

            int mid = start+(end-start)/2;

            if(array[mid]==target)
            {
                start = mid+1;
                ans = mid;
            }
            else if(array[mid]<target){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }

        return ans;
    }


    

    public static void main(String args[])
    {
        int array[] = {1,2,2,2,3,4,5};
        int target = 2;

        int result[] = calculation(array,target);

        for(int ans : result)
        {
            System.out.print(ans+" ,");
        }
        System.out.print("end");

    }
}
