public class prime1 {
    int count=0;
    public static void main(String args[]){

        int array[] = {1,2,3,4,5,6,7,8,9,10};
        int n = array.length;
         int count;

        for(int i = 0;i<n;i++)
        {
           count =  prime(array[i]);
            
            if (count==2)
            {
                 System.out.println(array[i]);

            }
        }
        }

        static int prime(int num)
        {
            int count=0;
            for(int j=1;j<=num;j++)
            {
                if(num%j==0)
                {
                count++;
                }
            }
            return count;
        }

    }
    

