import java.lang.Math;
public class Happy_Number {

    public static void main(String args[])
    {
         int n = 12;

        while(n!=1 && n!=4)
        {

            n = fuction(n);
            
        }

        if(n==1){
            System.out.println("It is a happy number");
        }
        else
        {
            System.out.println("It is not a happy number");
        }
           
    }

    public static int fuction(int n)
    {
            int rev = 0;
            while(n!=0){

                int d = n % 10;
                rev = rev + (int)Math.pow(d, 2);

                n = n / 10;
            }
        return rev;
    }
}
