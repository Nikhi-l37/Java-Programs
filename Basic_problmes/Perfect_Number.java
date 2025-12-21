public class Perfect_Number {
    public static void main(String arg[])
    {
        int n = 496;
        int factor_n = 0;
        

        for (int i=1;i<n;i++)
        {
            if(n%i==0){
            factor_n = factor_n + i; 
            System.out.println(i);
            
            }
        }
        if(factor_n==n){
            System.out.println("It is a perfect number");
        }
        else
        {
            System.out.println("It is a not a perfect number");

        }
    }
}
