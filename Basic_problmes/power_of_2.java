import java.util.Scanner;
public class power_of_2 
{
    public static void main(String args[])
    {
        System.out.println("Checking the power of 2");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean is_power = false;

        for(int i=0;i<5;i++)
        {
           int  k = (int)Math.pow(2,i);
            if(k == n)
            {
                is_power = true;
            }
        }
    
            
            if(is_power){
                System.out.println("It is power of 2");
            }
            else{
                System.out.println("It is not a power of a 2");
            }

        }
    
    
}
